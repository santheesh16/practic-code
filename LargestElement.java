import java.util.Scanner;

public class LargestElement{
    
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a[] = new int[len];
        for(int i=0; i<len ; i++  ){
            a[i] = sc.nextInt();
        }
        int temp = 0;
        for(int i = 0; i < len;i++){
            for(int j = i+1; j < len; j++ ){
                if(a[i]> a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int n = sc.nextInt();
        int pos = a.length - n;
        System.out.println(a[pos]);
     }
}