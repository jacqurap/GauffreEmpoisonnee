package gauffreempoisonnee.Vue;

import gauffreempoisonnee.Modele.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
* Actions de Nouvelle Partie
* @author Guillaume Chaput
*/
class NouvPartieAction implements ActionListener {


   private AireDeJeu aire;

   /**
    * Création d'une action de nouvelle partie
    * @param aire l'aire de jeu
    *
    */
   
   public NouvPartieAction(AireDeJeu aire) {
       this.aire =aire;
    		   
   }

   @Override
   public void actionPerformed(ActionEvent e) {
	   Partie nouv;
	   nouv = new Partie();
	   aire.moteur.setPartie(nouv);
       aire.repaint();
   }

  

   /**
    * Recupere l'aire de jeu
    * @return aire, l'aire de jeu
    */
   public AireDeJeu getAireDdeJeu() {
       return aire;
   }


}