public class Count1 {
    public static void main(String[] args)
    {
        int n=10,count =0;
        while(n<=100)
        {
            if(n%2==0)
            {
                count++;
            }
            n++;
        }
        System.out.println(count);
    }
}
