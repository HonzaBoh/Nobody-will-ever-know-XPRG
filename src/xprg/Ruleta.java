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
        System.out.println("V této hře si zvolíte, která komora na vás padne.");
        System.out.println("V jedné komoře je náboj.");
        System.out.println("Zvolte si pozici (1 - 6), kde nahradíte jednoho z Rusů a stanete se možným cílem:");
        String[] pozice = {"Igor", "Boris", "Dmitrij", "Vladimir", "Alexei", "Ivan"};
        
        String prohra = "    _____\n" +
                        "  /~/~   ~\\\n" +
                        " | |       \\\n" +
                        " \\ \\        \\\n" +
                        "  \\ \\        \\\n" +
                        " --\\ \\       .\\''\n" +
                        "--==\\ \\     ,,i!!i,\n" +
                        "    ''\"'',,}{,,";
        
        String vystrel =    "            ||||||||||||||                                                d8888o8888b\n" +
                            "           =              \\                                               88888888888\n" +
                            "           =               |                                             d88888888888b\n" +
                            "          _=            ___/                                     `-..____HHHHHHHHHHHHH____.,-'\n" +
                            "         / _\\           (o)\\                                             /___, : .___\\\n" +
                            "        | | \\            _  \\                                           _) >=-( )-=< (_\n" +
                            "        | |/            (____)                                         ( (    / \\    ) )\n" +
                            "         \\__/          /   |                                            \\_\\  ((_))  /_/\n" +
                            "          /           /  ___)                                             |)/  :  \\(|\n" +
                            "         /    \\       \\    _)                       )                     |(,-----.)|\n" +
                            "        \\      \\           /                       (                      \\   '\"`   /\n" +
                            "      \\/ \\      \\_________/   |\\_________________,_ )                     |`---\"---'|\n" +
                            "       \\/ \\      /            |     ==== _______)__)                      |   `-'   |\n" +
                            "        \\/ \\    /           __/___  ====_/\n" +
                            "         \\/ \\  /           (O____)\\\\_(_/\n" +
                            "                          (O_ ____)\n" +
                            "                           (O____)\n";

        Random reload = new Random();
        int bullet = reload.nextInt(pozice.length);
        
        
        System.out.println(Arrays.toString(pozice));
        Scanner dotaz = new Scanner(System.in);
        System.out.println("Pozice hráče "+ User1 + ":");
        boolean zvolenoU1 = false;
        int pozice1 = 0;
        while(!zvolenoU1){
            pozice1 = dotaz.nextInt() - 1;
            if(pozice1 > 5){
                System.out.println("Zadali jste větší číslo, než je počet komor");
                System.out.println("Zadejte číslo znovu");
            }else{
                zvolenoU1 = true;
            }
        }
        pozice[pozice1] = User1;
        System.out.println("Pozice hráče " + User2 + ":");
        boolean zvolenoU2 = false;
        int pozice2 = 0;
        while(!zvolenoU2){
        pozice2 = dotaz.nextInt() - 1;
        if(pozice2 > 5 || pozice2 == pozice1){
                System.out.println("Zadali jste větší číslo, než je počet komor, nebo jste zvolil číslo obsazené hráčem, který volil před vámi.");
                System.out.println("Zadejte číslo znovu");
            }else{
                zvolenoU2 = true;
            }
        
        }
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
        boolean shot = false;
     
        for(int i = 0; i < pozice.length && !shot; i++){
            System.out.println("                                                                           " +pozice[i]);
            System.out.println(vystrel);
            dotaz2.nextLine();
            
            if(i == bullet){
                System.out.println(pozice[i]);
                System.out.println(prohra);
                shot = true;
            }
            else{
                System.out.println("V komoře nebyl náboj");
            }
        
        }
        System.out.println("Náboj byl v " + (bullet + 1) +". komoře, zastřelen byl: " + pozice[bullet]);
        pozice[bullet] = "ZASTŘELENÝ";
        System.out.println(Arrays.toString(pozice));
        System.out.println("Přeživší dostávají 50 bodů!");
        
        System.out.println("Pokračujte k další hře stiskem ENTER");
        dotaz.nextLine();
        System.out.println("");
        
        return score;
    }
}
