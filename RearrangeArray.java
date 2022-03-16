import java.util.Scanner;
import java.util.Arrays;


public class RearrangeArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 1; i < n - 1;i=i+2){
            int t = a[i];
            a[i] = a[i+1] ;
            a[i+1] = t; 
        }
        System.out.println(Arrays.toString(a));
    }
}