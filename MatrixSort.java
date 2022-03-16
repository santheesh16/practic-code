import java.util.Scanner;
import java.util.Arrays;


public class MatrixSort{
    
    static int row = 4,col = 4;
    static int[][] sort2DArray(int a[][]){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                for(int k = 0; k < row; k++){
                    for(int l = 0; l < col; l++){
                        if(a[i][j] < a[k][l]){
                            int t = a[i][j];
                            a[i][j] = a[k][l];
                            a[k][l] = t;                            
                        }
                    }
                }
            }
        }        
        return a;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m , n ;
        m = n = row;
        int a[][] = new int[m][n];
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }        
        int a1[][] = sort2DArray(a);
        for(int[] oneArr: a1){
            System.out.println(Arrays.toString(oneArr));
        }
        int i = 0, t =0; 
        while(i < m){
            if(i%2 != 0){
                for(int j = 0; j < n/2; j++){
                    for(int k = m - 1 ; k > n/2 ; k--){
                        if(j != k){
                            t = a[i][j];
                            a[i][j] = a[i][k];
                            a[i][k] = t; 
                        }
                    }
                }
            }
            i++;
        }
        for(int[] oneArr: a1){
            System.out.println(Arrays.toString(oneArr));
        }
    }
}