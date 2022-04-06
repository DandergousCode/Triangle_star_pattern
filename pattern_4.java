public class pattern_4 
{
    public static void main(String[] args) 
    {
        int n = 6;

        for(int i=n; i>0; i--)
        {
            for(int j=(2*i)-1; j>0; j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}