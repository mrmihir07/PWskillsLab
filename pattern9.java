public class pattern9
{
    public static void main(String[] args) {
        int n = 10;
        for (int i=0; i<n; i++)
        {
            for (int j=n; j>=0; j--)
            {
                if(i==j)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
