package Week1;

import java.util.Random;

public class lab4 {
    public static void main(String[] args) {

        Q5();
    }
    public static void Q5(){
        /*Question5:
        * Write a simple two players dice game.
        * Each player will take turns to roll a dice.
        * The first players that reach more than 100 points win the game.
        * If the player rolls a 6, the player will score 6 points and has the chance to roll again.
*/
        Random user1 = new Random();
        Random user2 = new Random();
        int sum_user1 =0;
        int sum_user2 =0;
        int count1 =0;
        int count2 =0;
        while (sum_user1<=100){
            int i = user1.nextInt(6)+1 ;//[1,6]
            sum_user1+=i;
            //count1=i;
            count1++;

            //System.out.println(i);
        }
        while (sum_user2<=100){
            int i = user2.nextInt(6)+1 ;//[1,6]
            sum_user2+=i;
            //count1=i;
            count2++;

            //System.out.println(i);
        }
        if (count1<count2){
            System.out.println("user1 win!!!");
        }
        if (count1>count2){
            System.out.println("user2 win!!!");
        }
        else {
            System.out.println("Tie!!!");
        }
        System.out.println("user1次数："+count1);
        System.out.println("user2次数："+count2);
        System.out.println("user1总和："+sum_user1);
        System.out.println("user2总和："+sum_user2);


    }
}
