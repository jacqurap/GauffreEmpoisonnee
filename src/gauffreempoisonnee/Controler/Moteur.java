/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Controler;
import gauffreempoisonnee.Modele.*;


/**
 * Le Moteur (Arbitre)
 * @author jacqurap
 */
public class Moteur {
    private Partie partie;
    
    /**
     * Cr�ation d'un moteur
     * @author jacqurap
     */
    public Moteur() {
        partie = new Partie();
    }
    
    /**
     * Regarde si la case fait partie de la gaufre
     * @param x la coordonn�e horizontale
     * @param y la coordonn�e Verticale
     * @return false s'il n'appartient pas � la gaufre, true sinon
     */
    
    public boolean actionMoteur(int x, int y) {
        int[][] gauffreActuel = getPartie().getPlateau().getGauffre();
        if(gauffreActuel[x][y] != 0){
            return false;
        }
        else{
            getPartie().getPlateau().eatGauffre(x, y);
            return true;
        }
    }

    /**
     * @return la partie
     */
    public Partie getPartie() {
        return partie;
    }

    /**
     * @param partie la partie � d�finir
     */
    public void setPartie(Partie partie) {
        this.partie = partie;
    }

}
