package rmi;

import metier.Carte;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SevenWonderRemote extends Remote {
    void jouerCarte() throws RemoteException;
    Carte consulterCarte() throws RemoteException;
    List<Carte> obtientCartes() throws RemoteException;
}
