package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://domkul.github.io/";
    private WebDriver driver;
    private Random generator;


    @BeforeEach
    public void initTest(){
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }
    @AfterEach
    public void cleanUpAfterTest(){
        driver.close();
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);

    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action, \"v1/task\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"v1/task\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"v1/task\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        final String LOGIN_MAIL = "dominik.kulpowicz@gmail.com";
        final String PASSWORD = "X4pfavsjkodilla";
            WebDriver trelloDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
            boolean result;

            trelloDriver.get(TRELLO_URL);
            trelloDriver.findElement(By.id("user")).sendKeys(LOGIN_MAIL);
            trelloDriver.findElement(By.id("login")).click();

            Thread.sleep(2000);
            trelloDriver.findElement(By.id("password")).sendKeys(PASSWORD);
            trelloDriver.findElement(By.id("login-submit")).click();

            Thread.sleep(7000);

            trelloDriver.findElements(By.xpath("//a[@class=\"board-tile\"]"))
                    .stream()
                    .filter(xpath -> xpath.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]")).size() > 0)
                    .forEach(WebElement::click);
            Thread.sleep(5000);

            result = trelloDriver.findElements(By.xpath("//span"))
                    .stream()
                    .anyMatch(match -> match.getText().equals(taskName));

            trelloDriver.close();
            return result;
    }

    private void deleteTaskFromCrudApp(String taskName) throws InterruptedException {
        final String XPATH_DELETE = ".//fieldset[@class=\"datatable__row-section datatable__row-section--button-section\"]/button[4]";
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(10000);
        List<WebElement> taskList = driver.findElements(By.xpath("//form[@class=\"datatable__row\"]"));
        for (WebElement task : taskList) {
            WebElement taskNameElement = task.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"));
            if (taskNameElement.getText().equals(taskName)) {
                WebElement deleteButton = task.findElement(By.xpath(XPATH_DELETE));
                deleteButton.click();
            }
        }
    }



    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        deleteTaskFromCrudApp(taskName);
        checkTaskExistsInTrello(taskName);
    }
}
