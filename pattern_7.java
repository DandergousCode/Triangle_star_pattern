public class pattern_7 
{
    public static void main(String[] args) 
    {
        int n = 4;

        for(int i=n; i>0; i--)
        {
            for(int j=i; j>0; j--)
            {
                System.out.print(" ");
            }
            for(int j=n+1; j>i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}