/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Modele;

/**
 * le Joueur (I.A ou Humain)
 * @author jacqurap
 */
public class Joueur {
   private String nom; 
   
   /**
	 * Creation du joueur
	 * @author jacqurap
	 * @param nom le nom du joueur
	 */
   
   public Joueur(String nom){
       this.nom = nom;
   }
   
   public String getNom(){
	   return this.nom;
   }
}
