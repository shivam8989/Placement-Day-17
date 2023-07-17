package Patterns;

public class NumberStar {
    public static void main(String args[]){
        int n = 7;
        int a = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(j);
            }
            for(int j = (2*n)-(2*i); j>2; j--){
                System.out.print("*");
            }
            for(int j = i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
