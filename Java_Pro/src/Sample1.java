// This file is used for git pratice

public class Sample1 {

    public static int add(int a, int b)
    {
        return a+b;
    }

    public static int large(int a, int b, int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if (b>c)
        {
            return b;
        }
        else
            return  c;
    }

    public static int rev(int num)
    {
        int rev=0;
        for(int i=0;i<num;i++) {

            int d;
            d = num % 10;
            num = num / 10;
            rev = rev * 10+d;
        }
        return rev;
    }

    public static int fact(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {

            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        int a= large(273,45,142);
        int b = add(23,87);
        int c  = rev(564);
        int d = fact(6);
        System.out.println("largest number is:" + a);
        System.out.println("addition of two number is:"+ b);
        System.out.println("reverse of the number is:"+ c);
        System.out.println("factorial of the number:"+ d);
    }
}
