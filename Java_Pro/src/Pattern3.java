public class Pattern3 {
    public static void main(String[] args)
    {

        for(int i=0;i<5;i++)
        {
            int n=1;
            char c='a';
            for(int j=0;j<5;j++)
            {
                if(i%2==0)
                {
                    System.out.print(n++);
                }
                else
                    System.out.print(c++);

            }
            System.out.println(" ");
        }
    }
}
