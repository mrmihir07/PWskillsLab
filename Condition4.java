//WAP to identify as "Child" (age < 12), "Teenager" (12 <= age < 18) or "Adult" (age >= 18)
import java.util.Scanner;

public class Condition4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age < 12)
        {
            System.out.println("Child");
        }
        else if(age >= 12 && age <18 )
        {
            System.out.println("Teenager");
        }
        else{
            System.out.println("Adult");
        }

    }
}
