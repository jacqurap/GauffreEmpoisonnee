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
    //joueur1
    //joueur2
    private Plateau plateau;
    int nbCoups;
    Stack<Plateau> annuler;
    Stack<Plateau> refaire;
    
    public Partie(){
        this.plateau = new Plateau();
        this.annuler = new Stack<>();
        this.refaire = new Stack<>();
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
}
