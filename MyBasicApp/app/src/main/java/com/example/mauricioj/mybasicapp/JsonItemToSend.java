package com.example.mauricioj.mybasicapp;

/**
 * Created by MauricioJ on 5/2/2018.
 */

public class JsonItemToSend {
    private String Name;
    private int NumberOfItems;
    private String Value;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumberOfItems() {
        return NumberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        NumberOfItems = numberOfItems;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }



    public JsonItemToSend(String name, int numberOfItems, String value) {
        Name = name;
        NumberOfItems = numberOfItems;
        Value = value;
    }

    @Override
    public String toString() {
        return "JsonItemToSend{" +
                "Name='" + Name + '\'' +
                ", NumberOfItems=" + NumberOfItems +
                ", Value='" + Value + '\'' +
                '}';
    }
}
