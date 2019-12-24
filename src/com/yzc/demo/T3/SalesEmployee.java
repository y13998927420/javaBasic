package com.yzc.demo.T3;

public class SalesEmployee extends ColaEmployee {
    private int monthmonery;
    private double tichenglv;

    public SalesEmployee(int monthmonery, double tichenglv) {
        this.monthmonery = monthmonery;
        this.tichenglv = tichenglv;
    }

    public SalesEmployee(String name, int birthdayMonth, int monthmonery, double tichenglv) {
        super(name, birthdayMonth);
        this.monthmonery = monthmonery;
        this.tichenglv = tichenglv;
    }

    public int getMonthmonery() {
        return monthmonery;
    }

    public void setMonthmonery(int monthmonery) {
        this.monthmonery = monthmonery;
    }

    public double getTichenglv() {
        return tichenglv;
    }

    public void setTichenglv(double tichenglv) {
        this.tichenglv = tichenglv;
    }

    @Override
    public void getSalary(int month) {
        System.out.println("第"+month+"月固定工资员工的工资为："+this.monthmonery*this.tichenglv);
    }
}
