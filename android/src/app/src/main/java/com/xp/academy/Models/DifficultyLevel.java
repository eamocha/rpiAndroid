package com.xp.academy.Models;

public class DifficultyLevel {
    private int id;
    private String value;
    private String displayedValue;

    public DifficultyLevel(int id, String value, String displayedValue) {
        this.id = id;
        this.value = value;
        this.displayedValue = displayedValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDisplayedValue() {
        return displayedValue;
    }

    public void setDisplayedValue(String displayedValue) {
        this.displayedValue = displayedValue;
    }

    @Override
    public String toString() {
        return getDisplayedValue();
    }
}
