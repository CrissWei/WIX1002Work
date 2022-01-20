package Jan;

public class D11 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,50,6,6,5,40};

        getMax(arr);

    }

    private static void getMax(int[] arr) {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("最大值："+max);


    }

}
