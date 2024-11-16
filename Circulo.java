/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

import javax.swing.JOptionPane;


public class Circulo extends FigurasGeometricas{
    
    @Override
    public void AreaF()
    {
        
        System.out.println("Area del Circulo");
        
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        
        
        Area = Math.PI *Math.pow(radio, 2);
        
         System.out.println("Radio: " +radio);
          System.out.println("Formula= PI * Radio^2 ");
        
        System.out.println("El area del Circulo es: " +Area);
        
        
        
    }
    
    
}
