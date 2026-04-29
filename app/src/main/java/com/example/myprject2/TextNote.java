package com.example.myprject2;

public class TextNote extends Note {
    public String textContent;

    public TextNote(String title, String createdDate, String textContent) {
        super(title, createdDate);
        this.textContent = textContent;
    }

    @Override
    public String display() {
        return getTitle() + " : " + textContent;
    }

    @Override
    public String getSummary() {
        if (textContent != null && textContent.length() > 20) {
            return textContent.substring(0, 20) + "...";
        }
        return textContent;
    }

    public String getTextContent() { return textContent; }
    public void setTextContent(String textContent) { this.textContent = textContent; }
}