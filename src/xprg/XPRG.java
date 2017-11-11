package xprg;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class XPRG {
    public static String User1;
    public static int scoreU1;
    public static String User2;
    public static int scoreU2;

    public static void addScore(int[] score) {
        scoreU1 += score[0];
        scoreU2 += score[1];
    }
      
    public static void Uzivatele(){
        Scanner info = new Scanner(System.in);
        System.out.println("Zadejte jméno prvního hráče");
        User1 = info.nextLine();
        System.out.println("Zadejte jméno druhého hráče");
        User2 = info.nextLine();
    }
    
    public static void Scoreboard(){
        System.out.println("-------------------------------------------------");
        System.out.println("Skóre hráčů:");
        System.out.println();
        System.out.println(User1 + ": "+ scoreU1);
        System.out.println();
        System.out.println(User2 + ": "+ scoreU2);
        System.out.println("-------------------------------------------------");
        
    
    }
    
    public static int[] Rulette(){
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
        System.out.println("Pozice hráče " + User2 + " :");
        int pozice2 = dotaz.nextInt() - 1;
        pozice[pozice2] = User2;
        System.out.println(Arrays.toString(pozice));
        
        if(pozice1 != bullet){
            score[0] = 50;
        }
        
        if(pozice2 != bullet){
            score[1] = 50;
        }
        
        System.out.println("Zastřelen byl hráč na pozici " + (bullet + 1) +":" + pozice[bullet]);
        pozice[bullet] = "ZASTŘELENÝ";
        System.out.println(Arrays.toString(pozice));
        System.out.println("Přeživší dostávají 50 bodů!");
        
        return score;
    }
    
    public static int[] Lottery(){
        int[] score = {0, 0};
        boolean played = false;
        int i = 1;
        Random ticket = new Random();
        
        char tab = 9;
        System.out.println("2. řádek - šance na úspěch\n" + "3. řádek - počet bodů\n " + "\n" +
            "+-------------------------+" + tab + "+-------------------------+" + tab + "+-------------------------+" + tab + "+-------------------------+" + tab + "+-------------------------+\n" +
            "|         Lístek          |" + tab + "|         Lístek          |" + tab + "|         Lístek          |" + tab + "|         Lístek          |" + tab + "|         Lístek          |\n" +
            "|           90%           |" + tab + "|           75%           |" + tab + "|           50%           |" + tab + "|           25%           |" + tab + "|           10%           |\n" +
            "|          10-15          |" + tab + "|          20-35          |" + tab + "|          40-75          |" + tab + "|          80-155         |" + tab + "|         160-320         |\n" +
            "|            1            |" + tab + "|            2            |" + tab + "|            3            |" + tab + "|            4            |" + tab + "|            5            |\n" +
            "+-------------------------+" + tab + "+-------------------------+" + tab + "+-------------------------+" + tab + "+-------------------------+" + tab + "+-------------------------+\n"
                    );
        
        while(!played){
            
            switch(i){
                case 1: System.out.println("Uživatel " + User1 + " si volí číslo ticketu: ");
                    break;
                case 2: System.out.println("Uživatel " + User2 + " si volí číslo ticketu:  ");
            }
            Scanner dotaz = new Scanner(System.in);
            switch(dotaz.nextInt()){
                case 1:
                    if(ticket.nextInt(10) == 9){
                        System.out.println("Blank ticket.");
                        System.out.println();
                    }
                    else{
                        int Min = 10;
                        int Max = 15;
                        int vysledek = Min + (int)(Math.random() * ((Max - Min) + 1));
                        System.out.println("Hráč si vytáhl ticket v hodnotě " + vysledek + " bodů!");
                        System.out.println();
                        score[i-1] = vysledek;
                    }
                    break;
                case 2:
                    if(ticket.nextInt(4) == 3){
                        System.out.println("Blank ticket.");
                        System.out.println();
                    }
                    else{
                        int Min = 20;
                        int Max = 35;
                        int vysledek = Min + (int)(Math.random() * ((Max - Min) + 1));
                        System.out.println("Hráč si vytáhl ticket v hodnotě " + vysledek + " bodů!");
                        System.out.println();
                        score[i-1] = vysledek;
                    }
                    break;
                case 3:
                    if(ticket.nextInt(2) == 1){
                        System.out.println("Blank ticket.");
                        System.out.println();
                    }
                    else{
                        int Min = 40;
                        int Max = 75;
                        int vysledek = Min + (int)(Math.random() * ((Max - Min) + 1));
                        System.out.println("Hráč si vytáhl ticket v hodnotě " + vysledek + " bodů!");
                        System.out.println();
                        score[i-1] = vysledek;
                    }
                    break;
                case 4:
                    if(ticket.nextInt(4) != 3){
                        System.out.println("Blank ticket.");
                        System.out.println();
                    }
                    else{
                        int Min = 80;
                        int Max = 155;
                        int vysledek = Min + (int)(Math.random() * ((Max - Min) + 1));
                        System.out.println("Hráč si vytáhl ticket v hodnotě " + vysledek + " bodů!");
                        System.out.println();
                        score[i-1] = vysledek;
                    }
                    break;
                case 5:
                    if(ticket.nextInt(10) != 9){
                        System.out.println("Blank ticket.");
                        System.out.println();
                    }
                    else{
                        int Min = 160;
                        int Max = 300;
                        int vysledek = Min + (int)(Math.random() * ((Max - Min) + 1));
                        System.out.println("Hráč si vytáhl ticket v hodnotě " + vysledek + " bodů!");
                        System.out.println();
                        score[i-1] = vysledek;
                    }
                    break;
            
            }
           
            if(i == 2){
                played = true;
            }
            i++; 
        }
        return score;
    }
    
    public static void main(String[] args) {
        Uzivatele();
        addScore(Lottery());
        addScore(Rulette());
        Scoreboard();
    }
    
}
