package com.example.danquah0246.database.entity;

public class Product {
    private int id;
    private String name;
    private double price;


    Product(int id, String name, double price){
        this.id = id;
        this.name= name;
        this.price = price;

    }
    public int getId(){
        return  this.id;
    }
    public String getName(){
        return  this.name;
    }
    public double getPrice(){
        return  this.price;
    }
}
