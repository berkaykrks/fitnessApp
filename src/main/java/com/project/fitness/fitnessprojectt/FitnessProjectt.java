/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.project.fitness.fitnessprojectt;


/**
 *
 * @author faraz
 */
public class FitnessProjectt {
    public static void main(String[] args) { 
        Register regis = new Register();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
                regis.register();
            }
        });
                
    }
    
}
