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

    public static void main(String[] args)
    {
        int a= large(273,45,142);
        int b = add(23,87);
        System.out.println("largest number is:" + a);
        System.out.println("additin of two number is:"+ b);
    }
}
