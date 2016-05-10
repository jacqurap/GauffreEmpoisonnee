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
     * Cr�ation du plateau, avec le poison dans le coin sup�rieur gauche, de taille x*y
     * @param x le nombre de cases � l'horizontale
     * @param y le nombre de cases � la verticale
     */
    private int tailleX;
    private int tailleY;
    
    public Plateau(int x, int y) {
        this.tailleX = x;
        this.tailleY = y;
        this.gauffre = new int[tailleX][tailleY];
        this.gauffre[0][0] = 1;
    }
    
    /**
     * Constructeur par d�faut du plateau
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
     * @param gauffre la gauffre � d�finir
     */
    public void setGauffre(int[][] gauffre) {
        this.gauffre = gauffre;
    }

    /**
     * Marque les cases d�j� mang�
     * @param x coordonnee � l'horizontale
     * @param y coordonnee � la verticale
     */
    
    public void eatGauffre(int x, int y) {
        for (int i = x; i < 8; i++) {
            for (int j = y; j < 8; j++) {
                this.gauffre[i][j] = -1;
            }
        }
    }

    /**
     * @return the taillex
     */
    public int getTailleX() {
        return tailleX;
    }

    /**
     * @return the tailley
     */
    public int getTailleY() {
        return tailleY;
    }

}
