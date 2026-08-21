import java.util.Scanner;
public class CheckAgeCategory{
    static void checkAgeCategory(int age){
        if(age<18){
            System.out.println("You are a minor.");
        }
        else if (age>=18 && age<=59){
            System.out.println("You are an adult.");
        }
        else{
            System.out.println("You are a senior citizen.");
        }
    }
    public static void main(String[] args){

        Scanner age_scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age_input = age_scan.nextInt();
        checkAgeCategory(age_input);

    }
}