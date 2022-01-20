package HeiMa;

import java.util.Arrays;
import java.util.Scanner;

public class Day11_28th {
    public static void main(String[] args) {

        //p51();

        //System.out.println(p65(12,23));

       /* boolean same = p70(10, 20);
        System.out.println(same);
        System.out.println(p70(10,10));*/

        //p71(10);
        //p71(100);

        //p83Array();
        //p93Array_Max();
        //p94Array_reverse();

        //p119Scanner();

        //p149Arrays();

        //p150Reverse();


        String s1="abc";
        String s2="abc";

        // equals比较字符串的内容
        System.out.println(s1.equals(s2));//true
        // ==比较地址值,字符串常量池里面的地址一样的
        System.out.println(s1 == s2);//true

    }


    private static void p150Reverse() {
        String s= "ashf6oahfa8f09df77asnf5q834dnblsjgos";
        char[] chars = s.toCharArray();
        System.out.println(chars);//原来顺序
        Arrays.sort(chars);//排序
        System.out.println(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);//倒叙打印 chars.fori
        }

    }

    private static void p149Arrays() {
        int [] array = {88,11,22,33,44,55,0,66};
        String str  = Arrays.toString(array);//[88,11, 22, 33, 44, 55, 0,66]
        System.out.println("排序前："+str);

        Arrays.sort(array);
        String str2 = Arrays.toString(array);
        System.out.println("排序后："+str2);


        for (int i = 0; i < array.length; i++) {

            Arrays.sort(array);//排序
            System.out.println(array[i]);
        }

    }

    private static void p119Scanner() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("请输入数字");
        int a1 = s1.nextInt();
        int a2 = s1.nextInt();
        int a3 = s1.nextInt();
        int sum = a1+a2+a3;
        System.out.println(sum);

        //三元运算符
        int max1= a1>a2? a1:a2;
        int max= max1>a3? max1:a3;

        System.out.println("最大值："+max);
    }

    public static void p51(){

        int sum=0;
        for (int i = 0; i <= 10; i++) {
            sum+=i;
        }
        System.out.println("总和："+sum);

    }

    public static int p65(int x, int y ){
        int sum = x+y;
        return sum; //或者直接return x+y
    }

    public static boolean p70(int a ,int b){
        //boolean same= a ==b? true:false;
        return a==b;
    }

    public static int p71(int sum){

        int sn=0;
        for (int i = 0; i <= sum; i++) {
            sn+=i;
        }
        System.out.println(sn);
        return sn;
    }

    public static void p83Array(){
        //数组的静态初始化
        int[] array1 ={1,2,3,4,5};
        System.out.println(array1[0]);//1
        System.out.println(array1[1]);//2

        int num5 = array1[4];
        System.out.println(num5);//5
        System.out.println("==========");


        //数组的动态初始化
        int[]array2= new int[5];
        System.out.println(array2[0]);//int类型默认值是0
        System.out.println(array2[1]);//String 默认是null
        System.out.println(array2[4]);//Boolean 默认是false
        System.out.println("==========");

        //向数组里面存数字
        array2[0]=1998;
        array2[1]=1223;
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println("==========");

        for (int i : array1) {
            System.out.println("数组1："+array1[i-1]);
        }
        System.out.println("==========");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("数组2："+array2[i]);
        }

    }

    public static void p93Array_Max(){
        int [] array1 = {2,0,0,4,1,3,1,12,23,0,7,4,3,98,-2,-1};
        int max=array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]>max){
                max = array1[i];
            }
        }
        System.out.println("最大值为："+max);

        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]<min){
                min = array1[i];
            }
        }
        System.out.println("最小值为："+min);


    }

    public static void p94Array_reverse(){
        int[]array={1,2,3,4,5,6};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============");



        //反转
        int temp;
        for (int min = 0,max = array.length-1; max>min ; max--,min++) {
           temp= array[max];
           array[max]=array[min];
           array[min]=temp;
        }
        //遍历
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
