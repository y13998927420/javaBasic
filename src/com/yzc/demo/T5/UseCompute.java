package com.yzc.demo.T5;

public class UseCompute implements Computer {

    public void useCom(Computer com,int one, int two){
        System.out.println(com.computer(one,two));
    }

    @Override
    public int computer(int n, int m) {
        return 0;
    }
}
