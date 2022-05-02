/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Component;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Ember;

/**
 *
 * @author hallgato
 */
public class GuiesOop {

    private static Scanner sc = new Scanner(System.in, "iso-8859-2");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Név: ");
//        System.out.println("A beírt név: " + valasz);
//        JOptionPane.showMessageDialog(null, "Üzenet","Ablakcím",JOptionPane.INFORMATION_MESSAGE);

        
        //Icon kep = new ImageIcon("C:\\Users\\hallgato\\gitalapok\\GuiesOop\\jpg.png");
        Icon kep = new ImageIcon("jpg.png");
        String valasz = JOptionPane.showInputDialog(null, "Nev: ", "Adatbekeres", JOptionPane.QUESTION_MESSAGE);
        String nev = valasz;
        valasz = JOptionPane.showInputDialog(null, "kor: ", "Adatbekeres", JOptionPane.QUESTION_MESSAGE);
        int kor = Integer.parseInt(valasz);
        

        Ember e = new Ember();
        e.setNev(nev);
        e.setKor(kor);
        //System.out.println(e);

        int gomb = JOptionPane.showConfirmDialog(null, "Konzol vagy gui? (yes-konzol,no-gui)", "Kérdés", JOptionPane.YES_NO_OPTION);
        if (gomb== JOptionPane.NO_OPTION) {
            System.out.println(e);
        }else {
            JOptionPane.showMessageDialog(null, e,"Ember adatai",JOptionPane.INFORMATION_MESSAGE,kep);
        }

    }

}
