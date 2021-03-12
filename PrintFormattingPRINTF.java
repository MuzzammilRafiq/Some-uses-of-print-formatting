public class PrintFormattingPRINTF {
    public static void main(String[] args) {
        System.out.printf("%d\n",10);
        System.out.printf("%f\n",10.1);
        System.out.printf("%c\n",'a');
        System.out.printf("%C\n",'a');
        System.out.printf("%s\n","hello");
        System.out.printf("%S\n","hello");
        System.out.printf("%b\n",5<4);
        System.out.printf("%B\n",5<4);
        System.out.println("==============================================================");
       // System.out.printf("%b\n",null);
        System.out.printf("%b\n","cow");
        System.out.printf("%e\n",10.123);
        System.out.printf("%E\n",10.123);
        System.out.println("==============================================================");
        System.out.printf("%g\n",10000.0);
        System.out.printf("%G\n",10000000.0);
        System.out.printf("%o\n",10);
        System.out.printf("%x\n",10);
        System.out.printf("%h\n","hello");
        System.out.printf("%a\n",10.12);
        System.out.printf("%%\n");
        System.out.println("=============================================================");
        // %[argument_index][flag][width][.precision]f
        System.out.printf("%.5f\n",12.345678);//it rounds off
        System.out.printf("%.2s\n","hello");
        System.out.printf("%.2h\n","hello");
        System.out.printf("%8d\n",123);
        System.out.printf("%-8d\n",123);//here - is flag
        System.out.printf("%4d\n",12345);
        System.out.println("=============================================================");
        System.out.printf("%6.2f\n",123.45);
        System.out.printf("%+d\n",123);
        System.out.printf("%+d\n",-123);//here + is a flag
        System.out.printf("% d\n",123);
        System.out.printf("% d\n",-123);//here space is a flag
        System.out.println("==============================================================");
        System.out.printf("%06d\n",123);
        System.out.printf("%06d\n",-123);
        System.out.printf("%07.2f\n",123.12);//here 0 is a flag
        System.out.printf("%,d\n",123);
        System.out.printf("%,d\n",123456);
        System.out.printf("%,.2f\n",1234.12);
        System.out.printf("%,08d\n",12345);
        System.out.println("==============================================================");
        System.out.printf("%(d\n",123);
        System.out.printf("%(d\n",-123);
        System.out.printf("%(.2f\n",123.12);
        System.out.printf("%(08d\n",-12345);//here ( is flag 
        System.out.printf("%#o\n",123); //here # is flag
        System.out.printf("%#x\n",1234);
        System.out.printf("%#08x\n",1234);
        System.out.printf("%#.0f %.0f\n",12.34,12.34);
        System.out.println("==============================================================");
        System.out.printf("%s %s %s\n","1","2","3");
        System.out.printf("%1$s %1$s %1$s\n","1","2","3");//here $ isargument index
        System.out.printf("%2$s %s %s\n","1","2","3");
        System.out.printf("%s %3$s %s\n","1","2","3");
        System.out.printf("%2$s %3$s %s\n","1","2","3");
        System.out.printf("%1$s %1$s %1$s\n","1");
        System.out.printf("%s %<s %s\n","1","2","3");
        System.out.printf("%2$s %<s %s\n","1","2","3");
    }
}
