public class Pattern5 {
    public static void main(String[] args)
    {
        int k=1;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(k++);
                if(k==10)
                {
                    k=1;

                }
            }
            System.out.println(" ");
        }
    }
}
