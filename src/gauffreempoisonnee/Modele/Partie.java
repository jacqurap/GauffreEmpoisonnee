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
        this.joueur2 = new Humain("titi");
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
     * Pile historique annulation
     * @return annuler, la pile annuler
     */
    public Stack<Plateau> getAnnuler() {
        return annuler;
    }

    /**
     * Pile historique refaire
     * @return annuler, la pile refaire
     */
    public Stack<Plateau> getRefaire() {
        return refaire;
    }

    /**
     * Affiche le contenu des piles annuler et refaire
     */
    
    public void printStacks() {
        Iterator<Plateau> iterA = annuler.iterator();
        Iterator<Plateau> iterR = refaire.iterator();
        System.out.println("Pile annuler :");
        while (iterA.hasNext()) {
            int[][] g = iterA.next().getGauffre();
            for (int i = 0; i < 8; i++) {
                System.out.println();
                for (int j = 0; j < 8; j++) {
                    System.out.print(g[j][i] + "\t");
                }
            }
        }
        System.out.println("\nPile refaire :");
        while (iterR.hasNext()) {
            int[][] g = iterR.next().getGauffre();
            for (int i = 0; i < 8; i++) {
                System.out.println();
                for (int j = 0; j < 8; j++) {
                    System.out.print(g[j][i] + "\t");
                }
            }
        }
    }
    
    public Joueur getJoueur1() {
		return joueur1;
	}

	public void setJoueur1(Joueur joueur1) {
		this.joueur1 = joueur1;
	}

	public Joueur getJoueur2() {
		return joueur2;
	}

	public void setJoueur2(Joueur joueur2) {
		this.joueur2 = joueur2;
	}

	public int getNbCoups() {
		return nbCoups;
	}

	public void setNbCoups(int nbCoups) {
		this.nbCoups = nbCoups;
	}
}
