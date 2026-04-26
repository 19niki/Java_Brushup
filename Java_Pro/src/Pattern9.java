public class Pattern9 {

    static void p1()

    {
        int k=1;
        char c='a';
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(j%2==0)
                {
                    System.out.print(c++);
                }
                else
                    System.out.print(k++);
            }
            System.out.println(" ");
        }

    }
    static void p2()

    {
        int n=4;
        for(int i=0;i<=n;i++)
        {
            int k=1;
            for(int j=0;j<=n;j++)
            {
                if(i+j<=n-1)
                {
                    System.out.print(" ");
                }
                else
                System.out.print(k++);
            }
            System.out.println(" ");

        }
    }
    public static void main(String[] args)
    {
        p1();
        System.out.println("==============");
        p2();
    }
}
