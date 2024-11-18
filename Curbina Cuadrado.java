/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

import javax.swing.JOptionPane;

public class Cuadrado extends FigurasGeometricas {
    @Override
    public void AreaF() {
        System.out.println("Area del Cuadrado");

        double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Lado del Cuadrado"));

        double AreaT = lado * lado;

        System.out.println("Lado: " + lado);
        System.out.println("Formula: LADO * LADO");
        System.out.println("El area del cuadrado es: " + AreaT);
    }
}
