
import metier.Carte;
import rmi.SevenWonderRemote;

import java.rmi.Naming;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        try {
            SevenWonderRemote stub = (SevenWonderRemote) Naming.lookup("rmi://localhost:1099/SW");
            System.out.println("je me suis connecter");
            stub.jouerCarte();
            List<Carte> cartes = stub.obtientCartes();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

