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
 * Le plateau graphique
 * @author jacqurap
 */
public class AireDeJeu extends JComponent {

    Moteur moteur;
    
    /**
     * Creation d'une aire de jeu 
     * @param moteur le moteur assigne a l'aire de jeu
     */

    public AireDeJeu(Moteur moteur) {
        this.moteur = moteur;

    }

    /**
     * Dessiner l'aire de jeu
     * @param g le moteur graphique pour l'aire de jeu
     */
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
        if(moteur.getPartie().getJoueur1() instanceof Ia && moteur.getPartie().getNbCoups()%2==0){
            Point coup;
            do{
                coup = ((Ia)moteur.getPartie().getJoueur1()).solve(moteur.getPartie().getPlateau());
            }while(!moteur.actionMoteur((int)coup.getX(),(int)coup.getY()));
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
        plateau = moteur.getPartie().getPlateau();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(plateau.getGauffre()[i][j]==-1) {
                    drawable.fillRect(i*50, j*50, 50, 50);
                }
            }
        }
        }
        if(moteur.getPartie().getJoueur2() instanceof Ia && moteur.getPartie().getNbCoups()%2==1){
            Point coup;
            do{
                coup = ((Ia)moteur.getPartie().getJoueur2()).solve(moteur.getPartie().getPlateau());
            }while(moteur.actionMoteur((int)coup.getX(),(int)coup.getY()));
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
        plateau = moteur.getPartie().getPlateau();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(plateau.getGauffre()[i][j]==-1) {
                    drawable.fillRect(i*50, j*50, 50, 50);
                }
            }
        }
        }
    }

}
