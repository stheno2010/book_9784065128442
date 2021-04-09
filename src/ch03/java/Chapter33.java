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
        
        int minGold = Integer.MAX_VALUE;
        int minSilver = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < minGold) {
                minSilver = minGold;
                minGold = a[i];
            } else if (a[i] < minSilver) {
                minSilver = a[i];
            }
        }
        
        System.out.println(minSilver);
    }
}