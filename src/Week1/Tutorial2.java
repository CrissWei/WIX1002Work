package Week1;

import java.util.Scanner;

public class Tutorial2 {
    public static void main(String[] args) {


        Q7();
    }
    public static void Q7(){
        // Write a java program that converts inches to meters.
        // (Given 1 inch equals to 2.54centimeters).
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入英寸数字：");
        double inches = scanner.nextDouble();

        double cm = inches*2.54;
        System.out.println(inches+"英寸等于"+cm+"厘米");
    }
}
