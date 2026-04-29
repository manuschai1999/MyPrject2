package com.example.myprject2;

public abstract class Note {
    // Encapsulation: ใช้ private

     String title;
     String createdDate;

    public Note(String title, String createdDate) {
        this.title = title;
        this.createdDate = createdDate;
    }

    // Abstraction & Polymorphism
    public abstract String display();
    public abstract String getSummary();

    // Encapsulation: Getter/Setter
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }
}