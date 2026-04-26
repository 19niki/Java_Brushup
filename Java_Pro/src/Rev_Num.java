public class Rev_Num {
    public static void main(String[] args) {
        int num =44321;
        int rev=0;
        while(num>0)
        {
           int d=num%10;
            num=num/10;
            rev=rev*10+d;

        }
System.out.println(rev);

    }
}
