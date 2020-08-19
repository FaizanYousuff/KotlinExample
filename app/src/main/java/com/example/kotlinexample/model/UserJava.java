package com.example.kotlinexample.model;

import com.example.kotlinexample.Mainkotlin;

public class UserJava {

    private String name;
    public static final String org = "Girmiti";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void calcAmt(){

        System.out.println("calling calcAmt from JAVA by passing   1 parameter " + Mainkotlin.calcAmt(100));
    }
}
