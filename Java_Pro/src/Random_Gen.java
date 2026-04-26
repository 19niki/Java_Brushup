import java.util.Random;

public class Random_Gen {

    static void random()
    {

        Random ran = new Random();
        int a = ran.nextInt(98);
       String s = "987"+a;
       System.out.println(s);
    }
    public static void main(String[] args)
    {
        random();
    }

}
