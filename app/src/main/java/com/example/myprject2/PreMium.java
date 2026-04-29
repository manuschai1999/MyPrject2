package com.example.myprject2;

public class PreMium extends User {
    private String subscriptionExpiry;

    public PreMium(String username, String email, String expiry) {
        super(username, email);
        this.subscriptionExpiry = expiry;
    }

    @Override
    public int getNoteLimit() {
        return 1000; // สมาชิกพรีเมียมเก็บได้ 1000 โน๊ต
    }

    public String getSubscriptionExpiry() { 
        return subscriptionExpiry; 
    }
    
    public void setSubscriptionExpiry(String subscriptionExpiry) {
        this.subscriptionExpiry = subscriptionExpiry;
    }
}
