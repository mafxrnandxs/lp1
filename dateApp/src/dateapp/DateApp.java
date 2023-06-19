/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dateapp;

import javax.swing.JOptionPane;

/**
 *
 * @author mafxr
 */
public class DateApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date d1 = new Date(22,12,2023);

        JOptionPane.showMessageDialog(null,"Data "+d1.displayDate());

    }
    
}
