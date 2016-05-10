/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Modele;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

/**
 * I.A Facile reprenant le modele de I.A.
 * @author jacqurap
 */
public class Ia1 extends Ia {
	
	/**
	 * Creation de L'I.A facile 
	 * @author jacqurap
	 * @param nom le nom de l'I.A
	 */
    
    public Ia1 (String nom){
        super(nom);
    }
    
    /**
	 * Determine les coups de l'I.A facile
	 * @author jacqurap
	 * @param plat le plateau concernee
	 * @return la case a cliquer
	 */
    @Override
    public Point solve(Plateau plat){
        ArrayList<Point> list = new ArrayList<>();
        for(int i=0; i<plat.getTailleX(); i++){
            for(int j=0; j<plat.getTailleY(); j++){
                if(plat.getGauffre()[i][j] == Plateau.CASEGAUFFRE)
                    list.add(new Point(i,j));
            }
        }
        Random r = new Random(System.currentTimeMillis());
        
        int newPoint = r.nextInt(list.size());
        return list.get(newPoint);
    }
}
