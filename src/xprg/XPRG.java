package xprg;

import java.util.Scanner;

public class XPRG {
    
    public static void main(String[] args) {
        UI hraci = new UI();
        Scanner dotaz = new Scanner(System.in);
        hraci.Uzivatele();
        System.out.println("Vybíráte si 3 hry");
        
        for(int round = 0; round < 3; round++){
            
            System.out.println("Zvolte si " + (round + 1) + ". hru:");
            System.out.println("------------------------------------");
            System.out.println("1. Loterie          2. Ruská ruleta");
            System.out.println("3. Brány            4. Hod");
            System.out.println("5. Kostky");
            System.out.println("------------------------------------");
            
            if(round%2 == 0){
                System.out.println("Volí hráč " + hraci.User1);
            }else{System.out.println("Volí hráč " + hraci.User2);}
            
            switch(dotaz.nextInt()){
                case 1: 
                    Loterie hra1 = new Loterie();
                    hra1.setUser1(hraci.User1);
                    hra1.setUser2(hraci.User2);
                    hraci.addScore(hra1.Lottery());
                    break;
                case 2:
                    Ruleta hra2 = new Ruleta();
                    hra2.setUser1(hraci.User1);
                    hra2.setUser2(hraci.User2);
                    hraci.addScore(hra2.Rulette());
                    break;
                case 3:
                    Brany hra3 = new Brany();
                    hra3.setUser1(hraci.User1);
                    hra3.setUser2(hraci.User2);
                    hraci.addScore(hra3.Gates());
                    break;
                case 4:
                    Hod hra4 = new Hod();
                    hra4.setUser1(hraci.User1);
                    hra4.setUser2(hraci.User2);
                    hraci.addScore(hra4.Stepping());
                    break;
                case 5:
                    Kostky hra5 = new Kostky();
                    hra5.setUser1(hraci.User1);
                    hra5.setUser2(hraci.User2);
                    hraci.addScore(hra5.Cubes());
                    break;
                default:
                    System.out.println("Zadali jste číslo, které nezvolí ani jednu hru. Zadjte prosím další číslo.");
                    round--;
            }
        }
        hraci.Scoreboard();
    }
    
}