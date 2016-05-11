/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Modele;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author jacqurap
 */
public class Ia3 extends Ia {

    public Ia3(String nom) {
        super(nom);
    }

    @Override
    public Point solve(Plateau plat) {

        Plateau tmp;
        boolean fini = false;
        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < plat.getTailleX(); i++) {
            for (int j = 0; j < plat.getTailleY(); j++) {
                if (plat.getGauffre()[i][j] == Plateau.CASEGAUFFRE) {
                    tmp = plat.clone();
                    if (recurAND(tmp)){
                        list.add(new Point(i,j));
                    }
                }
            }
        }
        return list.get(0);
    }

    private boolean recurAND(Plateau plat) {
        boolean and = true;
        Plateau tmp;
        for (int i = 0; i < plat.getTailleX() && and; i++) {
            for (int j = 0; j < plat.getTailleY() && and; j++) {
                if (plat.getGauffre()[i][j] == Plateau.CASEGAUFFRE) {
                    tmp = plat.clone();
                    tmp.eatGauffre(j, j);
                    if (!recurOR(tmp)) {
                        and = false;
                    }
                }
            }
        }
        return and;
    }

    private boolean recurOR(Plateau plat) {
        boolean or = false;
        Plateau tmp;
        for (int i = 0; i < plat.getTailleX() && !or; i++) {
            for (int j = 0; j < plat.getTailleY() && !or; j++) {
                tmp = plat.clone();
                tmp.eatGauffre(j, j);
                if (!recurAND(tmp)) {
                    or = true;
                }
            }
        }
        return or;
    }
}
