import java.util.Scanner;
import java.util.Arrays;


public class PrintFreq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String strings = sc.next();
        char ch[] = strings.toCharArray();
        int j = 0;
        for(int i = 0; i < ch.length; i+=2){
            j = 0;
            while(j < Integer.parseInt(String.valueOf(ch[i+1]))){
                System.out.print(ch[i]);
                j++;
            }
        }    
        
    }
}