package Array;

public class prefix_array {
   public static void main(String args []){
   int arr [] = {2,4,6,8,10};
   int curr = 0 ;
   int max = Integer.MIN_VALUE;
   int prefix [] = new int [arr.length];
     prefix[0] = arr[0];
     for(int i = 1; i<arr.length; i++){
         prefix[i] = prefix[i-1]+arr[i];
     }
     for(int i = 0; i<arr.length; i++){
         for(int j = i; j<arr.length; j++){
             curr = i==0?prefix[j] : prefix[j]-prefix[i-1];
             if(max<curr){
                 max= curr;
             }
         }
     }
       System.out.println(max);
   }
}