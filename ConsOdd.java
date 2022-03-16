import java.util.Scanner;

public class ConsOdd{
    
    
    static boolean threeOdd(int a[]){
        int len = a.length;
        int cons = 0;
        for(int i = 0; i < len; i++){
            if(a[i]%2 == 1){
                if(cons == 3){
                    break;
                }
               cons++;
            }else{
               cons--;
            }
        }
        if(cons == 3){
           return true;
        }else{
           return false;
        }
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len = sc.nextInt();
        int a[] = new int[len];
        System.out.println("Enter elements of array");
        for(int i = 0;i < len; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(threeOdd(a));
    }
}