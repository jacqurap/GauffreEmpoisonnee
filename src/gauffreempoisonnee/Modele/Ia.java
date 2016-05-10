/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Modele;

import java.awt.Point;
import java.util.Random;

/**
 * I.A
 * @author jacqurap
 */
public class Ia extends Joueur{
    
	/**
	 * Creation de L'I.A 
	 * @author jacqurap
	 * @param nom le nom de l'I.A
	 */
	
    public Ia (String nom){
        super(nom);
    }
    
    /**
	 * Determine les coups de l'I.A
	 * @author jacqurap
	 * @param plat le plateau concernee
	 * @return null
	 */
    
    public Point solve(Plateau plat){
        return null;
    }
}
