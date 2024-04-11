package com.example.habittracker;

public class Habit {
    private String name;
    private String description;
    private String button1Label;
    private String button2Label;
    private String button3Label;

    // Constructor
    public Habit(String name, String description, String button1Label, String button2Label, String button3Label) {
        this.name = name;
        this.description = description;
        this.button1Label = button1Label;
        this.button2Label = button2Label;
        this.button3Label = button3Label;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getButton1Label() {
        return button1Label;
    }

    public void setButton1Label(String button1Label) {
        this.button1Label = button1Label;
    }

    public String getButton2Label() {
        return button2Label;
    }

    public void setButton2Label(String button2Label) {
        this.button2Label = button2Label;
    }

    public String getButton3Label() {
        return button3Label;
    }

    public void setButton3Label(String button3Label) {
        this.button3Label = button3Label;
    }
}
