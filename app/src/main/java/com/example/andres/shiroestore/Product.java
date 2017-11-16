package com.example.andres.shiroestore;

/**
 * Created by ANDRES on 15/11/2017.
 */

public class Product {
    private int id;
    private String name;
    private int category;
    private int price;
    private int cant;
    private String photo;
    private String detail;

    public Product(int id, String name, int category, int price, int cant, String photo, String detail) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.cant = cant;
        this.photo = photo;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
