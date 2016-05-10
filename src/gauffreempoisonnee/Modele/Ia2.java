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
public class Ia2 extends Ia {
    
    public Ia2 (String nom){
        super(nom);
    }
    
    public Point solve(Plateau plat){
        if(plat.getGauffre()[2][2] != -1){
            Random r = new Random(System.currentTimeMillis());
        
            int newX = r.nextInt(plat.getTailleX());
            int newY = r.nextInt(plat.getTailleY());
            return new Point(newX,newY);
        }
        else{
            if(plat.getTailleX() == 1){
                return new Point(0, 1);
            }
            else if(plat.getTailleY() == 1){
                return new Point(1, 0);
            }
            else{
                Random r = new Random(System.currentTimeMillis());
                if(r.nextInt()%2 == 0){
                    int newX = r.nextInt(plat.getTailleX() -2) + 2;
                    return new Point(newX, 0);
                }
                else{
                    int newY = r.nextInt(plat.getTailleY() -2) + 2;
                    return new Point(0, newY);
                }
            }
        }
    }
}
