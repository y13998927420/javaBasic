package com.yzc.demo.T2;

public class Juxing {
    private int height;
    private int width;

    public Juxing() {
    }

    public Juxing(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void S(){
        System.out.println("面积为："+height*width);
    }
}
