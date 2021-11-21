import java.util.Scanner;
//to check whether a year is leap or not
public class leap {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int feb;
        int year;
        System.out.print("Enter number of days in february:");
        feb=sc.nextInt();
        System.out.print("Enter number of days in year:");
        year= sc.nextInt();

        if((feb==29)&(year==366))
            System.out.print("It is a leap year");
        else
            System.out.print("It is not a leap year");


    }
}
