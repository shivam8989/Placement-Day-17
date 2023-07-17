package Patterns;

public class HollowRectangle {
    public static void main(String args []){
        int size = 5;
        int m  = 6;
        for(int i =1; i<=size; i++){
            for(int j = 1; j<=m; j++){
                if(i==1||j==1||i==size||j==m){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }


            }
            System.out.println();
        }
    }
}
