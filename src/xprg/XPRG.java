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
        System.err.println("");
        
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
    
    public static int[] Cubes(){
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
            System.out.println("Hráč jedna myslí že hodil: ");
            int p1Hod = ss.nextInt();
            Scanner cc = new Scanner(System.in);
            System.out.println("Hráč dva myslí že hodil: ");
            int p2Hod = cc.nextInt();
            int p1Rozdil = p1Soucet - p1Hod;
            int p2Rozdil = p2Soucet - p2Hod;
            if (p1Rozdil == 0){
                score[0] += 100;
                p1Vyhral = true;
                }
            if (p2Rozdil == 0){
                score[1] += 100;
                p2Vyhral = true;
                }
            if(p1Rozdil > 0 && p2Rozdil > 0){
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
            if(p1Rozdil < 0 && p2Rozdil > 0){
                p1Rozdil = p1Rozdil * (-1);
                if(p1Rozdil == p2Rozdil){
                    score[0] += 50;
                    score[1] += 50;
                    p1Vyhral = true;
                    p2Vyhral = true;
                }
                if(p1Rozdil < p2Rozdil){
                    score[0] += 50;
                    p1Vyhral = true;
                }    
            }
            if(p2Rozdil < 0 && p1Rozdil > 0){
                p2Rozdil = p2Rozdil * (-1);
                if(p1Rozdil == p2Rozdil){
                    score[0] += 50;
                    score[1] += 50;
                    p1Vyhral = true;
                    p2Vyhral = true;
                }
                if(p2Rozdil < p1Rozdil){
                    score[1] += 50;
                    p2Vyhral = true;
                }    
            }
            if(p1Rozdil < 0 && p2Rozdil < 0){
                p1Rozdil *= -1;
                p2Rozdil *= -1;
                if(p1Rozdil == p2Rozdil){
                    score[0] += 50;
                    score[1] += 50;
                    p1Vyhral = true;
                    p2Vyhral = true;
                }
                if(p1Rozdil < p2Rozdil){
                    score[0] += 50;
                    p1Vyhral = true;
                }
                else{
                    score[1] += 50;
                    p2Vyhral = true;
                }
            }
            System.out.println("Kostky hráče jedna:");
            for(int i = 0; i < p1Kostky.length; i++){
                switch(p1Kostky[i]){
                case 1:
                    System.out.println("Hod " + (i +1) + ". kola:");
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
                    System.out.println("Hod " + (i +1) + ". kola:");
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
                    System.out.println("Hod " + (i +1) + ". kola:");
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
                    System.out.println("Hod " + (i +1) + ". kola:");
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
                    System.out.println("Hod " + (i +1) + ". kola:");
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
                    System.out.println("Hod " + (i +1) + ". kola:");
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
            System.out.println("Kostky hráče dva:");
            for(int i = 0; i < p1Kostky.length; i++){
                switch(p1Kostky[i]){
                case 1:
                    System.out.println("Hod " + (i +1) + ". kola:");
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
                    System.out.println("Hod " + (i +1) + ". kola:");
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
                    System.out.println("Hod " + (i +1) + ". kola:");
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
                    System.out.println("Hod " + (i +1) + ". kola:");
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
                    System.out.println("Hod " + (i +1) + ". kola:");
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
                    System.out.println("Hod " + (i +1) + ". kola:");
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
            System.out.println("Součet hráče jedna: "+ p1Soucet + "\nRozdíl hráče jedna: " + p1Rozdil + "\n" + "\nSoučet hráče dva: " + p2Soucet + "\nRozdíl hráče dva: " + p2Rozdil);
            if(p1Vyhral == true){
                System.out.println("Toto kolo vyhrál hráč jedna, má celkem " + score[0] + " bodů");
            }
            else if(p1Vyhral == true && p2Vyhral == true){
                System.out.println("Toto kolo oba hráči přesně uhodli přesnou hodnotu součtu dostávjí 100 bodů");
            }
            else{
                System.out.println("Toto kolo vyhrál hráč dva, má celkem " + score[1] + " bodů");
            }
            Scanner pokracuj = new Scanner(System.in);
            String dale = pokracuj.nextLine();
            p1Soucet = 0;
            p2Soucet = 0;
        }
            return score;
        }
    
    public static int[] Stepping(){
        int[] score = new int[2];
        Scanner dotaz = new Scanner(System.in);
        System.out.println("Pravidla");
        System.out.println("Je připraveno sedm políček.");
        System.out.println("Hráčí hodí kostkou a posunou se o výsledek.");
        System.out.println("Lze si zvolit možnost pokračovat a házet znovu, nebo se spokojit s body.");
        System.out.println("Je tu možnost i hrací pole přeskočit a hráč dostane 0 bodů.");
        dotaz.nextLine();
       
            
        for(int round = 0; round < 2; round++){
            if(round < 1){
                System.out.println("Hraje " + User1 );
            }else{System.out.println("Hraje " + User2 );}
            Scanner hod = new Scanner(System.in);
            int Min = 1;
            int Max = 6;
            int vysledek = Min + (int)(Math.random() * ((Max - Min) + 1));
            int[] body = {10, 20, 30, 50, 75, 95, 150};
            int pole = 0;
            int kostka = 0;
            
            boolean end = false;
            System.out.println(
            "   10       20       30       50       75       95       150\n" +
            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+\n" +
            "|      | |      | |      | |      | |      | |      | |       |\n" +
            "|      | |      | |      | |      | |      | |      | |       |\n" +
            "|      | |      | |      | |      | |      | |      | |       |\n" +
            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+");
            while(!end){
                System.out.println("Přejete si hodit? (y/n)");
                switch(hod.nextLine()){
                    case "y": 
                        kostka =  Min + (int)(Math.random() * ((Max - Min) + 1));
                        pole += kostka;
                        switch(kostka){
                            case 1:
                                System.out.println(
                                " ___________ \n" +
                                "|           |\n" +
                                "|           |\n" +
                                "|     •     |\n" +
                                "|           |\n" + 
                                "'___________' "
                            ); break;
                            case 2:
                                System.out.println(
                                " ___________ \n" +
                                "|           |\n" +
                                "|        •  |\n" +
                                "|           |\n" +
                                "|  •        |\n" + 
                                "'___________' "
                            ); break;
                            case 3:
                            System.out.println(
                                " ___________ \n" +
                                "|           |\n" +
                                "|        •  |\n" +
                                "|     •     |\n" +
                                "|  •        |\n" + 
                                "'___________' "
                            ); break;
                            case 5:
                            System.out.println(
                                " ___________ \n" +
                                "|           |\n" +
                                "|  •     •  |\n" +
                                "|     •     |\n" +
                                "|  •     •  |\n" + 
                                "'___________' "
                            ); break;
                            case 6:
                            System.out.println(
                                " ___________ \n" +
                                "|           |\n" +
                                "|  •     •  |\n" +
                                "|  •     •  |\n" +
                                "|  •     •  |\n" + 
                                "'___________' "
                            ); break;
                        }
                        break;

                    case "n":
                        end = true;
                        break;

                    default:
                        System.out.println("Odpověděl jste špatným formátem");
                        break;
                }
                switch(pole){
                    case 1:
                        System.out.println(
                            "   10       20       30       50       75       95       150\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+\n" +
                            "|▪▪▪▪▪▪▪| |      | |      | |      | |      | |      | |       |\n" +
                            "|▪▪▪▪▪▪▪| |      | |      | |      | |      | |      | |       |\n" +
                            "|▪▪▪▪▪▪▪| |      | |      | |      | |      | |      | |       |\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+"); break;
                    case 2:
                        System.out.println(
                            "   10       20       30       50       75       95       150\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+\n" +
                            "|      | |▪▪▪▪▪▪▪| |      | |      | |      | |      | |       |\n" +
                            "|      | |▪▪▪▪▪▪▪| |      | |      | |      | |      | |       |\n" +
                            "|      | |▪▪▪▪▪▪▪| |      | |      | |      | |      | |       |\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+"); break;   
                    case 3:
                        System.out.println(
                            "   10       20       30       50       75       95       150\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+\n" +
                            "|      | |      | |▪▪▪▪▪▪▪| |      | |      | |      | |       |\n" +
                            "|      | |      | |▪▪▪▪▪▪▪| |      | |      | |      | |       |\n" +
                            "|      | |      | |▪▪▪▪▪▪▪| |      | |      | |      | |       |\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+"); break;
                    case 4:
                        System.out.println(
                            "   10       20       30       50       75       95       150\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+\n" +
                            "|      | |      | |      | |▪▪▪▪▪▪▪| |      | |      | |       |\n" +
                            "|      | |      | |      | |▪▪▪▪▪▪▪| |      | |      | |       |\n" +
                            "|      | |      | |      | |▪▪▪▪▪▪▪| |      | |      | |       |\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+"); break;  
                    case 5:
                        System.out.println(
                            "   10       20       30       50       75       95       150\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+\n" +
                            "|      | |      | |      | |      | |▪▪▪▪▪▪▪| |      | |       |\n" +
                            "|      | |      | |      | |      | |▪▪▪▪▪▪▪| |      | |       |\n" +
                            "|      | |      | |      | |      | |▪▪▪▪▪▪▪| |      | |       |\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+"); break;
                    case 6:
                        System.out.println(
                            "   10       20       30       50       75       95       150\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+\n" +
                            "|      | |      | |      | |      | |      | |▪▪▪▪▪▪▪| |       |\n" +
                            "|      | |      | |      | |      | |      | |▪▪▪▪▪▪▪| |       |\n" +
                            "|      | |      | |      | |      | |      | |▪▪▪▪▪▪▪| |       |\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+"); break;   
                    case 7:
                        System.out.println(
                            "   10       20       30       50       75       95       150\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+\n" +
                            "|      | |      | |      | |      | |      | |      | |▪▪▪▪▪▪▪▪|\n" +
                            "|      | |      | |      | |      | |      | |      | |▪▪▪▪▪▪▪▪|\n" +
                            "|      | |      | |      | |      | |      | |      | |▪▪▪▪▪▪▪▪|\n" +
                            "+------+ +------+ +------+ +------+ +------+ +------+ +-------+"); break;
                }
                if(pole > 7){
                    if(round < 1){
                        System.out.println("Hráč "+ User1 +" přeskočil pole a dostává 0 bodů");
                    }else{System.out.println("Hráč "+ User2 +" přeskočil pole a dostává 0 bodů");}
                    end = true;
                }
                
            }
            if(pole > 7){
                score[round] = 0;
            }else if(pole == 0){
                score[round] = 0;
            }
            else{
                score[round] = body[pole - 1];
                String uziv;
                if(round < 1){
                    uziv = User1;
                }else{uziv = User2;}
                System.out.println("Hráč " + uziv +" dostal "+ score[round] +" bodů!");
            }
        }
        System.out.println("Pokračujte k další hře stiskem ENTER");
        dotaz.nextLine();
        System.out.println("");
        return score;
    }
    
    public static void main(String[] args) {
        Scanner dotaz = new Scanner(System.in);
        Uzivatele();
        System.out.println("Zvolte si 3 hry");
        System.out.println("1. Loterie          2. Ruská ruleta");
        System.out.println("3. Brány            4. Hod");
        System.out.println("5. Kostky");
        
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
                case 4:
                    addScore(Stepping());
                    break;
                case 5:
                    addScore(Cubes());
                    break;
                default:
                    round--;
            }
        }
        Scoreboard();
    }
    
}