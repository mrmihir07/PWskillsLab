//Print each number from 1 to 100 on a new line, except if the number is a multiple of 5 and 7
public class Condition3
{
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            if(i%5==0 || i%7==0)
            {
                System.out.println(i);
            }
        }
    }
}
