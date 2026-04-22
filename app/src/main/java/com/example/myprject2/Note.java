package com.example.myprject2;

public class Note {
    String title;
    String content;
    String createdDate;

    void getSummary() {
        System.out.println(this.title);
        System.out.println(this.content+""+this.createdDate);
    }
}