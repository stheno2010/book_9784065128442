class Wandbox
{
    public static void main(String[] args)
    {
        for (int x1=0; x1<10; x1++) {
            int x = 2*10 + x1;
            for (int y1=0; y1<10; y1++) {
                int xy1 = x*y1;
                for (int y2=0; y2<10; y2++) {
                    int xy2 = x*(y2*10);
                    int xy = xy1+xy2;
                    if (100 <= xy1 && xy1 < 1000 && (xy1/10)%10 == 3 &&
                        10 <= xy2 && xy2 < 1000 &&
                        100 <= xy && xy < 1000 && (xy/10)%10 == 4) {
                        System.out.println(String.format("2%s*%s%s=%s", x1, y2, y1, xy));
                    }
                }
            }
        }
    }
}