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
 *
 * @author jacqurap
 */
public class AireDeJeu extends JComponent {

    Moteur moteur;

    /**
     * Creation d'une aire de jeu
     *
     * @param moteur le moteur assigne a l'aire de jeu
     */
    public AireDeJeu(Moteur moteur) {
        this.moteur = moteur;

    }

    /**
     * Dessiner l'aire de jeu
     *
     * @param g le moteur graphique pour l'aire de jeu
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D drawable = (Graphics2D) g;
        drawable.setColor(Color.DARK_GRAY);
        drawable.fillRect(0, 0, this.getWidth(), this.getHeight());
        drawable.setColor(Color.black);
        Plateau plateau = moteur.getPartie().getPlateau();
        for (int i = 1; i < plateau.getTailleX(); i++) {
            drawable.drawLine(i * (this.getWidth() / plateau.getTailleX()), 0, i * (this.getWidth() / plateau.getTailleX()), this.getHeight());
        }
        for (int j = 1; j < plateau.getTailleY(); j++) {
            drawable.drawLine(0, j * (this.getHeight() / plateau.getTailleY()), this.getWidth(), j * (this.getHeight() / plateau.getTailleY()));
        }
        drawable.setColor(Color.pink);
        drawable.fillRect(0, 0, (this.getWidth() / plateau.getTailleX()), (this.getHeight() / plateau.getTailleY()));

        drawable.setColor(Color.LIGHT_GRAY);
        //System.out.print("tailleX :" + plateau.getTailleX() + "\ttailleY :" + plateau.getTailleY() + "\n");
        for (int i = 0; i < plateau.getTailleX(); i++) {
            for (int j = 0; j < plateau.getTailleY(); j++) {
                if (plateau.getGauffre()[i][j] == -1) {
                    drawable.fillRect(i * (this.getWidth() / plateau.getTailleX()), j * (this.getHeight() / plateau.getTailleY()), (this.getWidth() / plateau.getTailleX()), (this.getHeight() / plateau.getTailleY()));
                }
            }
        }
        if (moteur.getPartie().getJoueur1() instanceof Ia && moteur.getPartie().getNbCoups() % 2 == 0) {
            Point coup;

            do {
                coup = ((Ia) moteur.getPartie().getJoueur1()).solve(moteur.getPartie().getPlateau());
            } while (!moteur.actionMoteur((int) coup.getX(), (int) coup.getY()));
            drawable.setColor(Color.DARK_GRAY);
            drawable.fillRect(0, 0, this.getWidth(), this.getHeight());
            drawable.setColor(Color.black);
            for (int i = 1; i < plateau.getTailleX(); i++) {
                drawable.drawLine(i * (this.getWidth() / plateau.getTailleX()), 0, i * (this.getWidth() / plateau.getTailleX()), this.getHeight());
            }
            for (int j = 1; j < plateau.getTailleY(); j++) {
                drawable.drawLine(0, j * (this.getHeight() / plateau.getTailleY()), this.getWidth(), j * (this.getHeight() / plateau.getTailleY()));
            }
            drawable.setColor(Color.pink);
            drawable.fillRect(0, 0, (this.getWidth() / plateau.getTailleX()), (this.getHeight() / plateau.getTailleY()));

            drawable.setColor(Color.LIGHT_GRAY);
            plateau = moteur.getPartie().getPlateau();
            for (int i = 0; i < plateau.getTailleX(); i++) {
                for (int j = 0; j < plateau.getTailleY(); j++) {
                    if (plateau.getGauffre()[i][j] == -1) {
                        drawable.fillRect(i * (this.getWidth() / plateau.getTailleX()), j * (this.getHeight() / plateau.getTailleY()), (this.getWidth() / plateau.getTailleX()), (this.getHeight() / plateau.getTailleY()));
                    }
                }
            }
        }
        if (moteur.getPartie().getJoueur2() instanceof Ia && moteur.getPartie().getNbCoups() % 2 == 1) {
            Point coup;
            System.out.println("ia joueur 2");
            do {
                coup = ((Ia) moteur.getPartie().getJoueur2()).solve(moteur.getPartie().getPlateau());
            } while (!moteur.actionMoteur((int) coup.getX(), (int) coup.getY()));
            drawable.setColor(Color.DARK_GRAY);
            drawable.fillRect(0, 0, this.getWidth(), this.getHeight());
            drawable.setColor(Color.black);
            for (int i = 1; i < plateau.getTailleX(); i++) {
                drawable.drawLine(i * (this.getWidth() / plateau.getTailleX()), 0, i * (this.getWidth() / plateau.getTailleX()), this.getHeight());
            }
            for (int j = 1; j < plateau.getTailleY(); j++) {
                drawable.drawLine(0, j * (this.getHeight() / plateau.getTailleY()), this.getWidth(), j * (this.getHeight() / plateau.getTailleY()));
            }
            drawable.setColor(Color.pink);
            drawable.fillRect(0, 0, (this.getWidth() / plateau.getTailleX()), (this.getHeight() / plateau.getTailleY()));

            drawable.setColor(Color.LIGHT_GRAY);
            plateau = moteur.getPartie().getPlateau();
            for (int i = 0; i < plateau.getTailleX(); i++) {
                for (int j = 0; j < plateau.getTailleY(); j++) {
                    if (plateau.getGauffre()[i][j] == -1) {
                        drawable.fillRect(i * (this.getWidth() / plateau.getTailleX()), j * (this.getHeight() / plateau.getTailleY()), (this.getWidth() / plateau.getTailleX()), (this.getHeight() / plateau.getTailleY()));
                    }
                }
            }
        }
    }

}
