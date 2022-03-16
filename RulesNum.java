import java.util.Scanner;
import java.util.Arrays;


public class RulesNum{
    
    static boolean sumRev(int s){
        
        int n = s, sum = 0, rev = 0, rem = 0;
        while(n > 0){
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        int tem = sum;
        while(tem > 0){
            rem = tem%10;
            rev = (rev * 10) + rem;
            tem = tem/10;
        }
        return (sum*rev == s);
    } 
    
    static void getRuleNums(int m, int n){
        int ruleNum[] = new int[n];
        int k = 0;
        for(int i = m; i < n;i++){
            if(sumRev(i)){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        getRuleNums(m,n);
    }
}