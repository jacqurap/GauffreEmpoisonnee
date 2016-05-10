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
 * I.A Moyenne reprenant le modele de I.A
 * @author jacqurap
 */
public class Ia2 extends Ia {
    
	/**
	 * Creation de L'I.A moyenne
	 * @author jacqurap
	 * @param nom le nom de l'I.A
	 */
	
    public Ia2 (String nom){
        super(nom);
    }
    
    /**
	 * Determine les coups de l'I.A moyenne
	 * @author jacqurap
	 * @param plat le plateau concernee
	 * @return la case a cliquer
	 */
    
    @Override
    public Point solve(Plateau plat){
        if(plat.getGauffre()[1][1] != Plateau.CASEVIDE){
            ArrayList<Point> list = new ArrayList<>();
        for(int i=0; i<plat.getTailleX(); i++){
            for(int j=0; j<plat.getTailleY(); j++){
                if(plat.getGauffre()[i][j] == Plateau.CASEGAUFFRE && !(i==0 && j==1 || i==1 && j==0))
                    list.add(new Point(i,j));
            }
        }
        Random r = new Random(System.currentTimeMillis());
        
        int newPoint = r.nextInt(list.size());
        return list.get(newPoint);
        }
        else{
            if(plat.getGauffre()[1][0] == Plateau.CASEVIDE){
                return new Point(0, 1);
            }
            else if(plat.getGauffre()[0][1] == Plateau.CASEVIDE){
                return new Point(1, 0);
            }
            else if(plat.getGauffre()[0][2] == Plateau.CASEVIDE && plat.getGauffre()[2][0] == Plateau.CASEVIDE){
                Random r = new Random(System.currentTimeMillis());
                if(r.nextInt()%2 == 0){
                    return new Point(1, 0);
                }
                else{
                    return new Point(0, 1);
                }
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
