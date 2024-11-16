/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

import javax.swing.JOptionPane;


public class Rectangulo extends FigurasGeometricas{
    
    @Override
    public void AreaF()
    {
        System.out.println("Area del Rectangulo");
        
       Base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base del Rectangulo"));
       AltT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura del Rectangulo"));
        
        Area = Base * AltT;
        
         System.out.println("Base: " +Base);
          System.out.println("Altura : " +AltT);
          
         System.out.println("Formula: Base * Altura ");

        
        System.out.println("El area del Rectangulo es: " +Area);
        
        
        
    }
    
    
}
