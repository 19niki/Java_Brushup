public class Large_return {

    static  int large(int a, int b) {
        if (a > b) {
            return a;
        } else
            return b;
    }
    static int fact(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        //    System.out.println(fact);
        }
        return 0;
    }
    static int rev(int num)
    {
        int rev=0;
        for(int i=0;i<num;i++) {
            int d = num % 10;
            num = num / 10;
            rev = rev * 10+d;
        }
        return rev;
    }
    public static  void main(String[] args)
    {
        int result =large(78,99);
        int fact =fact(5);
        int rev =rev(7871);
        System.out.println(result+"::"+fact+"::"+rev);

    }
}
