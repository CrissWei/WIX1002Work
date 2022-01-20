
package HeiMa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Day11_29th<i, arrayList> {
    public static void main(String[] args) {

        //p130Arraylist2();
        //p130Arraylist();

        Tutorial1_Q11();
    }

    //11. Display a list of 5 random numbers in descending order. (Sort)
    private static void Tutorial1_Q11() {
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        int num = 0;
        for (int i = 0; i < 5; i++) {
            num = random.nextInt(100);
            System.out.println(num);

            //将五个随机数添加到数组里面,这样就可以使用sort排序
            arr.add(num);
        }
        System.out.println(arr);
        System.out.println("===");


        //private static void p130Arraylist2 () {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
            System.out.println(integers);
        }
    }

    public static void p130Arraylist() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            int num = random.nextInt(33) + 1;//[1,33]
            arrayList.add(num);//把产生的随机数添加的集合
            //System.out.println(arrayList);
        }
        System.out.println(arrayList);
        System.out.println("===========");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}




