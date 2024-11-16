/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

import javax.swing.JOptionPane;


public class Principal {
    
    public static void main(String[] args) {
       
        int op;
        do
          {
        
        op = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                CALCULAR EL AREA DE LAS FIGURAS GEOMETRICAS
                                                                Seleccione una opcion: 
                                                                 1. Triangulo
                                                                 2. Cuadrado
                                                                 3. Circulo
                                                                 4. Rectangulo
                                                                 5. Salir"""));
        
          
        switch(op)
        {
            case 1 -> {        
                Triangulo Nia = new Triangulo();
                Nia.AreaF();
                System.out.println("");
                }
                
            case 2 -> {
                Cuadrado Nia1 = new Cuadrado();
                Nia1.AreaF();
                System.out.println("");
                }
                
            case 3 -> {
                Circulo Nia2 = new Circulo();
                Nia2.AreaF();
                System.out.println("");
                }
                
            case 4 -> {
                Rectangulo Nia3 = new Rectangulo();
                Nia3.AreaF();
                System.out.println("");
                }
                
                
           case 5 -> {
               JOptionPane.showMessageDialog(null,"QUE TENGA BUEN DIA");System.exit(0);
                }
                
            default -> {
                JOptionPane.showMessageDialog(null,"Eliga una opcion Valida");
                System.out.println("");
                }
                  
        }
        
        
        }while(op!=5);
        
    }
    
}
