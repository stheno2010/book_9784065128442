import java.util.Scanner;

class Wandbox
{
    static int count(int n, int cur, int use) {
        if (cur > n) return 0;
        int count=0;
        if (use == 0b111) ++count;
        
        count += count(n, cur * 10 + 7, use | 0b001);
        count += count(n, cur * 10 + 5, use | 0b010);
        count += count(n, cur * 10 + 3, use | 0b100);
        return count;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        System.out.println(count(n, 0, 0));
    }
}