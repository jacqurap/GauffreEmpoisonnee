/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Modele;

import java.awt.Point;
import java.util.Random;

/**
 *
 * @author jacqurap
 */
public class Ia1 extends Ia {
    
    public Ia1 (String nom){
        super(nom);
    }
    
    public Point solve(Plateau plat){
        Random r = new Random(System.currentTimeMillis());
        
        int newX = r.nextInt(plat.getTailleX());
        int newY = r.nextInt(plat.getTailleY());
        return new Point(newX,newY);
    }
}
