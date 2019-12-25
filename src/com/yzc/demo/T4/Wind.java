package com.yzc.demo.T4;

public class Wind implements Instrument {
    @Override
    public void play() {
        System.out.println("弹奏Wind");
    }

    public void playWind(){
        System.out.println("调用Wind的play2方法");
    }
}
