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
public class Plateau implements Cloneable {

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
     * Creation d'une copie du plateau
     * @return copie, la copie du plateau
     * 
     */
    @Override
    public Object clone() {
        Plateau copie = null;
        try {
            copie = (Plateau) super.clone();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
        return copie;
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
     * @param g la gauffre a definir
     */
    
    public void setGauffre(int[][] g){
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++){
                gauffre[i][j] = g[i][j];
            }
        }
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
     * @return tailleX, le nombre de case -1 en x
     * (si x = 10 alors getTailleX() = 9)
     */
    public int getTailleX() {
        return tailleX;
    }

    /**
     * @return tailleY, le nombre de case -1 en y
     * (si y = 10 alors getTailleY() = 9)
     */
    public int getTailleY() {
        return tailleY;
    }

}
