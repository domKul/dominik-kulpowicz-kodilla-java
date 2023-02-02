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

        Invoice invoice0 = new Invoice("invoice1");

        //When
        item0.setProduct(product0);
        item1.setProduct(product1);
        item2.setProduct(product2);

        invoice0.getItems().add(item0);
        invoice0.getItems().add(item1);
        invoice0.getItems().add(item2);

        invoiceDao.save(invoice0);

        //Then
        List<Invoice> invo = invoiceDao.findByNumber("invoice1");
        assertEquals(1,invo.size());

        //CleanUp
        int invoice0Id = invoice0.getId();
        invoiceDao.deleteById(invoice0Id);

    }

}
