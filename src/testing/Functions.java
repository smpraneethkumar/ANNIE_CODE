package testing;

import java.util.Scanner;

public class Functions {

    public static  void forLoop(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your starting index here:");
        int start = scan.nextInt();
        System.out.println("enter your ending index here:");
        int end = scan.nextInt();

        int a = start;
        if(start >end){

        System.out.println("(for i =" +start+"; i < "+end+"; i++) {");
        System.out.println("hello world");
        System.out.println("}");

        }else {
            System.out.println("you have to enter greater END index number");
        }


    }
}
