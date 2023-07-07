/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JFrame;
import view.FrmMain;

/**
 *
 * @author Cartman
 */
public class Start {
    public static void main(String[] args) {
        FrmMain form=new FrmMain();
        form.setTitle("Prodavnica racunarske opreme");
        form.setLocationRelativeTo(null);
        form.setExtendedState(JFrame.MAXIMIZED_BOTH);
        form.setVisible(true);
        
    }
}
