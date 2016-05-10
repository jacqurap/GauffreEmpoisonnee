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

    public final static int CASEPOISON = 1;
    public final static int CASEGAUFFRE = 0;
    public final static int CASEVIDE = -1;
    
    private int[][] gauffre;

    /**
     * Creation du plateau, avec le poison dans le coin superieur gauche, de taille x*y
     * @param x le nombre de cases a l'horizontale
     * @param y le nombre de cases a la verticale
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
     * Constructeur par defaut du plateau
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
     * @param gauffre la gauffre a definir
     */
    public void setGauffre(int[][] gauffre) {
        this.gauffre = gauffre;
    }

    /**
     * Marque les cases deja mange
     * @param x coordonnee a l'horizontale
     * @param y coordonnee a la verticale
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
