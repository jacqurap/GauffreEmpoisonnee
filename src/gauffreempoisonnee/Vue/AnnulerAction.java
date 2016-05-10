/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Vue;

import gauffreempoisonnee.Modele.*;
import gauffreempoisonnee.Vue.*;
import gauffreempoisonnee.Controler.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 *
 * @author bochatom
 */
class AnnulerAction implements ActionListener {

    private AireDeJeu aire;
    private JMenuItem btnAnnuler;
    private JMenuItem btnRefaire;
    
    public AnnulerAction(AireDeJeu aire, JMenuItem annuler, JMenuItem refaire) {
        this.aire = aire;
        this.btnAnnuler = annuler;
        this.btnRefaire = refaire;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[][] gauffreActuel = aire.moteur.getPartie().getPlateau().getGauffre();
        Plateau newPlateau = new Plateau();
        newPlateau.setGauffre(gauffreActuel);
        
        Plateau plateau = aire.moteur.getPartie().getAnnuler().pop();
        aire.moteur.getPartie().getRefaire().push(newPlateau);
        aire.moteur.getPartie().getPlateau().setGauffre(plateau.getGauffre());
        getBtnRefaire().setEnabled(true);
        if(aire.moteur.getPartie().getAnnuler().empty()) { 
            getBtnAnnuler().setEnabled(false);
        }
        aire.moteur.getPartie().printStacks();
        aire.repaint();
    }

    /**
     * @return the aire
     */
    public AireDeJeu getAire() {
        return aire;
    }

    /**
     * @return the btnAnnuler
     */
    public JMenuItem getBtnAnnuler() {
        return btnAnnuler;
    }

    /**
     * @return the btnRefaire
     */
    public JMenuItem getBtnRefaire() {
        return btnRefaire;
    }

}
