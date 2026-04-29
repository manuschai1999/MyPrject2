package com.example.myprject2;

/**
 * Abstraction & Encapsulation: Abstract class for different types of users.
 */
public abstract class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Polymorphism: Abstract method to be implemented by subclasses
    public abstract int getNoteLimit();

    // Encapsulation: Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
