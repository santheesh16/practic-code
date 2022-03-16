import java.util.Scanner;
import java.util.Arrays;

public class LargestElement{
    
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a[] = new int[len];
        for(int i=0; i<len ; i++  ){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int pos = sc.nextInt();
        System.out.println(a[pos]);
     }
}