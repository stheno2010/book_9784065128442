import java.util.Scanner;

class Wandbox
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        
        long res = 0;
        for (int bit = 0; bit < (1<<(n-1)); ++bit) {
            long tmp = 0;
            for (int i = 0; i < n-1; ++i) {
                tmp *= 10;
                tmp += s.charAt(i) - '0';
                if ((bit & (1<<i)) != 0) {
                    res += tmp;
                    tmp = 0;
                }
            }
            tmp *= 10;
            tmp += s.charAt(n-1) - '0';
            res += tmp;
        }
        System.out.println(res);
    }
}