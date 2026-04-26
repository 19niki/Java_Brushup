public class Test1 {

    public static void main(String args[])
    {
        System.out.println("My First test i am back");
         int n=5;
        for(int i=1; i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(j<i)
                {
                    System.out.print("*");
                }
                else
                    System.out.println("");
            }
        }
    }
}
