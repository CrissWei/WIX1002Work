package Week1;

import java.util.Random;

public class Lab3 {
    public static void main(String[] args) {

        Q2();
    }
    //Generate a random integer within 0 to 5 and display the integer in word.2 is two
    public static void Q2(){
        Random random = new Random();
        int num = random.nextInt(6);//[0,5]
        System.out.println("随机数:"+num);
        switch (num){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;

            default:
                System.out.println("数据错误");
                break;

        }
    }
}
