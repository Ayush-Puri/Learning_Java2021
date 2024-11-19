package Generics;

import java.util.ArrayList;

public class Main {
    public static <A extends Player> void main(String[] args) {
//        ChessPlayer Magnus = new ChessPlayer("Magnus");
//        BasketballPlayer Curry = new BasketballPlayer("Curry");
//        FootballPlayer Messi = new FootballPlayer("Messi");
//
//        Team<ChessPlayer> Enigma = new Team<>("Enigma");
//        Enigma.addPlayer(Magnus);
//        Enigma.addPlayer(Messi);
//        Enigma.addPlayer(Curry);
//
//        System.out.println(Enigma.teamSize());
//
//        Team<FootballPlayer> FootballTeam = new Team<>("Chicago");
//        FootballTeam.addPlayer(Messi);

        ArrayList<Team<A>> SuperLeague = new ArrayList<>();
        ChessPlayer Magnus = new ChessPlayer("Magnus");
        BasketballPlayer Curry = new BasketballPlayer("Curry");
        FootballPlayer Messi = new FootballPlayer("Messi");
        ChessPlayer Ayush = new ChessPlayer("Ayush");
        ChessPlayer Vishi = new ChessPlayer("Vishi");
        ChessPlayer Samay = new ChessPlayer("Samay");
        ChessPlayer Hikaru = new ChessPlayer("Hikaru");

        ArrayList<ChessPlayer> Temp = new ArrayList<>();
        Temp.add(Magnus);
        Temp.add(Ayush);
        Temp.add(Hikaru);
        Temp.add(Samay);






    }
}
