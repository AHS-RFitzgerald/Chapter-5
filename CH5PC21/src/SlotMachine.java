/**
 * Richard Fitzgerald
 * Project
 * Programming III - AP
 * Date
 */
import java.util.Scanner;
import java.util.Random;
public class SlotMachine {

   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int num1 = r.nextInt(5 + 0);
        int num2 = r.nextInt(5 + 0);
        int num3 = r.nextInt(5 + 0);
        String slots1 = "", slots2 = "", slots3 = "";
        int cash, cashBack;
        System.out.println("How much money would you like to enter?");
        cash = keyboard.nextInt();
        if(num1 == 0){
            slots1 += "Cherries, ";
        }else if(num1 == 1){
            slots1 += "Oranges, ";
        }else if(num1 == 2){
            slots1 += "Plums, ";
        }else if(num1 == 3){
            slots1 += "Bells, ";
        }else if(num1 == 4){
            slots1 += "Melons, ";
        }else if(num1 == 5){
            slots1 += "Bars, ";
        }
        if(num2 == 0){
            slots1 += "Cherries, ";
        }else if(num2 == 1){
            slots1 += "Oranges, ";
        }else if(num2 == 2){
            slots1 += "Plums, ";
        }else if(num2 == 3){
            slots1 += "Bells, ";
        }else if(num2 == 4){
            slots1 += "Melons, ";
        }else if(num2 == 5){
            slots1 += "Bars, ";
        }
        if(num3 == 0){
            slots1 += "Cherries";
        }else if(num3 == 1){
            slots1 += "Oranges";
        }else if(num3 == 2){
            slots1 += "Plums";
        }else if(num3 == 3){
            slots1 += "Bells";
        }else if(num3 == 4){
            slots1 += "Melons";
        }else if(num3 == 5){
            slots1 += "Bars";
        }
        System.out.println(slots1 + "" + slots2 + "" + slots3);
        if(slots1 == slots2 && slots2 == slots3){
            cashBack = cash *3;
            System.out.println("You have earned triple what you put in which"
                    + "comes to $" + cashBack);
        }else if(slots1 == slots2 || slots1 == slots3 || slots2 == slots3){
            cashBack = cash * 2;
            System.out.println("You have earned double what you put in which"
                    + "comes to $" + cashBack);
        }else{
            System.out.println("You have earned $0");
        }
    }

}
