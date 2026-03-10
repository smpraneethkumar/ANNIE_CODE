package testing;

import java.util.Scanner;

public class Functions {

    public static  void forLoop(){
        System.out.println("-> FOR LOOP:- If you want to execute certain things for certain times ");
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your starting index here:");
        int start = scan.nextInt();
        System.out.println("enter your ending index here:");
        int end = scan.nextInt();

        int  i =0;
        while (i<end){
            System.out.println("Enter the running index:");
        int userValue = scan.nextInt();
        System.out.println("for(i = " +userValue+"; i < "+end+"; i++) {");
        System.out.println("Hello World!");
        System.out.println("}");

        if(userValue > end){
            System.out.println("Now here the index value is "+userValue+"increased more than stating index ");
            return;
        }else {
            System.out.println("now i value "+ userValue);
        }

        }

    }

    public  static void whileLoop(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your starting index here:");
        int start = scan.nextInt();
        System.out.println("enter your ending index here:");
        int end = scan.nextInt();

while (start< end) {


    System.out.println("while(" + start + " < " + end + "){");
    System.out.println("Hello World!");
    System.out.println("i++; //HERE THE i VALUE WILL BE INCREMENTED");
    System.out.println("}");
start++;
}
    }
}
