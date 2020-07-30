package com.galvanize.menu;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double price;
    private Long calories;
    private String name;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public Long getCalories() { return calories; }

    public void setCalories(Long calories) { this.calories = calories; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
