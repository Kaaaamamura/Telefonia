/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Ingenieria
 */
public class Vista {
    
    public void logo() {
        JOptionPane.showMessageDialog(null, """
                                            ****************************************
                                            **       Telefonia                             **
                                            **       Hecho por:                                 **
                                            **       Kevin Vargas                          **
                                            ***************************************""");
    }
    
    public int menu() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion"
                + "1. Agregar una llamada telefonica"
                + "2. Visualizar la información de cada linea"
                + "3. Visualizar la información de todas las lineas de la empresa"
                + "4. Salir"));
        return a;
        
    }
    public void agregarLlamada(){
        JOptionPane.showInputDialog("Ingrese la duracion de la llamada");
        JOptionPane.showInputDialog("Ingrese tipo de la llamada");
    }
}
