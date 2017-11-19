package xprg;

import java.util.Scanner;

public class UI {
    public String User1;
    private int scoreU1;
    public String User2;
    private int scoreU2;

    public void addScore(int[] score) {
        scoreU1 += score[0];
        scoreU2 += score[1];
    }
      
    public void Uzivatele(){
        Scanner info = new Scanner(System.in);
        System.out.println("Zadejte jméno prvního hráče");
        User1 = info.nextLine();
        System.out.println("Zadejte jméno druhého hráče");
        User2 = info.nextLine();
    }
    
    public void Scoreboard(){
        System.out.println("-------------------------------------------------");
        System.out.println("Skóre hráčů:");
        System.out.println();
        System.out.println(User1 + ": "+ scoreU1);
        System.out.println();
        System.out.println(User2 + ": "+ scoreU2);
        System.out.println("-------------------------------------------------");
        
    
    }
}
