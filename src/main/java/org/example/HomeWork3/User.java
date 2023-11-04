package org.example.HomeWork3;


public class User {



    public String name;
    String password;

    public boolean isAuthenticate = false;
    public boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }

    public User(String name, String password, boolean isAuthenticate, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAuthenticate = isAuthenticate;
        this.isAdmin = isAdmin;
    }

}