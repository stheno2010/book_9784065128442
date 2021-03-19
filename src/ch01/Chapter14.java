class Wandbox
{
    public static void main(String[] args)
    {
        for (int x1=0; x1<10; x1++) {
            for (int x2=0; x2<10; x2++) {
                for (int x3=0; x3<10; x3++) {
                    for (int x4=0; x4<10; x4++) {
                        for (int x5=0; x5<10; x5++) {
                            for (int x6=0; x6<10; x6++) {
                                long x = x6*100000+x5*10000+x4*1000+x3*100+x2*10+x1;
                                for (int y1=0; y1<10; y1++) {
                                    long xy1 = x*y1;
                                    if (!(  100000L <= xy1 && xy1 <     1000000L &&                           (xy1/100000L)%10 == 6 && (xy1/10000L)%10 == 6)) {
                                        continue;
                                    }
                                    for (int y2=0; y2<10; y2++) {
                                        long xy2 = x*y2*10;
                                        if (!(   1000000L <= xy2 && xy2 <    10000000L && (xy2/1000000L)%10 == 6)) {
                                            continue;
                                        }
                                        for (int y3=0; y3<10; y3++) {
                                            long xy3 = x*y3*100;
                                            if (!( 100000000L <= xy3 && xy3 <  1000000000L && (xy3/1000000L)%10 == 6 && (xy3/100000L)%10 == 6 && (xy3/10000L)%10 == 6)) {
                                                continue;
                                            }
                                            for (int y4=0; y4<10; y4++) {
                                                long y = y4*1000+y3*100+y2*10+y1;
                                                long xy4 = x*y4*1000;
                                                long xy = x*y;
                                                if ( 100000000L <= xy4 && xy4 <  1000000000L && (xy4/1000000L)%10 == 6 &&                                                  (xy4/  1000L)%10 == 6 &&
                                                    1000000000L <= xy  && xy  < 10000000000L &&                           (xy /100000L)%10 == 6 && (xy /10000L)%10 == 6) {
                                                    System.out.println(String.format("%s%s%s%s%s%s*%s%s%s%s=%s", x6, x5, x4, x3, x2, x1, y4, y3, y2, y1, xy));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}