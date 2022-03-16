import java.util.Scanner;
import java.util.Arrays;


public class FindFreqChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(char ch = 'a'; ch <= 'z'; ch++){
            int c = 0;
            for(int i = 0; i< s.length(); i++){
                if(ch == s.charAt(i))
                    c++;
            }
            if(c !=0){
                System.out.println(ch + "\t" +c);
            }
        }    
        
    }
}