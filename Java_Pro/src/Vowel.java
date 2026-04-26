public class Vowel {

    public static  void main (String[] args)
    {
        char c='a';
        if(c=='A' || c=='E'||c=='I'||c=='O'||c=='O')
        {
            System.out.println("Vowel in caps letter");
        }
        else if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println("vowel in small");
        }
        else if(c>='0' && c<='9')
        {
            System.out.println("Number");
        }
        else
            System.out.println("not a vowel");
    }
}
