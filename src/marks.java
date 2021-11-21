import java.util.Scanner;
//to input marks of five subject and print percentage and grade
public class marks {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float Physics;
        float Chemistry;
        float Biology;
        float Mathematics;
        float Computer;

        System.out.print("Enter the marks of Physics:");
        Physics= sc.nextInt();
        System.out.print("Enter the marks of Chemistry:");
        Chemistry= sc.nextInt();
        System.out.print("Enter the marks of Biology:");
        Biology=sc.nextInt();
        System.out.print("Enter the marks of Mathematics:");
        Mathematics= sc.nextInt();
        System.out.print("Enter the marks of Computer:");
        Computer= sc.nextInt();

        float total=Physics+Chemistry+Biology+Mathematics+Computer;
        float percentage=(total/500)*100;

        if(percentage>=90)
            System.out.print(percentage+"% is Grade A");
        else if(percentage>=80)
            System.out.print(percentage+"% is Grade B");
        else if(percentage>=70)
            System.out.print(percentage+"% is Grade C");
        else if(percentage>=60)
            System.out.print(percentage+"% is Grade D");
        else if(percentage>=40)
            System.out.print(percentage+"% is Grade E");
        else if(percentage<40)
            System.out.print(percentage+"% is Grade F");
        else
            System.out.print("Wrong input");

    }
}
