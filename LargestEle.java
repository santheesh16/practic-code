import java.util.Scanner;

public class LargestEle{
    
    static int maxValue(int a[], int large){
        int len = a.length;
        int max = a[0];
        for(int j =0; j < large; j++){
            max = a[0];
            for(int i =0; i < len; i++){
                if(a[i] > max) {
                    max = a[i];
                    }
            }
            for(int i =0; i < len; i++){
                if(a[i] == max) {
                    a[i] = 0;
                    }
            }
        }
        
        
        return max;
    }
    
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a[] = new int[len];
        for(int i=0; i<len ; i++  ){
            a[i] = sc.nextInt();
            
        }
        int n = sc.nextInt();
        System.out.println(maxValue(a, n));
     }
}