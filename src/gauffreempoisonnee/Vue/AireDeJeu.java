/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Vue;

import gauffreempoisonnee.Controler.Moteur;
import gauffreempoisonnee.Modele.*;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 *
 * @author jacqurap
 */
public class AireDeJeu extends JComponent {

    Moteur moteur;

    public AireDeJeu(Moteur moteur) {
        this.moteur = moteur;

    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D drawable = (Graphics2D) g;
        drawable.setColor(Color.DARK_GRAY);
        drawable.fillRect(0, 0, 400, 400);
        drawable.setColor(Color.black);
        for (int i = 1; i < 8; i++) {
            drawable.drawLine(i * 50, 0, i * 50, 400);
            drawable.drawLine(0, i * 50, 400, i * 50);
        }
        drawable.setColor(Color.pink);
        drawable.fillRect(0, 0, 50, 50);

        drawable.setColor(Color.LIGHT_GRAY);
        Plateau plateau = moteur.getPartie().getPlateau();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
            if(plateau.getGauffre()[i][j]==-1) {
                drawable.fillRect(i*50, j*50, 50, 50);
            }
            }
        }
    }

}
