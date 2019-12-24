package com.yzc.demo.T3;

public class HourlyEmployee extends ColaEmployee {
    private int gdgongzi;

    public HourlyEmployee(){
    }

    public HourlyEmployee(int gdgongzi) {
        this.gdgongzi = gdgongzi;
    }

    public HourlyEmployee(String name, int birthdayMonth, int gdgongzi) {
        super(name, birthdayMonth);
        this.gdgongzi = gdgongzi;
    }


    public int getGdgongzi() {
        return gdgongzi;
    }

    public void setGdgongzi(int gdgongzi) {
        this.gdgongzi = gdgongzi;
    }

    @Override
    public void getSalary(int month) {
        System.out.println("第"+month+"月固定工资员工的工资为："+this.gdgongzi);
    }
}
