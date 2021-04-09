import java.util.Scanner;

class Wandbox
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        
        int count = 0;
        for (int x = 0; x <= k; x++) {
            for (int y = 0; y <= k; y++) {
                int z = n - x - y;
                if (z >= 0 && z <= k) {
                    ++count;
                }
            }
        }
        System.out.println(count);
    }
}