package com.yzc.demo.T2;

public class Changfangti extends Juxing {
    private int gao;

    public Changfangti(int gao) {
        this.gao = gao;
    }

    public Changfangti(int height, int width, int gao) {
        super(height, width);
        this.gao = gao;
    }

    public int getGao() {
        return gao;
    }

    public void setGao(int gao) {
        this.gao = gao;
    }

    public void tiJi(){
        System.out.println("体积为:"+this.getGao()*this.getHeight()*this.getWidth());
    }
}
