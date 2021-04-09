import java.util.Scanner;

class Wandbox
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == v) {
                ++count;
            }
        }
        
        System.out.println(count);
    }
}