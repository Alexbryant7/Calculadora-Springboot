package com.example.demo.model;

public class Calculator {
    private int camp1;
    private int camp2;
    
    public Calculator() {
    }
    
    public Calculator(int camp1, int camp2) {
        this.camp1 = camp1;
        this.camp2 = camp2;
    }
    

    public int getCamp1() {
        return camp1;
    }
    
    public int getCamp2() {
        return camp2;
    }
    

    public void setCamp1(int camp1) {
        this.camp1 = camp1;
    }
    
    public void setCamp2(int camp2) {
        this.camp2 = camp2;
    }
}
