import java.util.Scanner;

class Wandbox
{
    static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;
        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        System.out.println(tribonacci(n));
    }
}