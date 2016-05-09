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

/**
 *
 * @author jacqurap
 */
class EcouteurDeSouris implements MouseListener {
    
    Moteur moteur;
    AireDeJeu aire;

    public EcouteurDeSouris(Moteur moteur, AireDeJeu aire) {
        this.moteur = moteur;
        this.aire = aire;
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        if(moteur.actionMoteur(e.getX()/50,e.getY()/50)) {
            aire.repaint();
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
