package client;

import java.util.Iterator;
import java.util.TreeMap;

public class Calcul extends TreeMap<Integer, Output> {

    public int entiermax;
    private Integer[][] outputT;
    private Output outputL;

    public Calcul(int entiermax) {
        this.entiermax = entiermax;
        calcul();
        outputT = toIntTab();
        //new Traitement(this);
    }

    private void calcul() {
        int prod;
        Paire paire;
        for (int i = 2; i <= entiermax; i++) {
            for (int j = 2; j <= entiermax; j++) {
                prod = i * j;
                paire = new Paire(i, j);
                if (!containsKey(prod)) {
                    put(prod, new Output(paire, 1));
                } else {
                    outputL = get(prod);
                    outputL.setMultip(outputL.getMultip() + 1);
                    outputL.add(paire);
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Integer[][] toIntTab() {
        Integer[][] tab = new Integer[entiermax + 1][entiermax + 1];
        for (Iterator<Integer> it = keySet().iterator(); it.hasNext(); ) {
            Output output = get(it.next());
            for (Paire paire : output) {
                tab[paire.i][paire.j] = output.getMultip();
            }
        }
        return tab;
    }

    public Integer[][] getTable() {
        return outputT;
    }
}
