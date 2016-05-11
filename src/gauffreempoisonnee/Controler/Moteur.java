/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Controler;
import gauffreempoisonnee.Modele.*;
import gauffreempoisonnee.Vue.*;
import gauffreempoisonnee.Controler.*;


/**
 *
 * @author jacqurap
 */
public class Moteur {
    private Partie partie;
    
    /**
     * Creation d'un moteur
     * @author jacqurap
     */
    public Moteur() {
        partie = new Partie();
    }
    
    /**
     * Regarde si la case fait partie de la gaufre
     * @param x la coordonnee horizontale
     * @param y la coordonnee Verticale
     * @return false s'il n'appartient pas a la gaufre, true sinon
     */
    
    public boolean actionMoteur(int x, int y) {
        int[][] gauffreActuel = getPartie().getPlateau().getGauffre();
        if(gauffreActuel[x][y] != Plateau.CASEGAUFFRE){
            return false;
        }
        else{
            Plateau newPlateau = new Plateau();
            newPlateau.setGauffre(gauffreActuel);
            getPartie().getAnnuler().push(newPlateau);
            getPartie().getRefaire().clear();
            partie.getPlateau().eatGauffre(x, y);
            getPartie().getPlateau().setGauffre(partie.getPlateau().getGauffre());
            partie.incNbCoups();
            
            getPartie().printStacks();
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
     * @param partie la partie a definir
     */
    public void setPartie(Partie partie) {
        this.partie = partie;
    }

}
