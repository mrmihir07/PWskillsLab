//for multiple of 3 - print "Fizz"
//for multiple of 5 - print "Buzz"
//for multiple of 3 and 5 - print "FizzBuzz"
import java.util.Scanner;

public class ConditionProgramFizzBuzz
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
         if(n%3==0 && n%5==0)
        {
            System.out.println("FizzBuzz");
        }
        else if(n%3==0)
        {
            System.out.println("Fizz");
        }
        else if(n%5==0)
        {
            System.out.println("Buzz");
        }

    }
}
