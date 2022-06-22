package client;

import java.util.ArrayList;
import java.util.Iterator;

public class Output extends ArrayList<Paire> {

    private final Paire paire;
    private int multip;

    public Output(Paire paire, int multip) {
        this.paire = paire;
        this.multip = multip;
        add(paire);

    }

    @Override
    public String toString() {
        String ret = "";
        for (Iterator<Paire> it = this.iterator(); it.hasNext(); ) {
            ret += it.next();
        }
        return "(" + multip + ")" + "  " + ret + "\n";
    }

    public int getMultip() {
        return multip;
    }

    public void setMultip(int multip) {
        this.multip = multip;
    }

    public Paire getPaire() {
        return paire;
    }
}
