package element;

import java.util.ArrayList;

public class ClientID {
    private int id;
    private String name;
    private int victoires;
    private ArrayList<Integer> scores;


    public ClientID(int id, String name){
        this.id = id;
        this.name = name;
        this.victoires = 0;
        this.scores = new ArrayList<>();
    }
    public void addVictoire(int score){
        this.victoires += 1;
        this.scores.add(score);
    }
    public int getVictoires(){
        return victoires;
    }
    public double getScoresAverage(){
        double cmp = 0;
        for(int i =0;i<scores.size();i++){
            cmp += scores.get(i);
        }
        cmp /= scores.size();
        return cmp;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
