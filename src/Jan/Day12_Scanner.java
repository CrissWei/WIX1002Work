package Jan;

import java.util.ArrayList;
import java.util.Scanner;

public class Day12_Scanner {
    public static void main(String[] args) {
        //getAdd();//输入2个数，求和         老师
        //getMax();//输入3个数，求最大值     老师
        getMax2();//输入N个数，求最大值      原创
    }

    private static void getMax2() {
        ArrayList<Integer> arr = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int num;
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入数字");
            num = scanner.nextInt();
            arr.add(num);
        }


        System.out.println("数字有："+arr);
        System.out.println("-----------");

        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (max< arr.get(i)){
                max = arr.get(i);
            }
        }
        System.out.println("最大值是"+max);

    }

    private static void getMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else if (c > b) {
            System.out.println(c);
        } else {
            System.out.println("数据错误，请重新输入数字");
        }

      /*  int temp= a>b? a:b;
        int max = temp>c? temp:c;
        System.out.println("最大值是："+max);*/


    }

    private static void getAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("和是：" + sum);
    }
}
