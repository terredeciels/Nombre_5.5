package client;

import compute.Calcul;
import util.ReadWriteFile;

public class Start {

    private Start() {
        int n = 32;
        calculate(n);
        Calcul calcul = new Calcul(n);
        System.out.println(calcul);

    }

    public static void main(String[] args) {
        new Start();
    }

    private void calculate(int n) {
        Calcul calcul = new Calcul(n);
        ///home/me/Documents/ToWindows/Matrice/M_
        ReadWriteFile.writeTextToFile(calcul.getTable(), "D:\\Downloads\\M_", n);

    }
}
