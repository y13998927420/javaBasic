package com.yzc.demo.T4;

public class Brass implements Instrument {
    @Override
    public void play() {
        System.out.println("弹奏Brass");
    }

    public void playBrass(){
        System.out.println("调用Brass的play2方法");
    }
}
