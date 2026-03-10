package testing;

import java.util.Scanner;

public class Functions {

    public static  void forLoop(){
        System.out.println("-> FOR LOOP:- If you want to execute certain things for certain times ");
        System.out.println();
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
        System.out.println("-> WHILE LOOP:- If you don't how many times the code should execution");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your starting index here:");
        int start = scan.nextInt();
        System.out.println("enter your ending index here:");
        int end = scan.nextInt();

while (start< end) {
    System.out.println("Enter the running index:");
    int userValue = scan.nextInt();

    System.out.println("while(" + userValue + " < " + end + "){");
    System.out.println("Hello World!");
    System.out.println("i++; //HERE THE i VALUE WILL BE INCREMENTED FOR execution");
    System.out.println("}");
start++;
}
    }

    public static void ifCondition(){
        Scanner scan = new Scanner(System.in);
        System.out.println("-> IF CONDITION:-To check if th condition is ture or not ");
        System.out.println();

        System.out.println("give any two number if the first number is greater than second");

        System.out.println("enter num1:");
        int num1 = scan.nextInt();
        System.out.println("enter num2:");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("if( "+ num1+" > "+num2+"){");
            System.out.println("TURE");
            System.out.println("}");

        }else {
            System.out.println("NO, to check the num1 value should greater than nums2");
            System.out.println("code is FALSE");
        }

    }
}
