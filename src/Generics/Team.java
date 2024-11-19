package Generics;

import java.util.ArrayList;

public class Team<A extends Player> implements Comparable<Team<A>> {
    private String name;
    int player = 0;
    int lost = 0;
    int won = 0;
    int played = 0;
    int draw = 0;

    private ArrayList<A> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    public boolean addPlayer(A player) {
        if(player==null){
            System.out.println("Invalid Player");
            return false;
        }
        if(members.contains(player)){
            System.out.println(player.getName()+" already exists in the team. ");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName()+" picked for the team. ");
            return true;
        }
    }
    public int teamSize(){
        return members.size();
    }

    public void matchResult(Team opponent,int ourScore, int theirScore){
        if(ourScore>theirScore){
            won++;
        }else if(theirScore>ourScore){
            lost++;
        }
        else{
            draw++;
        }
        played++;
        if(opponent!=null)
            matchResult(null, theirScore, ourScore);
    }


    public int ranking() {
        return (won*2) + draw;
    }

    @Override
    public int compareTo(Team<A> o) {
        if(this.ranking()>o.ranking()){
            return 1;
        }if(this.ranking()<o.ranking()){
            return -1;
        }if(this.ranking()==o.ranking()){
            return 0;
        }else{
            System.out.println("INVALID !!");
        }
        return 0;
    }
}
