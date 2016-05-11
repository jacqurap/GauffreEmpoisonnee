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
     * Constructeur par defaut du plateau
     */

    public Plateau() {
        this(3, 3);
    }
    
    public Plateau clone() {
        Plateau copie = new Plateau(this.tailleX, this.tailleY);
        copie.setGauffre(this.gauffre);
        
        return copie;
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
        for(int i=0; i<tailleX;i++){
            for(int j=0;j<tailleY;j++){
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
        for (int i = x; i < tailleX; i++) {
            for (int j = y; j < tailleY; j++) {
                this.gauffre[i][j] = -1;
            }
        }
		if(this.gauffre[1][1] == -1 && this.gauffre[0][1] == -1){
			System.out.println("GAME OVER");
			return false;
		}
		return true;
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
