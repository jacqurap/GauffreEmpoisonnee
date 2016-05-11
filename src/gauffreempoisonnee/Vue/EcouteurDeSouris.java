/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Vue;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import gauffreempoisonnee.Controler.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jacqurap
 */
class EcouteurDeSouris implements MouseListener,Cloneable {
    
    public Moteur moteur;
    public AireDeJeu aire;
    public JMenuItem btnAnnuler;
    public JMenuItem btnRefaire;
    
    public EcouteurDeSouris(Moteur moteur, AireDeJeu aire, JMenuItem annuler, JMenuItem refaire) {
        this.moteur = moteur;
        this.aire = aire;
        this.btnAnnuler = annuler;
        this.btnRefaire = refaire;
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
            if (aire.moteur.actionMoteur(e.getX() / (aire.getWidth() / moteur.getPartie().getPlateau().getTailleX()), e.getY() / (aire.getHeight() / moteur.getPartie().getPlateau().getTailleY()))) {
                aire.repaint();
                btnAnnuler.setEnabled(true);
                btnRefaire.setEnabled(false);
            }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
