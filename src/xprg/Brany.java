package xprg;

import java.util.Random;
import java.util.Scanner;

public class Brany {
    
    private String User1;
    private String User2;

    public void setUser1(String User1) {
        this.User1 = User1;
    }

    public void setUser2(String User2) {
        this.User2 = User2;
    }
    
    public int[] Gates(){
        System.out.println("\n" + 
                "Vítejte. Zde budete procházet branami, ale pozor ne všechny jsou správné.\n" + 
                "V prvních čtyřech řadách je vždy jedna náhodně vybraná brána špatná. Pokud si ji vyberete prohráváte, pokud si vyberete správnou bránu, pokračujete na další řadu.\n" +
                "Jakmile si vyberete všechny čtyři brány správně budete mít za úkol se vrátit, ale tentokrát už bude správně jen jedna brána.\n" +
                "Hráči si mohou vybírat brány pomocí číslic napsaných na branách, pokud zvolí jinou číslici automaticky prohrávají.\n" + 
                "Hodně štěstí.\n");
        int[][] gates = {{0, 0, 0, 0, 0},
                         {0, 0, 0, 0},
                         {0, 0, 0},
                         {0, 0},
                        };
        /*for(int i = 0; i < brany.length; i++){
            System.out.println(Arrays.toString(brany[i]));
        }*/
        Random random = new Random();
        for(int i = 0; i < gates.length; i++){
            int ran = random.nextInt(gates[i].length);
            gates[i][ran] = 1;
            //System.out.println(Arrays.toString(gates[i]));
        }
        char tab = 9;
        boolean p1Alive = true; //controls if player one is alive and can continue, when false he ends
        boolean p2Alive = true; //controls if player two is alive and can continue, when false he ends
        int gatesArray = 0; //is set in what array are we in gates[][]
        int p1End = 0; //in wich array from gates[][] did player one ended
        int p2End = 0; //in wich array from gates[][] did player two ended
        int branaHrace1 = 0;
        int branaHrace2 = 0;
        int branaSHrace1 = 0;
        int branaSHrace2 = 0;
        int[] score = {0, 0}; // score[0] is for player one, score[1] for player two
        while(gatesArray < gates.length){
           try{
            switch(gatesArray){
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
            if(p1Alive == true){
               
                Scanner sc = new Scanner(System.in);
                System.out.println("Hraje hráč "+ User1 +". Vyberte brány 1-" + gates[gatesArray].length + ".");
                branaHrace1 = sc.nextInt() - 1;
                /*if(playersChoice >= gates[gatesArray].length || playersChoice < 0){
                System.out.println("Player one tried to go around gates, but died he doesn't continue.");
                p1Alive = false;
                }*/
                    if(gates[gatesArray][branaHrace1] == 0){
                    //    System.out.println("Správná volba hráč číslo jedna pokračuje.");
                        p1End = gatesArray + 1;
                    }
                    else{
                    //    System.out.println("Špatně hráč číslo jedna končí.");
                        p1Alive = false;
                    }
                score[0] = p1End * 5 + score[0];
            }
            if(p2Alive == true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Hraje hráč " + User2 + ". Vyberte brány 1-" + gates[gatesArray].length + ".");
                branaHrace2 = sc.nextInt() - 1;
                /*if(branaHrace2 > gates[gatesArray].length){
                System.out.println("Player two tried to go around gates, but died he doesn't continue.");
                p2Alive = false;
                }*/
                    if(gates[gatesArray][branaHrace2] == 0){
                    //    System.out.println("Správná volba hráč číslo dva pokračuje.");
                        p2End = gatesArray + 1;
                    }
                    else{
                    //    System.out.println("Špatně hráč číslo dva končí.");
                        p2Alive = false;
                    }
                score[1] = p2End * 5 + score[1];
            }
           }
           catch(ArrayIndexOutOfBoundsException p){
               if(branaHrace1 < 0 || branaHrace1 >= gates[gatesArray].length){
                //    System.out.println(branaHrace1);
                    System.out.println("Hráč " + User1 + " se snažil obejít brány a to se mu nepovedlo, hlavu mu sťala gilotina a už nepokračuje.");
                    p1Alive = false;
                    if(p2Alive == true){
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Hraje hráč " + User2 + ". Vyberte brány 1-" + gates[gatesArray].length + ".");
                        branaHrace2 = sc.nextInt() - 1;
                        if(gates[gatesArray][branaHrace2] == 0){
                        p2End = gatesArray + 1;
                        }
                        else{
                            p2Alive = false;
                        }
                    score[1] = p2End * 5 + score[1];
                    }
              }
              if(branaHrace2 < 0 || branaHrace2 >= gates[gatesArray].length){
                  System.out.println(branaHrace2);
                  System.out.println("Hráč " + User2 + " se snažil obejít brány a to se mu nepovedlo, hlavu mu sťala gilotina a už nepokračuje.");
                  p2Alive = false;
              } 
           }
            if(p1Alive == true){
                System.out.println("Hráč " + User1 + " si vybral správnou bránu a tak pokračuje dál.");
            }
            else{
                System.out.println("Hráč " + User1 + " si vybral špatnou bránu a umřel záhadnou smrtí, proto už nepokračuje.");
            }
            if(p2Alive == true){
                System.out.println("Hráč " + User2 + " si vybral správnou bránu a tak pokračuje dál.");
            }
            else{
                System.out.println("Hráč " + User2 + " si vybral špatnou bránu a umřel záhadnou smrtí, proto už nepokračuje.");
            }
            gatesArray++;
            if(p1Alive == false && p2Alive == false){
                System.out.println("Hráč " + User1 + " dostal " + score[0] + " bodů");
                System.out.println("Hráč " + User2 + " dostal " + score[1] + " bodů");
                gatesArray = gates.length;
            }
        }
        
        int[][] branyS = {{1, 1, 1, 1, 1},
                          {1, 1, 1, 1},
                          {1, 1, 1},
                          {1, 1},
                         };
        if(gatesArray == gates.length && p1Alive == true || gatesArray == gates.length && p2Alive == true){
            gatesArray = 3;
            System.out.println("Prohozeno, nyní je jen jedna brána správná, zkuste se vrátit.");
            /*for(int i = 0; i < branyS.length; i++){
                System.out.println(Arrays.toString(branyS[i]));
            } */
            Random randomS = new Random();
            for(int i = 0; i < branyS.length; i++){
                int ran = random.nextInt(branyS[i].length);
                branyS[i][ran] = 0;
                //System.out.println(Arrays.toString(branyS[i]));
            }   
        }
        int radaSBran = 0; //když se rovná 3 tak se hráč vrátil na začátek a dokončil hru
        while((gatesArray >= 0 && p1Alive == true) || (gatesArray >= 0 && p2Alive == true)){
            try{
            switch(gatesArray){
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
            if(p1Alive == true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Hraje hráč " + User1 + ".");
                branaSHrace1 = sc.nextInt() - 1;
                if(branyS[gatesArray][branaSHrace1] == 0 && radaSBran != 3){
                //    System.out.println("Správná volba hráč číslo jedna pokračuje.");
                    p1End = radaSBran + 1;
                }
                else if(branyS[gatesArray][branaSHrace1] == 0 && radaSBran == 3){
                //    System.out.println("Správná volba hráč číslo jedna došel do konce.");
                    p1End = radaSBran + 1;
                }
                else{
                //    System.out.println("Špatně hráč číslo jedna končí.");
                    p1Alive = false;
                }
                score[0] = p1End * 10 + score[0];
            }
            if(p2Alive == true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Hraje hráč " + User2 + ".");
                branaSHrace2 = sc.nextInt() - 1;
                if(branyS[gatesArray][branaSHrace2] == 0 && radaSBran != 3){
                //    System.out.println("Správná volba hráč číslo dva pokračuje.");
                    p2End = radaSBran + 1;
                }
                else if(branyS[gatesArray][branaSHrace2] == 0 && radaSBran == 3){
                //    System.out.println("Správná volba hráč číslo dva došel do konce.");
                    p2End = radaSBran + 1;
                }
                else{
                //    System.out.println("Špatně hráč číslo dva končí.");
                    p2Alive = false;
                }
                score[1] = p2End * 10 + score[1];
            }
            }
            catch(ArrayIndexOutOfBoundsException p){
               if(branaSHrace1 < 0 || branaSHrace1 >= gates[gatesArray].length){
                //    System.out.println(branaHrace1);
                    System.out.println("Hráč " + User1 + " se snažil obejít brány a to se mu nepovedlo, hlavu mu sťala gilotina a už nepokračuje.");
                    p1Alive = false;
                    if(p2Alive == true){
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Hraje hráč " + User2 + ". Vyberte brány 1-" + gates[gatesArray].length + ".");
                        branaSHrace2 = sc.nextInt() - 1;
                        if(gates[gatesArray][branaSHrace2] == 0){
                        p2End = gatesArray + 1;
                        }
                        else{
                            p2Alive = false;
                        }
                    score[1] = p2End * 10 + score[1];
                    }
              }
              if(branaSHrace2 < 0 || branaSHrace2 >= gates[gatesArray].length){
                  System.out.println("Hráč " + User2 + " se snažil obejít brány a to se mu nepovedlo, hlavu mu sťala gilotina a už nepokračuje.");
                  p2Alive = false;
              } 
           }
            if(p1Alive == true){
                System.out.println("Hráč " + User1 + " si vybral správnou bránu a tak pokračuje dál.");
            }
            else if(p1Alive == true && radaSBran == 3){
                System.out.println("Hráč " + User1 + " si vybral správnou bránu, ale dále už nejsou další brány, tak vám gratuluji přežil jste.");
            }
            else{
                System.out.println("Hráč " + User1 + " si vybral špatnou bránu a umřel záhadnou smrtí, proto už nepokračuje.");
            }
            if(p2Alive == true){
                System.out.println("Hráč " + User2 + " si vybral správnou bránu a tak pokračuje dál.");
            }
            else if(p2Alive == true && radaSBran == 3){
                System.out.println("Hráč " + User2 + " si vybral správnou bránu, ale dále už nejsou další brány, tak vám gratuluji přežil jste.");
            }
            else{
                System.out.println("Hráč " + User2 + " si vybral špatnou bránu a umřel záhadnou smrtí, proto už nepokračuje.");
            }
            if(gatesArray == 0 || (p1Alive == false && p2Alive == false)){
                System.out.println("Hráči " + User1 + " bylo přičteno " + score[0] + " bodů");
                System.out.println("Hráči " + User2 + " bylo přičteno " + score[1] + " bodů");
            }
            gatesArray--;
            radaSBran++;
        }
        Scanner ukonceni = new Scanner(System.in);
        System.out.println();
        System.out.println("Pokračujte k další hře stiskem ENTER");
        ukonceni.nextLine();
        System.out.println();
        return score;
    }
}
