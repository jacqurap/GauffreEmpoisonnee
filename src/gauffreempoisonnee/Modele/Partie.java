/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Modele;

import java.util.Stack;

/**
 * La Partie
 * @author jacqurap
 */

public class Partie {
    private Joueur joueur1;
    private Joueur joueur2;
    private Plateau plateau;
    private int nbCoups;
    Stack<Plateau> annuler;
    Stack<Plateau> refaire;
    
    /**
     * Creation d'une partie
     */
    public Partie(){
        this.plateau = new Plateau();
        this.joueur1 = new Joueur("toto");
        this.joueur2 = new Ia2("titi");
        this.annuler = new Stack<>();
        this.refaire = new Stack<>();
        nbCoups = 0;
    }

    /**
     * Recupere le plateau
     * @return plateau
     */
    public Plateau getPlateau() {
        return plateau;
    }

    /**
     *  Definition du plateau
     * @param plateau le plateau a definir
     */
    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    /**
     * @return le joueur1
     */
    public Joueur getJoueur1() {
        return joueur1;
    }

    /**
     * @return le joueur2
     */
    public Joueur getJoueur2() {
        return joueur2;
    }

    /**
     * @return nbCoups, le nombre de coups
     */
    public int getNbCoups() {
        return nbCoups;
    }
    public void incNbCoups(){
        nbCoups++;
    }
}
