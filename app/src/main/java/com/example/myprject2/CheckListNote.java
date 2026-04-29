package com.example.myprject2;

import java.util.List;

public class CheckListNote extends Note {
    private List<String> items;

    public CheckListNote(String title, String createdDate, List<String> items) {
        super(title, createdDate);
        this.items = items;
    }

    @Override
    public String display() {
        return getTitle() + " (Checklist): " + items.toString();
    }

    @Override
    public String getSummary() {
        return "Total items: " + (items != null ? items.size() : 0);
    }

    public List<String> getItems() { return items; }
    public void setItems(List<String> items) { this.items = items; }
}