public class Test_Switch2 {
    public static void main(String[] args)
    {
        char c = '$';
        if(c>='0' && c<='9' || c>='a' && c<='z' || c>='A' && c<='Z')
        {
            switch (c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                   System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Number");
            }
        }
    }
}
