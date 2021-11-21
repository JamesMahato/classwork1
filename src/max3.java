import java.util.Scanner;
//to find maximum number between three numbers
public class max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.print("Enter first number:");
        num1 = sc.nextInt();
        System.out.print("Enter second number:");
        num2 = sc.nextInt();
        System.out.print("Enter third number:");
        num3 = sc.nextInt();

        if ((num1>num3)&(num1>num2))
            System.out.print(num1+" is a maximum number");
        else if ((num2>num3)&(num2>num3))
            System.out.print(num2+" is a maximum number");
        else
            System.out.print(num3+" is a maximum number");


    }
}
