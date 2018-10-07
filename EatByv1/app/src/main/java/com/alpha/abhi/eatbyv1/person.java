package com.alpha.abhi.eatbyv1;

public class person {
    //name and address string
    private String name;


    public person() {
      /*Blank default constructor essential for Firebase*/
    }
    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }}