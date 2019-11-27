package com.unialfa.solid.isp.is_isp;

public class Circulo implements Redondo {

    @Override
    public void area() {
        System.out.println("Area = ?");
    }

    @Override
    public void circunferencia() {
        System.out.println("Circunferencia = ?");
    }

    @Override
    public void raio() {
        System.out.println("Raio = ?");
    }
}
