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
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int count = 0;
            while (a[i] % 2 == 0) {
                a[i] = a[i] / 2;
                ++count;
            }
            if (count < min) {
                min = count;
            }
        }
        System.out.println(min);
    }
}