package com.wipro.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Item {
    private int id;
    private String name;
    private double price;

    @Autowired
    private Category category;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void display() {
        System.out.println("Item ID: " + id);
        System.out.println("Item Name: " + name);
        System.out.println("Item Price: " + price);
        System.out.println("Category ID: " + category.getCategoryId());
        System.out.println("Category Name: " + category.getCategoryName());
    }
}
