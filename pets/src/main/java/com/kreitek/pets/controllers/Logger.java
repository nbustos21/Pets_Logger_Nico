package com.kreitek.pets.controllers;

public class Logger {
    private static int counter = 0;
    public static void debug(String result){
        counter+=1;
        System.out.println("[debug]["+counter+"]"+result);
    }
}
