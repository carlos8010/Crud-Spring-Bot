package com.pruebakomet.mvcpruebakomet.models;

public class FlorNP {
    private String name;
    private Double price;

    public FlorNP(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}