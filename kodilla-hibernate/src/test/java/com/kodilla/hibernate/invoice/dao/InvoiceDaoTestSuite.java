package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given

        Invoice invoice = new Invoice("12");
        Invoice invoice1 = new Invoice("2");

        Item item = new Item(new BigDecimal(333.3),2);
        Item item1 = new Item(new BigDecimal(333.3),1);
        Item item2 = new Item(new BigDecimal(553.3),1);
        Item item3 = new Item(new BigDecimal(33.3),28);

        Product product = new Product("Wykalaczki");
        Product product1 = new Product("IPhone6");
        Product product2 = new Product("Lenovo Legion");

        item.setProduct(product1);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice1);


        product1.getItems().add(item);
        product1.getItems().add(item1);
        product.getItems().add(item2);
        product2.getItems().add(item3);

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice1.getItems().add(item3);


        //When

        invoiceDao.save(invoice);
        int id = invoice.getId();
        invoiceDao.save(invoice1);
        int id1 = invoice1.getId();

        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertEquals(2,invoiceDao.count());
        //CleanUp
        invoiceDao.deleteById(id);
        invoiceDao.deleteById(id1);
    }
}
