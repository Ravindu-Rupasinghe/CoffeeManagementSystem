/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import javax.swing.JOptionPane;

/**
 *
 * @author ravindu
 */
public class Tables {

    public static void main(String args[]) {
        try {
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),status varchar(20));";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,status) values('Admin','admin@gmail.com','1234567890','LA','admin','true');";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200));";
            String productTable = "Create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200));";
            String billTable = "create table bill(id int primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200));";

            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin details added successfully!");
            DbOperations.setDataOrDelete(categoryTable, "Category Table created successfully!");
            DbOperations.setDataOrDelete(productTable, "Product Table created successfully!");
            DbOperations.setDataOrDelete(billTable, "Bill Table created successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
