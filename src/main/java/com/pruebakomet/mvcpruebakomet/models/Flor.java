package com.pruebakomet.mvcpruebakomet.models;


public class Flor {
    private String id;
    private String name;
    private Double price;

    public Flor(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    // getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
