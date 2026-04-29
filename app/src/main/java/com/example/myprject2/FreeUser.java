package com.example.myprject2;

/**
 * Inheritance: Subclass of User for free tier.
 */
public class FreeUser extends User {
    
    public FreeUser(String username, String email) {
        super(username, email);
    }

    @Override
    public int getNoteLimit() {
        return 10; // Free user can have up to 10 notes
    }
}
