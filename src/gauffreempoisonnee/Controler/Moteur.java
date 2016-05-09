/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Controler;
import gauffreempoisonnee.Modele.*;


/**
 *
 * @author jacqurap
 */
public class Moteur {
    private Partie partie;
    
    public Moteur() {
        partie = new Partie();
    }
    
    public boolean actionMoteur(int x, int y) {
        int[][] gauffreActuel = getPartie().getPlateau().getGauffre();
        if(gauffreActuel[x][y] != 0){
            return false;
        }
        else{
            getPartie().getPlateau().eatGauffre(x, y);
            partie.incNbCoups();
            return true;
        }
    }

    /**
     * @return the partie
     */
    public Partie getPartie() {
        return partie;
    }

    /**
     * @param partie the partie to set
     */
    public void setPartie(Partie partie) {
        this.partie = partie;
    }

}
