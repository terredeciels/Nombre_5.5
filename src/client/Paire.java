package client;

public class Paire {

    public int i;
    public int j;

    public Paire(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        super.toString();
        return "(" + i + "," + j + ")";
    }
}
