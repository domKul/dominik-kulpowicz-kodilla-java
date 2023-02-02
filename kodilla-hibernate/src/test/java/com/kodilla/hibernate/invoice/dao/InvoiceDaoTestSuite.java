package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product0 = new Product("productOne");
        Product product1 = new Product("productTwo");
        Product product2 = new Product("productThree");


        Item item0 = new Item(1,new BigDecimal(12),new BigDecimal(111));
        Item item1 = new Item(2,new BigDecimal(123),new BigDecimal(222));
        Item item2 = new Item(3,new BigDecimal(1234),new BigDecimal(3333));

        Invoice invoice0 = new Invoice("qwert1");

        //When
        productDao.save(product2);
        productDao.save(product0);
        productDao.save(product1);

        item0.setProduct(product0);
        item1.setProduct(product1);
        item2.setProduct(product2);

        itemDao.save(item0);
        itemDao.save(item1);
        itemDao.save(item2);

        invoice0.getItems().add(item0);
        invoice0.getItems().add(item1);
        invoice0.getItems().add(item2);

        invoiceDao.save(invoice0);
        //Then
        List<Invoice> invo = invoiceDao.findByNumber("qwert1");
        assertEquals(1,invo.size());

        //CleanUp
        int invoice0Id = invoice0.getId();
        int item0Id = item0.getId();
        int item1Id = item1.getId();
        int item2Id = item2.getId();
        int prod0Id = product0.getId();
        int prod1Id = product1.getId();
        int prod2Id = product2.getId();

        invoiceDao.deleteById(invoice0Id);
        itemDao.deleteById(item0Id);
        itemDao.deleteById(item1Id);
        itemDao.deleteById(item2Id);
        productDao.deleteById(prod0Id);
        productDao.deleteById(prod1Id);
        productDao.deleteById(prod2Id);





    }

}
