import java.util.Scanner;

class Wandbox
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        
        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }
        
        System.out.println(min);
        System.out.println(max);
    }
}