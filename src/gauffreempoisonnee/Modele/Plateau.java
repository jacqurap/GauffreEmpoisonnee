/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauffreempoisonnee.Modele;

/**
 *
 * @author jacqurap
 */
public class Plateau {

    private int[][] gauffre;

    public Plateau(int x, int y) {
        this.gauffre = new int[x][y];
        this.gauffre[0][0] = 1;
    }

    public Plateau() {
        this(8, 8);
    }

    /**
     * @return the gauffre
     */
    public int[][] getGauffre() {
        return gauffre;
    }

    /**
     * @param gauffre the gauffre to set
     */
    public void setGauffre(int[][] gauffre) {
        this.gauffre = gauffre;
    }

    public void eatGauffre(int x, int y) {
        for (int i = x; i < 8; i++) {
            for (int j = y; j < 8; j++) {
                this.gauffre[i][j] = -1;
            }
        }
    }

}