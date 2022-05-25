package com.company;

public class Copy {
    private int id;
    private Title title;
    private String location = "";
    private boolean isAvailable = true;

    public Copy(int id, Title title) {
        this.id = id;
        this.title = title;
    }

    public Copy(int id, Title title, String location, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
