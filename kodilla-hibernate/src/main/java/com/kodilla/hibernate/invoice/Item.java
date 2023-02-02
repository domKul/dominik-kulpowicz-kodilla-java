package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name= "ITEMS")
public class Item {
    private int id;
    private int quantity;
    private BigDecimal price;
    private BigDecimal value;
    private Product product;
    private Invoice invoice;

    public Item() {
    }

    public Item(int quantity, BigDecimal price, BigDecimal value) {
        this.quantity = quantity;
        this.price = price;
        this.value = value;
    }
     @Id
     @GeneratedValue
     @NotNull
     @Column(name="ITEM_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name= "ITEM_QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "ITEM_PRICE")
    public BigDecimal getPrice() {
        return price;
    }

     @Column(name = "ITEM_VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne(targetEntity = Product.class,
    cascade = CascadeType.MERGE)
    @JoinColumn(name="PRODUCTS_ID")
    public Product getProduct() {
        return product;
    }

    @ManyToOne
    @JoinColumn(name="INVOICE_NUMBER")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
