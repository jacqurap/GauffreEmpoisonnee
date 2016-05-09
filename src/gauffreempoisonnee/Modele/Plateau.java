/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Modele;

/**
 * Le plateau de jeu
 * @author jacqurap
 */
public class Plateau {

    private int[][] gauffre;

    /**
     * Création du plateau, avec le poison dans le coin supérieur gauche, de taille x*y
     * @param x le nombre de cases à l'horizontale
     * @param y le nombre de cases à la verticale
     */
    public Plateau(int x, int y) {
        this.gauffre = new int[x][y];
        this.gauffre[0][0] = 1;
    }
    
    /**
     * Constructeur par défaut du plateau
     */

    public Plateau() {
        this(8, 8);
    }

    /**
     * @return la gauffre
     */
    public int[][] getGauffre() {
        return gauffre;
    }

    /**
     * @param gauffre la gauffre à définir
     */
    public void setGauffre(int[][] gauffre) {
        this.gauffre = gauffre;
    }

    /**
     * Marque les cases déjà mangé
     * @param x coordonnee à l'horizontale
     * @param y coordonnee à la verticale
     */
    
    public void eatGauffre(int x, int y) {
        for (int i = x; i < 8; i++) {
            for (int j = y; j < 8; j++) {
                this.gauffre[i][j] = -1;
            }
        }
    }

}
