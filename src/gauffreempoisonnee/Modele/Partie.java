/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Modele;

import gauffreempoisonnee.Modele.*;
import gauffreempoisonnee.Vue.*;
import gauffreempoisonnee.Controler.*;
import java.util.Iterator;

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
    private Stack<Plateau> annuler;
    private Stack<Plateau> refaire;
    private Plateau gauffre;
    
    /**
     * Creation d'une partie
     */
    public Partie(){
        this.plateau = new Plateau();
        this.joueur1 = new Humain("toto");
        this.joueur2 = new Ia3("titi");
        this.annuler = new Stack<>();
        this.refaire = new Stack<>();
        this.gauffre = new Plateau();
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
     * @return the annuler
     */
    public Stack<Plateau> getAnnuler() {
        return annuler;
    }

    /**
     * @return the refaire
     */
    public Stack<Plateau> getRefaire() {
        return refaire;
    }

    public void printStacks() {
        /*
        Iterator<Plateau> iterA = annuler.iterator();
        Iterator<Plateau> iterR = refaire.iterator();
        System.out.println("Pile annuler :");
        while (iterA.hasNext()) {
            int[][] g = iterA.next().getGauffre();
            for (int i = 0; i < plateau.getTailleX(); i++) {
                System.out.println();
                for (int j = 0; j < plateau.getTailleY(); j++) {
                    System.out.print(g[j][i] + "\t");
                }
            }
        }
        System.out.println("\nPile refaire :");
        while (iterR.hasNext()) {
            int[][] g = iterR.next().getGauffre();
            for (int i = 0; i < plateau.getTailleX(); i++) {
                System.out.println();
                for (int j = 0; j < plateau.getTailleY(); j++) {
                    System.out.print(g[j][i] + "\t");
                }
            }
        }*/
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
    public void decNbCoups(){
        nbCoups--;
    }
}
