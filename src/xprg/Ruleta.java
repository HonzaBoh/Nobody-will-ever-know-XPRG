package xprg;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ruleta {
    
    
    private String User1;
    private String User2;

    public void setUser1(String User1) {
        this.User1 = User1;
    }

    public void setUser2(String User2) {
        this.User2 = User2;
    }
    
    public int[] Rulette(){
        int[] score = {0, 0};
        System.out.println("Zvolte si pozici (1 - 6):");
        String[] pozice = {"Cíl 1", "Cíl 2", "Cíl 3", "Cíl 4", "Cíl 5", "Cíl 6"};
        
        Random reload = new Random();
        int bullet = reload.nextInt(pozice.length);
        
        System.out.println(Arrays.toString(pozice));
        Scanner dotaz = new Scanner(System.in);
        System.out.println("Pozice hráče "+ User1 + ":");
        int pozice1 = dotaz.nextInt() - 1;
        pozice[pozice1] = User1;
        System.out.println("Pozice hráče " + User2 + ":");
        int pozice2 = dotaz.nextInt() - 1;
        pozice[pozice2] = User2;
        System.out.println(Arrays.toString(pozice));
        
        if(pozice1 != bullet){
            score[0] = 50;
        }
        
        if(pozice2 != bullet){
            score[1] = 50;
        }
        
        System.out.println("Po zmáčknutí klávesy ENTER bude jeden z šesti cílů zastřelen");
        Scanner dotaz2 = new Scanner(System.in);
        dotaz2.nextLine();
        System.out.println("Zastřelen byl hráč na pozici " + (bullet + 1) +": " + pozice[bullet]);
        pozice[bullet] = "ZASTŘELENÝ";
        System.out.println(Arrays.toString(pozice));
        System.out.println("Přeživší dostávají 50 bodů!");
        
        System.out.println("Pokračujte k další hře stiskem ENTER");
        dotaz.nextLine();
        System.out.println("");
        
        return score;
    }
}
