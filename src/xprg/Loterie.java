package xprg;

import java.util.Scanner;
import java.util.Random;

public class Loterie {
    
    private String User1;
    private String User2;

    public void setUser1(String User1) {
        this.User1 = User1;
    }

    public void setUser2(String User2) {
        this.User2 = User2;
    }
    
    
    
    public int[] Lottery(){
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
                case 2: System.out.println("Uživatel " +  User2 + " si volí číslo ticketu:  ");
                    break;
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
                     break;
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
        
        Scanner dotaz = new Scanner(System.in);
        System.out.println("Pokračujte k další hře stiskem ENTER");
        dotaz.nextLine();
        System.out.println("");
        
        return score;
    }
}
