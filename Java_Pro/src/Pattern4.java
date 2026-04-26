public class Pattern4 {
    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
            int n=5;
            char c='f';
            for(int j=0;j<5;j++)
            {
                if(i%2==0)
                {
                    System.out.print(c--);
                }
                else
                    System.out.print(n--);
            }
            System.out.println(" ");
        }
    }
}
