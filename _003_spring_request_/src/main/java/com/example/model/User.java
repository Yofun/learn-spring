package com.example.model;

import java.util.Arrays;

public class User {
    public String username;
    public String password;

    public String[] lessions;

    public String[] getLessions() {
        return lessions;
    }

    public void setLessions(String[] lessions) {
        this.lessions = lessions;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", lessions=" + Arrays.toString(lessions) +
                '}';
    }
}
