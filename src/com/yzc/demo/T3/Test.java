package com.yzc.demo.T3;

public class Test {

    public static void payWage(ColaEmployee emp,int month){
        HourlyEmployee h = new HourlyEmployee(6000);
        h.getSalary(5);
        SalariedEmployee s = new SalariedEmployee(100,150);
        s.getSalary(5);
        SalesEmployee s1 = new SalesEmployee(12000,1.2);
        s1.getSalary(5);
    }

    public static void main(String[] args) {
        HourlyEmployee h = new HourlyEmployee(6000);
        SalariedEmployee s = new SalariedEmployee(100,150);
        SalesEmployee s1 = new SalesEmployee(12000,1.2);
        ColaEmployee arr[] = {h,s,s1};
        for (ColaEmployee a:arr) {
            for(int i = 0;i<arr.length;i++){
                arr[i].getSalary(5);
            }
        }

    }
}
