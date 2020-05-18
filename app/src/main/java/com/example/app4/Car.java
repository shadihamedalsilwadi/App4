package com.example.app4;

public class Car {

    private String Title;
    private String Description ;
    private int Th ;

    public Car() {
    }

    public Car(String title, String description, int th) {
        Title = title;
        Description = description;
        Th = th;
    }


    public String getTitle() {
        return Title;
    }


    public String getDescription() {
        return Description;
    }

    public int getTh() {
        return Th;
    }


    public void setTitle(String title) {
        Title = title;
    }


    public void setDescription(String description) {
        Description = description;
    }

    public void setTh(int th) {
        Th = th;
    }
}