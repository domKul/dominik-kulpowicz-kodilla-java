package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="INVOICE")
public class Invoice {

    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;

    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name="INVOICE_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name= "INVOICE_NUMBER",unique = true)
    public String getNumber() {
        return number;
    }
    @OneToMany(targetEntity = Item.class,
    mappedBy = "invoice",
    cascade = CascadeType.ALL)
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
