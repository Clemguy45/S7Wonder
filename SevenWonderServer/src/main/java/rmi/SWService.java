package rmi;

import metier.Carte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class SWService extends UnicastRemoteObject implements SevenWonderRemote {
    public SWService() throws RemoteException {
        super();
    }

    @Override
    public void jouerCarte() throws RemoteException {
        System.out.println("le joueur actuel joue une carte");
    }

    @Override
    public Carte consulterCarte() throws RemoteException {

        return null;
    }

    @Override
    public List<Carte> obtientCartes() throws RemoteException {
        return null;
    }
}
