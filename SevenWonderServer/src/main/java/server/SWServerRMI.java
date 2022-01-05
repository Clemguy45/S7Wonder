package server;

import rmi.SWService;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SWServerRMI {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            SWService sod = new SWService();
            System.out.println(sod.toString());
            Naming.rebind("rmi://localhost:1099/SW",sod);
            System.out.println("Connecter");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
