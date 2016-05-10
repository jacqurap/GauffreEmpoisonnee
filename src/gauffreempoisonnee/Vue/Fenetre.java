/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Vue;

import gauffreempoisonnee.Controler.Moteur;
import java.awt.*;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 * Affichage de la fenetre
 * @author jacqurap
 */
public class Fenetre implements Runnable {

    @Override
    public void run() {
        Moteur moteur = new Moteur();
        JFrame frame = new JFrame();
        AireDeJeu aire = new AireDeJeu(moteur); 
        frame.add(aire);
        aire.addMouseListener(new EcouteurDeSouris(moteur, aire));
        
        //frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Fenetre());
    }

}
