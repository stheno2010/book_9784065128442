import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Wandbox
{
    static int [][] memo = null;
    static boolean func(int i, int w, int[] a) {
        if (i == 0) {
            return (w == 0);
        }
        if (memo[i][w] != 0) {
            return true;
        }
        if (func(i-1, w, a)) {
            memo[i][w] = 1;
            return true;
        }

        if (func(i-1, w-a[i-1], a)) {
            memo[i][w] = 1;
            return true;
        }
        
        memo[i][w]=0;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = scan.nextInt();
        }
        
        memo = new int[n+1][w+1];
        System.out.println(func(n, w, a));
    }
}