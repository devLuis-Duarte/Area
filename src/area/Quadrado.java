/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area;

/**
 *
 * @author salda
 */
public class Quadrado {
    private double lado1;
    private double lado2;
    private double area;

    public Quadrado() {
    }

    public Quadrado(double lado1, double lado2, double area) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = area;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", area=" + area + '}';
    }
    
    
}
