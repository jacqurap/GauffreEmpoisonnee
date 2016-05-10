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
class RefaireAction implements ActionListener {

    private AireDeJeu aire;
    private JMenuItem btnAnnuler;
    private JMenuItem btnRefaire;

    public RefaireAction(AireDeJeu aire, JMenuItem annuler, JMenuItem refaire) {
        this.aire = aire;
        this.btnAnnuler = annuler;
        this.btnRefaire = refaire;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[][] gauffreActuel = aire.moteur.getPartie().getPlateau().getGauffre();
        Plateau newPlateau = new Plateau();
        newPlateau.setGauffre(gauffreActuel);
        
        Plateau plateau = aire.moteur.getPartie().getRefaire().pop();
        aire.moteur.getPartie().getAnnuler().push(newPlateau);
        aire.moteur.getPartie().getPlateau().setGauffre(plateau.getGauffre());
        getBtnAnnuler().setEnabled(true);
        if (aire.moteur.getPartie().getRefaire().empty()) {
            getBtnRefaire().setEnabled(false);
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
