package com.techcamps.junit;

public class Person {

    private String user;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean checkUser() {
        return user != null
                && user.length() >= 8
                && user.matches("^[a-zA-Z0-9]*$");
    }

    public boolean checkPassword() {
        return password != null
                && password.length() >= 8
                && password.matches(".*\\d.*")
                && password.matches(".*[^a-zA-Z0-9].*");
    }
}
