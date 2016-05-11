/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Vue;

import gauffreempoisonnee.Modele.*;
import gauffreempoisonnee.Vue.*;
import gauffreempoisonnee.Controler.*;
import java.awt.*;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author jacqurap
 */
public class Fenetre implements Runnable {

    @Override
    public void run() {
        Moteur moteur = new Moteur();
        JFrame frame = new JFrame();
        AireDeJeu aire = new AireDeJeu(moteur); 
        frame.add(aire);
        
        JMenu fichier = new JMenu("Fichier");
        
        JMenuItem item_nouv_partie = new JMenuItem("Nouvelle Partie");
        fichier.add(item_nouv_partie);
        
        JMenu menu_file = new JMenu("Edition");

        JMenuItem item_annuler = new JMenuItem("Annuler");
        menu_file.add(item_annuler);
        item_annuler.setEnabled(false);

        JMenuItem item_refaire = new JMenuItem("Refaire");
        menu_file.add(item_refaire);
        item_refaire.setEnabled(false);

        aire.addMouseListener(new EcouteurDeSouris(moteur, aire, item_annuler, item_refaire));
        item_annuler.addActionListener(new AnnulerAction( aire, item_annuler, item_refaire));
        item_refaire.addActionListener(new RefaireAction(aire, item_annuler, item_refaire));
        item_nouv_partie.addActionListener(new NouvPartieAction( aire) );

        JMenuBar barre = new JMenuBar();
        barre.add(fichier);
        barre.add(menu_file);
        frame.setJMenuBar(barre);

        //frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Fenetre());
    }

}
