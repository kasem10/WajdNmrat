package com.example.nai7.wajdnmrat;

/**
 * Created by NAI7 on 03/03/18.
 */

public class ListModel {
    private String name;
    private String username;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "com.example.nai7.wajdnmrat.ListModel{" +
                "name=" + name +
                ", username=" + username +
                ", password=" + password +
                '}';
    }
}
