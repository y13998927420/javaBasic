package com.yzc.demo.T3;

public abstract class ColaEmployee {
    private String name;
    private int birthdayMonth;

    public ColaEmployee() {
    }

    public ColaEmployee(String name, int birthdayMonth) {
        this.name = name;
        this.birthdayMonth = birthdayMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    public void setBirthdayMonth(int birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    public abstract void getSalary(int month);
}
