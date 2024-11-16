/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

import javax.swing.JOptionPane;

public class Triangulo extends FigurasGeometricas {
    @Override
    public void AreaF() {
        System.out.println("Area del Triangulo");

        double Baset = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base del Triangulo"));
        double AltT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura del Triangulo"));

        double AreaT = (Baset * AltT) / 2;

        System.out.println("Base: " + Baset);
        System.out.println("Altura: " + AltT);
        System.out.println("Formula: (Base * Altura) / 2");
        System.out.println("El area del triangulo es: " + AreaT);
    }
}