package Array;

public class Prefix_Sum {
    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                cur = 0;
                for (int k = i; k <= j; k++) {
                    cur += arr[k];
                }
                System.out.println(cur);
                if (max < cur) {
                    max = cur;
                }
            }
        }
        System.out.println(max);
    }
}

