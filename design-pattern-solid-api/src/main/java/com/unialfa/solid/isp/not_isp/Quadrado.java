package com.unialfa.solid.isp.not_isp;

public class Quadrado implements Poligono {

    @Override
    public void area() {
        System.out.println("Area = ?");
    }

    @Override
    public void perimetro() {
        System.out.println("Perímetro = ?");
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
