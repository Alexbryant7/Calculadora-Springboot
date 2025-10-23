package com.example.demo.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;


public class Calculator {

    //anotaciones para validar
    @NotNull(message = "El primer número es obligatorio")
    @Min(value = -1000, message = "El número debe ser mayor o igual a -1000")
    @Max(value = 1000, message = "El número debe ser menor o igual a 1000")
    private int camp1;

    @NotNull(message = "El segundo número es obligatorio")
    @Min(value = -1000, message = "El número debe ser mayor o igual a -1000")
    @Max(value = 1000, message = "El número debe ser menor o igual a 1000")
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
