/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Modele;

import java.util.Stack;

/**
 * La partie
 * @author jacqurap
 */

public class Partie {
    //joueur1
    //joueur2
    private Plateau plateau;
    int nbCoups;
    Stack<Plateau> annuler;
    Stack<Plateau> refaire;
    
    /**
     * Création d'une partie
     */
    public Partie(){
        this.plateau = new Plateau();
        this.annuler = new Stack<>();
        this.refaire = new Stack<>();
    }

    /**
     * Récupère le plateau
     * @return plateau
     */
    public Plateau getPlateau() {
        return plateau;
    }

    /**
     *  Définition du plateau
     * @param plateau le plateau a definir
     */
    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }
}
