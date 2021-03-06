package element;


import metier.Carte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Joueur {
    private String nom;
    private Hand m;
    private boolean isRdy;
    private Merveille merveille;

    private boolean commerceRessourcesPrimaires;
    private boolean commerceRessourcesSecondaires;

    private int pointsVictoire;
    private int boucliers;
    private int pointsMilitaires;
    private int jetonsDefaites;

    private int symboleIngenieur;
    private int symboleScience;
    private int symboleTablette;


    private Map<String,Integer> ressources;
    private ArrayList<Carte> cartesPosees;


    public Joueur() {}

    public Joueur(String nom) {
        this.nom = nom;

        this.m = new Hand();
        this.cartesPosees = new ArrayList<Carte>();
        this.isRdy = false;
        this.setcommerceRessourcesPrimaires(false);
        this.setcommerceRessourcesSecondaires(false);
        this.pointsVictoire = 0;
        this.boucliers = 0;
        this.setpointsMilitaires(0);
        this.jetonsDefaites = 0;
        this.symboleIngenieur = 0;
        this.symboleScience = 0;
        this.symboleTablette = 0;

        ressources = new HashMap<String,Integer>();
        ressources.put("pièces", 0);
        ressources.put("bois", 0);
        ressources.put("pierre", 0);
        ressources.put("minerai", 0);
        ressources.put("argile", 0);
        ressources.put("tissu", 0);
        ressources.put("verre", 0);
        ressources.put("papier", 0);
    }

    public ArrayList<Carte> getCartesPosees() {
        return cartesPosees;
    }

    public void setCartesPosees(ArrayList<Carte> cartesPosees) {
        this.cartesPosees = cartesPosees;
    }

    public void ajouterCartePosee(Carte c){
        this.cartesPosees.add(c);
    }

    public boolean checkRessources(String nomRessource, int quantité){
        if(ressources.get(nomRessource) >= quantité) {
            return true;
        }
        return false;
    }

    public void ajouterRessources(String nomRessource, int quantité) {
        ressources.put(nomRessource, ressources.get(nomRessource) + quantité);
    }

    public void ajouterRessources(Map<String, Integer> gain_ressources) {
        for (Map.Entry<String,Integer> entry : gain_ressources.entrySet()) {
            this.ressources.put(entry.getKey(), this.ressources.get(entry.getKey()) + entry.getValue());
        }
    }

    public int getQuantitéRessource(String nomRessource) {
        return ressources.get(nomRessource);
    }

    // Setters & Getters
    public boolean iscommerceRessourcesPrimaires() {
        return commerceRessourcesPrimaires;
    }

    public void setcommerceRessourcesPrimaires(boolean commerceRessourcesPrimaires) {
        this.commerceRessourcesPrimaires = commerceRessourcesPrimaires;
    }

    public boolean iscommerceRessourcesSecondaires() {
        return commerceRessourcesSecondaires;
    }

    public void setcommerceRessourcesSecondaires(boolean commerceRessourcesSecondaires) {
        this.commerceRessourcesSecondaires = commerceRessourcesSecondaires;
    }

    public int getPièces() {
        return ressources.get("pièces");
    }

    public void addPièces(int gainPièces) {
        ressources.put("pièces",ressources.get("pièces") + gainPièces);
    }

    public void substractPièces(int pertePièces){
        if(ressources.get("pièces") >= pertePièces) {
            ressources.put("pièces", ressources.get("pièces") - pertePièces);
        } else {
            ressources.put("pièces",0);
        }
    }

    public void addSymboleIngenieur(int valeur){
        this.symboleIngenieur += valeur;
    }
    public void addSymboleScience(int valeur){
        this.symboleIngenieur += valeur;
    }
    public void addSymboleTablette(int valeur){
        this.symboleIngenieur += valeur;
    }

    public int getSymboleIngenieur() {
        return symboleIngenieur;
    }

    public int getSymboleScience() {
        return symboleScience;
    }

    public int getSymboleTablette() {
        return symboleTablette;
    }

    public int getPointsVictoire() {
        return pointsVictoire;
    }

    public void setPointsVictoire(int pointsVictoire) {
        this.pointsVictoire = pointsVictoire;
    }

    public void addPointsVictoire(int gain_pointsVictoire){
        this.pointsVictoire += gain_pointsVictoire;
    }

    public int getBouclier() {
        return boucliers;
    }

    public void setBouclier(int gain_bouclier) {
        this.boucliers = gain_bouclier;
    }

    public int getpointsMilitaires() {
        return pointsMilitaires;
    }

    public void setpointsMilitaires(int pointsMilitaires) {
        this.pointsMilitaires = pointsMilitaires;
    }

    public void addpointsMilitaires(int point){this.pointsMilitaires += point;}

    public void delpointsMilitaires(){this.pointsMilitaires -= 1;}

    public int getJetonsDefaites() {
        return jetonsDefaites;
    }

    public void setJetonsDefaites(int jetonsDefaites) {
        this.jetonsDefaites = jetonsDefaites;
    }

    public void addJetonsDefaites(int gain_jetonsDefaites){
        this.jetonsDefaites += gain_jetonsDefaites;
    }

    public void delJetonsDefaites(int perte_jetonsDefaites){
        this.jetonsDefaites -= perte_jetonsDefaites;
    }

    public void setRessources(HashMap<String, Integer> gain_ressources) {
        this.ressources = gain_ressources;
    }

    public Map<String, Integer> getRessources() {
        return ressources;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isRdy() {
        return isRdy;
    }

    public void setRdy(boolean isRdy) {
        this.isRdy = isRdy;
    }

    public Hand getM() {
        return m;
    }

    public void setM(Hand m) {
        this.m = m;
    }

    public Merveille getMerveille() {
        return merveille;
    }

    public void setMerveille(Merveille merveille) {
        this.merveille = merveille;
        this.ressources.put(merveille.getRessource(),1);
    }



    public String toString(){
        return "" + nom;
    }
}
