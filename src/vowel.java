import java.util.Scanner;
//to check whether a character is vowel or consonant
import static java.lang.Character.toLowerCase;

public class vowel {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a character:");
        char chr=toLowerCase(sc.next().charAt(0));

        if (chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')
            System.out.print(chr +" is a vowel");
        else
            System.out.print(chr+" is  a consonant");
    }
}
