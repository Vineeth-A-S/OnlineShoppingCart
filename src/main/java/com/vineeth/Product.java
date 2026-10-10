package com.vineeth;

public class Product {
    private int id;
    private String name;
    private String category;
    private float price;
    private int inStock;

    public Product(int id, String name, String category, float price,int inStock) {
        this.inStock = inStock;
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString(){
        return "ID: "+id+", Name: "+name+", Category:"+category+", Price: "+price+", Instock: "+inStock;
    }
}
