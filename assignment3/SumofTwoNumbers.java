import java.util.Scanner;
public class SumofTwoNumbers{
    static int sumofTwoNumbers(int num1, int num2){
        int res = num1+num2;
        return res;
    }
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = num.nextInt();
        System.out.println("Enter another number: ");
        int b = num.nextInt();
        System.out.println("Total: " + sumofTwoNumbers(a,b));

    }
}