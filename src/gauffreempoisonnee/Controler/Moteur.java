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
		boolean enCours;
        if(gauffreActuel[x][y] != 0){
            return false;
        }
        else{
            Plateau newPlateau = new Plateau();
            newPlateau.setGauffre(gauffreActuel);
            getPartie().getAnnuler().push(newPlateau);
            getPartie().getRefaire().clear();
            enCours = partie.getPlateau().eatGauffre(x, y);
            getPartie().getPlateau().setGauffre(partie.getPlateau().getGauffre());
            
            
            //getPartie().printStacks();
			if(!enCours){
				if(this.partie.getNbCoups()%2 == 0){
					System.out.println(this.partie.getJoueur1().getNom() + " WINNER !");
				}else{
					System.out.println(this.partie.getJoueur2().getNom() + " WINNER !");
				}
			}
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
