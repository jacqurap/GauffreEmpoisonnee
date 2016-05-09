/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Modele;

import java.util.Stack;
/**
 *
 * @author jacqurap
 */
public class Partie {
    private Joueur joueur1;
    private Joueur joueur2;
    private Plateau plateau;
    private int nbCoups;
    Stack<Plateau> annuler;
    Stack<Plateau> refaire;
    
    public Partie(){
        this.plateau = new Plateau();
        this.joueur1 = new Joueur("toto");
        this.joueur2 = new Ia("titi");
        this.annuler = new Stack<>();
        this.refaire = new Stack<>();
        nbCoups = 0;
    }

    /**
     * @return the plateau
     */
    public Plateau getPlateau() {
        return plateau;
    }

    /**
     * @param plateau the plateau to set
     */
    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    /**
     * @return the joueur1
     */
    public Joueur getJoueur1() {
        return joueur1;
    }

    /**
     * @return the joueur2
     */
    public Joueur getJoueur2() {
        return joueur2;
    }

    /**
     * @return the nbCoups
     */
    public int getNbCoups() {
        return nbCoups;
    }
    public void incNbCoups(){
        nbCoups++;
    }
}
