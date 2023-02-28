import java.util.Scanner;

//print the number if the input is greater than 5 and less than 10.
public class Conditional
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
//        if (n>5 && n<10)
//        {
//            System.out.println(n);
//        }
        //print the number if the input value is greater than 10 or less than 5
        if(n<5 || n>10)
        {
            System.out.println(n);
        }
    }
}
