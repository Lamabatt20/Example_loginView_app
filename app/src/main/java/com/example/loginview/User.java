package com.example.loginview;

public class User {
    private String username;
    private String password;

    // Constructor with default values
    public User() {
        this.username = "lamaBatta";
        this.password = "lama2003";
    }

    // Constructor with custom values
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}
