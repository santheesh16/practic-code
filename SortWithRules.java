import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class SortWithRules{
    
    static boolean isSquareRoot(int number){
        
        double sqrt=Math.sqrt(number);   
        return ((sqrt - Math.floor(sqrt)) == 0);   
    }
    
    static boolean isMulipleDivisible(int n){
        
        if(n%4 == 0 && n%6 == 0){
            return true;
        }
        return false;
    }
    static boolean isEven(int n){
        
        if(n%2 == 0){
            return true;
        }
        return false;
    }
    
    static int[] sortWithPoints(int a[], int points[]){
        int len = a.length;
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                if(points[i] < points[j]){
                    int t = points[i];
                    int tr = a[i];
                    points[i] = points[j];
                    a[i] = a[j];
                    points[j] = t;
                    a[j] = tr;
                }
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> points = new HashMap<Integer, Integer>();
        int[] pon = new int[n];
        for(int i = 0; i < n;i++){
            int count = 0;
            if(isSquareRoot(a[i])){
                count += 5;
            }
            if(isMulipleDivisible(a[i])){
                count += 4;
            }
            if(isEven(a[i])){
                count += 3;
            }
            points.put(a[i], count);
            pon[i] = count;
            System.out.printf("%d=%d\n", a[i], count);
        }
        System.out.println(points);
        System.out.println(Arrays.toString(pon));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(sortWithPoints(a, pon)));
    }
}