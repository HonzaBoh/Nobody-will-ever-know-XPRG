package xprg;

import java.util.Scanner;

public class Hod {
    
    private String User1;
    private String User2;

    public void setUser1(String User1) {
        this.User1 = User1;
    }

    public void setUser2(String User2) {
        this.User2 = User2;
    }
    
    public int[] Stepping(){
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
            int kostka;
            
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
}
