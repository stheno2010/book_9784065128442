import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Wandbox
{
    static Map<Integer, Integer> map = new HashMap<>();
    static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (map.containsKey(n)) return map.get(n);
        map.put(n, tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3));
        return map.get(n);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        System.out.println(tribonacci(n));
    }
}