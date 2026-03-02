package testing;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main extends Functions{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true){

            System.out.println("====== WANT TO LEARN CODING ======");
            System.out.println("1. for loop");
            System.out.println("2. while");
            System.out.println("3. if");
            System.out.println("4. if-else");
            System.out.println("5. switch");

        int option = scan.nextInt();
        switch(option){
            case 1: forLoop();
                break;
            case 2,3,4,5:
                System.out.println("WORKING NO THEM!!!!!");
                break;

            default:
                System.out.println("-> choose the right option <-");
        }
        }

    }
}
