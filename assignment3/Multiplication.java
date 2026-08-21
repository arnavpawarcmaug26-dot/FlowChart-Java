import java.util.Scanner;
public class Multiplication{
    static void printMultiplicationTable(int num){
        for(int i = 1; i<=10; i++){
            int res = i*num;
            System.out.println(num + "*" + i + "=" + res);
        }
    }
    public static void main(String[] args){
        Scanner num_obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num_input = num_obj.nextInt();
        printMultiplicationTable(num_input);
    }
}