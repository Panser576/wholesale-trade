package org.example.wholesale_trade.model;

import java.util.List;

public class cabinet {
    private String name;
    private String phone;
    private List<biblioteca> login;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<biblioteca> getLogin() {
        return login;
    }

    public void setLogin(List<biblioteca> login) {
        this.login = login;
    }
}
