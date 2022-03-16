import java.util.Scanner;

public class Addition{
    
    static int addTwoNum(int a, int b){
        return a+b;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = sc.nextInt();
        System.out.println("Enter b value:");
        int b = sc.nextInt();
        System.out.println("Sum of Two Integers: "+addTwoNum(a,b));
    }
}
