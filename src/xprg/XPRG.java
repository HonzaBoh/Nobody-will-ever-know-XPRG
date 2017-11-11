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
    
    public static int[] Gates(){
        int[][] brany = {{0, 0, 0, 0, 0},
                         {0, 0, 0, 0},
                         {0, 0, 0},
                         {0, 0},
                        };
        /*for(int i = 0; i < brany.length; i++){
            System.out.println(Arrays.toString(brany[i]));
        }*/
        Random random = new Random();
        for(int i = 0; i < brany.length; i++){
            int ran = random.nextInt(brany[i].length);
            brany[i][ran] = 1;
            System.out.println(Arrays.toString(brany[i]));
        }
        char tab = 9;
        boolean p1naz = true;
        boolean p2naz = true;
        int x = 0;
        int p1konec = 0;
        int p2konec = 0;
        int[] score = {0, 0};
        while(x < brany.length){
            switch(x){
                case 0:
                    System.out.println(
                "+-----------------+" + tab + "+-----------------+" + tab + "+-----------------+" + tab + "+-----------------+" + tab + "+-----------------+\n" + 
                "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|\n" +
                "|-------^1^-------|" + tab + "|-------^2^-------|" + tab + "|-------^3^-------|" + tab + "|-------^4^-------|" + tab + "|-------^5^-------|\n" +
                "+--------^--------+" + tab + "+--------^--------+" + tab + "+--------^--------+" + tab + "+--------^--------+" + tab + "+--------^--------+\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "+--------+--------+" + tab + "+--------+--------+" + tab + "+--------+--------+" + tab + "+--------+--------+" + tab + "+--------+--------+\n"
                ); break;
                case 1:
                    System.out.println(
                "+-----------------+" + tab + "+-----------------+" + tab + "+-----------------+" + tab + "+-----------------+\n" +  
                "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|\n" +
                "|-------^1^-------|" + tab + "|-------^2^-------|" + tab + "|-------^3^-------|" + tab + "|-------^4^-------|\n" +
                "+--------^--------+" + tab + "+--------^--------+" + tab + "+--------^--------+" + tab + "+--------^--------+\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" + 
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "+--------+--------+" + tab + "+--------+--------+" + tab + "+--------+--------+" + tab + "+--------+--------+"
                ); break;
                case 2:
                    System.out.println(
                "+-----------------+" + tab + "+-----------------+" + tab + "+-----------------+\n" + 
                "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|\n" +
                "|-------^1^-------|" + tab + "|-------^2^-------|" + tab + "|-------^3^-------|\n" +
                "+--------^--------+" + tab + "+--------^--------+" + tab + "+--------^--------+\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "+--------+--------+" + tab + "+--------+--------+" + tab + "+--------+--------+"
                ); break;
                case 3:
                    System.out.println(
                "+-----------------+" + tab + "+-----------------+\n" +
                "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|\n" +
                "|-------^1^-------|" + tab + "|-------^2^-------|\n" +
                "+--------^--------+" + tab + "+--------^--------+\n" +
                "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |\n" +
                "+--------+--------+" + tab + "+--------+--------+\n"
                ); break;
            }
            if(p1naz == true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Hraje " + User1);
                int brana = sc.nextInt() - 1;
                    if(brany[x][brana] == 0){
                        System.out.println("Správná volba hráč " + User1 + " pokračuje.");
                        p1konec = x + 1;
                    }
                    else{
                        System.out.println("Špatná volba hráč " + User1 + " končí.");
                        p1naz = false;
                    }
                score[0] = p1konec * 5 + score[0];
            }
            if(p2naz == true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Hraje " + User2);
                int brana = sc.nextInt() - 1;
                    if(brany[x][brana] == 0){
                        System.out.println("Správná volba hráč " + User2 + " pokračuje.");
                        p2konec = x + 1;
                    }
                    else{
                        System.out.println("Špatná volba hráč " + User2 + " končí.");
                        p2naz = false;
                    }
                score[1] = p2konec * 5 + score[1];
            }
            x++;
            if(p1naz == false && p2naz == false){
                System.out.println("Hráči jedna bylo přičteno " + score[0] + " bodů");
                System.out.println("Hráči dva bylo přičteno " + score[1] + " bodů");
                x = brany.length;
            }
        }
        int[][] branyS = {{1, 1, 1, 1, 1},
                          {1, 1, 1, 1},
                          {1, 1, 1},
                          {1, 1},
                         };
        if(x == brany.length && p1naz == true || x == brany.length && p2naz == true){
            x = 3;
            System.out.println("Prohozeno, nyní je jen jedna brána správná, zkuste se vrátit.");
            /*for(int i = 0; i < branyS.length; i++){
                System.out.println(Arrays.toString(branyS[i]));
            } */
            Random randomS = new Random();
            for(int i = 0; i < branyS.length; i++){
                int ran = random.nextInt(branyS[i].length);
                branyS[i][ran] = 0;
                System.out.println(Arrays.toString(branyS[i]));
            }   
        }
        int y = 0;
        while((x >= 0 && p1naz == true) || (x >= 0 && p2naz == true)){
            switch(x){
                case 0:
                    System.out.println(
                "+-----------------+" + tab + "+-----------------+" + tab + "+-----------------+" + tab + "+-----------------+" + tab + "+-----------------+\n" + 
                "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|\n" +
                "|-------^1^-------|" + tab + "|-------^2^-------|" + tab + "|-------^3^-------|" + tab + "|-------^4^-------|" + tab + "|-------^5^-------|\n" +
                "+--------^--------+" + tab + "+--------^--------+" + tab + "+--------^--------+" + tab + "+--------^--------+" + tab + "+--------^--------+\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "+--------+--------+" + tab + "+--------+--------+" + tab + "+--------+--------+" + tab + "+--------+--------+" + tab + "+--------+--------+\n"
                ); break;
                case 1:
                    System.out.println(
                "+-----------------+" + tab + "+-----------------+" + tab + "+-----------------+" + tab + "+-----------------+\n" +  
                "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|\n" +
                "|-------^1^-------|" + tab + "|-------^2^-------|" + tab + "|-------^3^-------|" + tab + "|-------^4^-------|\n" +
                "+--------^--------+" + tab + "+--------^--------+" + tab + "+--------^--------+" + tab + "+--------^--------+\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" + 
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "+--------+--------+" + tab + "+--------+--------+" + tab + "+--------+--------+" + tab + "+--------+--------+"
                ); break;
                case 2:
                    System.out.println(
                "+-----------------+" + tab + "+-----------------+" + tab + "+-----------------+\n" + 
                "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|\n" +
                "|-------^1^-------|" + tab + "|-------^2^-------|" + tab + "|-------^3^-------|\n" +
                "+--------^--------+" + tab + "+--------^--------+" + tab + "+--------^--------+\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |" + tab + "|        |        |\n" +
                "+--------+--------+" + tab + "+--------+--------+" + tab + "+--------+--------+"
                ); break;
                case 3:
                    System.out.println(
                "+-----------------+" + tab + "+-----------------+\n" +
                "|----->BRÁNA<-----|" + tab + "|----->BRÁNA<-----|\n" +
                "|-------^1^-------|" + tab + "|-------^2^-------|\n" +
                "+--------^--------+" + tab + "+--------^--------+\n" +
                "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |\n" +
                "|        |        |" + tab + "|        |        |\n" +
                "+--------+--------+" + tab + "+--------+--------+\n"
                ); break;
            }
            if(p1naz == true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Hraje hráč číslo jedna.");
                int brana = sc.nextInt() - 1;
                if(branyS[x][brana] == 0 && y != 3){
                    System.out.println("Správná volba hráč číslo jedna pokračuje.");
                    p1konec = y + 1;
                }
                else if(branyS[x][brana] == 0 && y == 3){
                    System.out.println("Správná volba hráč číslo jedna došel do konce.");
                    p1konec = y + 1;
                }
                else{
                    System.out.println("Špatně hráč číslo jedna končí.");
                    p1naz = false;
                }
                score[0] = p1konec * 10 + score[0];
            }
            if(p2naz == true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Hraje hráč číslo dva.");
                int brana = sc.nextInt() - 1;
                if(branyS[x][brana] == 0 && y != 3){
                    System.out.println("Správná volba hráč číslo dva pokračuje.");
                    p2konec = y + 1;
                }
                else if(branyS[x][brana] == 0 && y == 3){
                    System.out.println("Správná volba hráč číslo dva došel do konce.");
                    p2konec = y + 1;
                }
                else{
                    System.out.println("Špatně hráč číslo dva končí.");
                    p2naz = false;
                }
                score[1] = p2konec * 10 + score[1];
            }
            if(x == 0 || (p1naz == false && p2naz == false)){
                System.out.println("Hráči jedna bylo přičteno " + score[0] + " bodů");
                System.out.println("Hráči dva bylo přičteno " + score[1] + " bodů");
            }
            x--;
            y++;
        }
        return score;
    }
    
    
    public static void main(String[] args) {
        Scanner dotaz = new Scanner(System.in);
        Uzivatele();
        System.out.println("Zvolte si 3 hry");
        System.out.println("1. Loterie          2. Ruská ruleta");
        System.out.println("3. Brány            4. Ukončit program");
        
        for(int round = 0; round < 3; round++){
            if(round%2 == 0){
                System.out.println("Volí hráč " + User1);
            }else{System.out.println("Volí hráč " + User2);}
            
            switch(dotaz.nextInt()){
                case 1: 
                    addScore(Lottery());
                    break;
                case 2:
                    addScore(Rulette());
                    break;
                case 3:
                    addScore(Gates());
                    break;
                default:
                    round--;
            }
        }
        
        Scoreboard();
    }
    
}