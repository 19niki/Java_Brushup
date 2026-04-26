public class Prime_Number {
    public static void main(String[] args)
    {
        int n=10;
        boolean prime =true;
        int i=2;
        while(n>2)
        {
            if(n%i==0)
            {

                break;
            }
i++;
        }
        if(n==i)
        {
            System.out.println("Number is Prime");
        }
        else
            System.out.println("Number is not prime");
    }
}
