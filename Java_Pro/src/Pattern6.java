public class Pattern6 {
    public static void main(String[] args)
    {
        int n=1;
        int m=0;
        for(int i=0;i<4;i++)
        {

            for(int j=0;j<4;j++)
            {
                if(j%2==0)
                {
                    System.out.print(n);
                }
                else
                    System.out.print(m);
            }
            System.out.println(" ");
        }
    }
}
