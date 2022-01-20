package week2;

import java.util.Random;
import java.util.Scanner;

public class T5_Lab5 {
    public static void main(String[] args) {

        //Q1();
    }
    public static void Q1(){
        //a: Declare an array that used to store 12 floating point numbers
        float[]num1 = new float[12];

        //b: Initialize an array that used to store the value of A to E.
        char[] num2 = {'A','B','C','D','E'};

        //C:Declare an array that used to store 100 students name.
        String[] NAME = new String[100];

        //dDeclare an array for a table with 6 rows 2 columns that used to store integervalue.
        int [][]table = new int[6][2];

        //e: Initialize an array with the following value:
        int[][] num_E = {{6,9},{2,5},{4,6}};

        num_E[1][1]=4;
        num_E[2][0]=3;
        num_E[2][1]=7;

        //f:
        int [] contact={1,2,3};
        for (int i = 0; i < contact.length; i++) {
            System.out.println(i);
        }
        String sentence = "s";

    }

    public static void Lab5_Q1(){
        /*Q1:Write a program to randomly generate N student scores (0-100).
         The program will prompt the user to enter N students and store the score in an array.
         Then, the program will display a list of score, the highest score, the lowest score and the average score.
        */
        Scanner sc= new Scanner(System.in);
        Random r = new Random();

        System.out.println("请输入");

        int N = sc.nextInt();


    }
    public static void Lab5_Q2(){
        Random r = new Random();

        int[] non_duplicate_int = new int[10];

        for (int i = 0; i < non_duplicate_int.length; i++) {
            int num = r.nextInt(21);
            boolean duplicate =false;
        }

        for (int i = 0; i < i+1; i++) {

        }

    }
    public static void Lab5_Q3(){}
    public static void Lab5_Q4(){}
    public static void Lab5_Q5(){}
    public static void Lab5_Q6(){}
    public static void Lab5_Test(){}
}
