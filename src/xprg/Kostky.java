package xprg;

import java.util.Random;
import java.util.Scanner;

public class Kostky {
    private String User1;
    private String User2;

    public void setUser1(String User1) {
        this.User1 = User1;
    }

    public void setUser2(String User2) {
        this.User2 = User2;
    }
    
    public int[] Cubes(){
        System.out.println("\n" + 
                "Vítejte. Zde budete hádat kolik jste dohromady hodili všemi kostkami.\n" +
                "Počet kostek si vyberete na začátku hry. Počet kostek zůstává stejný všechy 3. kola.\n" + 
                "Po zvolení počtu kostek budou hráči hádat kolik je součet všech jimi hozených kostek.\n" +
                "Hráč který se více přiblíží hozené hodnotě vyhrává. Za přesné uhodnutí součtu jsou bonusové body.\n" + 
                "Hodně štěstí.\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Zvolte počet kostek pro oba hráče.");
        int pocetKostek = sc.nextInt();
        int[] score = {0 , 0};
        int[] p1Kostky = new int[pocetKostek];
        int[] p2Kostky = new int[pocetKostek];
        int p1Soucet = 0;
        int p2Soucet = 0;
        boolean p1Vyhral = false;
        boolean p2Vyhral = false;
        for(int x =0; x < 3; x++){
            for(int i = 0; i< pocetKostek; i++){
                Random rn = new Random();
                int kostka = rn.nextInt(6) + 1;
                p1Soucet = p1Soucet + kostka;
                p1Kostky[i] = kostka;
            //    System.out.println("P1 Hod č. " + (i + 1) + ": " + kostka);
            //    System.out.println("P1 Soucet č. " + (i + 1) + ": " + p1Soucet);
            }
           // System.out.println(); //řádek po výběru kostek
            for(int i = 0; i < pocetKostek; i++){
                Random rn = new Random();
                int kostka = rn.nextInt(6) + 1;
                p2Soucet = p2Soucet + kostka;
                p2Kostky[i] = kostka;
            //    System.out.println("P2 Hod č. " + (i + 1) + ": " + kostka);
            //    System.out.println("P2 Soucet č. " + (i + 1) + ": " + p2Soucet);
            }
            Scanner ss = new Scanner(System.in);
            System.out.println("Hráč " + User1 + " si myslí že hodil: ");
            int p1Hod = ss.nextInt();
            Scanner cc = new Scanner(System.in);
            System.out.println("Hráč " + User2 + " si myslí že hodil: ");
            int p2Hod = cc.nextInt();
            int p1Rozdil = p1Soucet - p1Hod;
            int p2Rozdil = p2Soucet - p2Hod;
            if (p1Rozdil == 0 && p1Vyhral == false){
                if(p1Rozdil == 0 && p2Rozdil < 0 && p1Vyhral == false){
                    p2Rozdil = p2Rozdil * (-1);
                    score[0] += 100;
                    p1Vyhral = true;
                }
                else if(p1Rozdil == 0){
                    score[0] += 100;
                    p1Vyhral = true;
                }
                
            }
            if (p2Rozdil == 0 && p2Vyhral == false){
                if(p2Rozdil == 0 && p1Rozdil < 0 && p2Vyhral == false){
                    p1Rozdil = p1Rozdil * (-1);
                    score[1] += 100;
                    p2Vyhral = true;
                }
                else if(p2Rozdil == 0){
                    score[1] += 100;
                    p2Vyhral = true;
                }
                
            }
            if(p1Rozdil > 0 && p2Rozdil > 0 && p1Vyhral == false && p2Vyhral == false){
                if(p1Rozdil == p2Rozdil){
                    score[0] += 50;
                    score[1] += 50;
                    p1Vyhral = true;
                    p2Vyhral = true;
                }
                else if(p1Rozdil < p2Rozdil){
                    score[0] += 50;
                    p1Vyhral = true;
                }
                else{
                    score[1] += 50;
                    p2Vyhral = true;
                }
            }
            if(p1Rozdil < 0 && p2Rozdil > 0 && p1Vyhral == false && p2Vyhral == false){
                p1Rozdil = p1Rozdil * (-1);
                if(p1Rozdil == p2Rozdil){
                    score[0] += 50;
                    score[1] += 50;
                    p1Vyhral = true;
                    p2Vyhral = true;
                }
                else if(p1Rozdil < p2Rozdil){
                    score[0] += 50;
                    p1Vyhral = true;
                }
                else{
                    score[1] += 50;
                    p2Vyhral = true;
                }
            }
            if(p2Rozdil < 0 && p1Rozdil > 0 && p1Vyhral == false && p2Vyhral == false){
                p2Rozdil = p2Rozdil * (-1);
                if(p1Rozdil == p2Rozdil){
                    score[0] += 50;
                    score[1] += 50;
                    p1Vyhral = true;
                    p2Vyhral = true;
                }
                else if(p2Rozdil < p1Rozdil){
                    score[1] += 50;
                    p2Vyhral = true;
                }
                else{
                    score[0] += 50;
                    p1Vyhral = true;
                }
            }
            if(p1Rozdil < 0 && p2Rozdil < 0 && p1Vyhral == false && p2Vyhral == false){
                p1Rozdil *= -1;
                p2Rozdil *= -1;
                if(p1Rozdil == p2Rozdil){
                    score[0] += 50;
                    score[1] += 50;
                    p1Vyhral = true;
                    p2Vyhral = true;
                }
                else if(p1Rozdil < p2Rozdil){
                    score[0] += 50;
                    p1Vyhral = true;
                }
                else{
                    score[1] += 50;
                    p2Vyhral = true;
                }
            }
            System.out.println("Kostky hráče " + User1 + ":");
            for(int i = 0; i < p1Kostky.length; i++){
                switch(p1Kostky[i]){
                case 1:
                    System.out.println("Hod " + (i +1) + ". kostkou:");
                    System.out.println(
                    " ___________ \n" +
                    "|           |\n" +
                    "|           |\n" +
                    "|     •     |\n" +
                    "|           |\n" + 
                    "'___________' "                            
                ); 
                    Scanner radka1 = new Scanner(System.in);
                    String enter1 = radka1.nextLine();
                break;
                case 2:
                    System.out.println("Hod " + (i +1) + ". kostkou:");
                    System.out.println(
                    " ___________ \n" +
                    "|           |\n" +
                    "|        •  |\n" +
                    "|           |\n" +
                    "|  •        |\n" + 
                    "'___________' "
                    ); 
                    Scanner radka2 = new Scanner(System.in);
                    String enter2 = radka2.nextLine();
                break;
                case 3:
                    System.out.println("Hod " + (i +1) + ". kostkou:");
                    System.out.println(
                    " ___________ \n" +
                    "|           |\n" +
                    "|        •  |\n" +
                    "|     •     |\n" +
                    "|  •        |\n" + 
                    "'___________' "
                    );
                    Scanner radka3 = new Scanner(System.in);
                    String enter3 = radka3.nextLine();
                break;
                case 4:
                    System.out.println("Hod " + (i +1) + ". kostkou:");
                    System.out.println(
                    " ___________ \n" +
                    "|           |\n" +
                    "|  •     •  |\n" +
                    "|           |\n" +
                    "|  •     •  |\n" + 
                    "'___________' "
                    );
                    Scanner radka4 = new Scanner(System.in);
                    String enter4 = radka4.nextLine();
                break;
                case 5:
                    System.out.println("Hod " + (i +1) + ". kostkou:");
                    System.out.println(
                    " ___________ \n" +
                    "|           |\n" +
                    "|  •     •  |\n" +
                    "|     •     |\n" +
                    "|  •     •  |\n" + 
                    "'___________' "
                    );
                    Scanner radka5 = new Scanner(System.in);
                    String enter5 = radka5.nextLine();
                break;
                case 6:
                    System.out.println("Hod " + (i +1) + ". kostkou:");
                    System.out.println(
                    " ___________ \n" +
                    "|           |\n" +
                    "|  •     •  |\n" +
                    "|  •     •  |\n" +
                    "|  •     •  |\n" + 
                    "'___________' "
                    );
                    Scanner radka6 = new Scanner(System.in);
                    String enter6 = radka6.nextLine();
                break;
            }
            }
            System.out.println("Kostky hráče " + User2 + ":");
            for(int i = 0; i < p2Kostky.length; i++){
                switch(p2Kostky[i]){
                case 1:
                    System.out.println("Hod " + (i +1) + ". kostkou:");
                    System.out.println(
                    " ___________ \n" +
                    "|           |\n" +
                    "|           |\n" +
                    "|     •     |\n" +
                    "|           |\n" + 
                    "'___________' "                            
                ); 
                    Scanner radka1 = new Scanner(System.in);
                    String enter1 = radka1.nextLine();
                break;
                case 2:
                    System.out.println("Hod " + (i +1) + ". kostkou:");
                    System.out.println(
                    " ___________ \n" +
                    "|           |\n" +
                    "|        •  |\n" +
                    "|           |\n" +
                    "|  •        |\n" + 
                    "'___________' "
                    ); 
                    Scanner radka2 = new Scanner(System.in);
                    String enter2 = radka2.nextLine();
                break;
                case 3:
                    System.out.println("Hod " + (i +1) + ". kostkou:");
                    System.out.println(
                    " ___________ \n" +
                    "|           |\n" +
                    "|        •  |\n" +
                    "|     •     |\n" +
                    "|  •        |\n" + 
                    "'___________' "
                    );
                    Scanner radka3 = new Scanner(System.in);
                    String enter3 = radka3.nextLine();
                break;
                case 4:
                    System.out.println("Hod " + (i +1) + ". kostkou:");
                    System.out.println(
                    " ___________ \n" +
                    "|           |\n" +
                    "|  •     •  |\n" +
                    "|           |\n" +
                    "|  •     •  |\n" + 
                    "'___________' "
                    );
                    Scanner radka4 = new Scanner(System.in);
                    String enter4 = radka4.nextLine();
                break;
                case 5:
                    System.out.println("Hod " + (i +1) + ". kostkou:");
                    System.out.println(
                    " ___________ \n" +
                    "|           |\n" +
                    "|  •     •  |\n" +
                    "|     •     |\n" +
                    "|  •     •  |\n" + 
                    "'___________' "
                    );
                    Scanner radka5 = new Scanner(System.in);
                    String enter5 = radka5.nextLine();
                break;
                case 6:
                    System.out.println("Hod " + (i +1) + ". kostkou:");
                    System.out.println(
                    " ___________ \n" +
                    "|           |\n" +
                    "|  •     •  |\n" +
                    "|  •     •  |\n" +
                    "|  •     •  |\n" + 
                    "'___________' "
                    );
                    Scanner radka6 = new Scanner(System.in);
                    String enter6 = radka6.nextLine();
                break;
            }
            }
            System.out.println("Součet hráče " + User1 + ": "+ p1Soucet + "\nRozdíl hráče " + User1 + ": " + p1Rozdil + "\n" + "\nSoučet hráče " + User2 + ": " + p2Soucet + "\nRozdíl hráče " + User2 + ": " + p2Rozdil);
            if(p1Vyhral == true && p2Vyhral == true){
                System.out.println("Toto kolo se oba hráči přiblížili hádanou hodnotou k součtu hráč " + User1 + " má celkem " + score[0] + " bodů a hráč " + User2 + " má celkem "+ score[1] + " bodů.");
            }
            else if(p1Vyhral == true){
                System.out.println("Toto kolo vyhrál hráč " + User1 + ", má celkem " + score[0] + " bodů");
            }
            else{
                System.out.println("Toto kolo vyhrál hráč " + User2 + ", má celkem " + score[1] + " bodů");
            }
            Scanner pokracuj = new Scanner(System.in);
            String dale = pokracuj.nextLine();
            p1Soucet = 0;
            p2Soucet = 0;
            p1Vyhral = false;
            p2Vyhral =false;
        }
        
        Scanner ukonceni = new Scanner(System.in);
        System.out.println();
        System.out.println("Pokračujte k další hře stiskem ENTER");
        ukonceni.nextLine();
        System.out.println();
        
        return score;
        }
    
}
