package com.yzc.demo.T3;

public class SalariedEmployee extends ColaEmployee {
    private int everyhourmoney;
    private int workhour;

    public SalariedEmployee(int everyhourmoney, int workhour) {
        this.everyhourmoney = everyhourmoney;
        this.workhour = workhour;
    }

    public SalariedEmployee(String name, int birthdayMonth, int everyhourmoney, int workhour) {
        super(name, birthdayMonth);
        this.everyhourmoney = everyhourmoney;
        this.workhour = workhour;
    }


    public int getEveryhourmoney() {
        return everyhourmoney;
    }

    public void setEveryhourmoney(int everyhourmoney) {
        this.everyhourmoney = everyhourmoney;
    }

    public int getWorkhour() {
        return workhour;
    }

    public void setWorkhour(int workhour) {
        this.workhour = workhour;
    }

    @Override
    public void getSalary(int month) {
        if(workhour<160){
            System.out.println("第"+month+"按小时结算工资员工的工资为："+this.everyhourmoney*this.workhour);
        }else if(workhour>160){
            System.out.println("第"+month+"按小时结算工资员工的工资为："+(this.workhour-160)*1.5*everyhourmoney+160*everyhourmoney);
        }
    }
}
