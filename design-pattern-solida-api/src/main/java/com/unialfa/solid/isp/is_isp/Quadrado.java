package com.unialfa.solid.isp.is_isp;

public class Quadrado implements NaoRedondo {

    @Override
    public void area() {
        System.out.println("Area = ?");
    }

    @Override
    public void perimetro() {
        System.out.println("Perímetro = ?");
    }
}
