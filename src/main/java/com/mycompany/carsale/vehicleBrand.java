/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carsale;

/**
 *
 * @author hussa
 */
public class vehicleBrand {
     String make;
    String model;
    String color;
    double enginSize;
    int mileage;
    int price;

    public vehicleBrand(double enginSize, int mileagge, int price) {
        this.enginSize = enginSize;
        this.mileage = mileage;
        this.price = price;
    }
    public vehicleBrand(String make,String model,String color){
    this.make=make;
    this.model=model;
    this.color=color;
    
    }
    public void car(String make,String model,String color){
         System.out.println("the "+make+" "+model+" with color "+color);
    }
    public void car0(double enginSize, int mileage, int price){
        System.out.println("has size "+enginSize+"  mileage "+mileage+" with price of "+price);
    } 
}
