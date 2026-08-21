import java.util.Scanner;
public class SumofNums{
    static int calculateSum(int n){
        int res = 0;
        for(int i=1 ; i<=n ; i++){
            res += i;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner n_scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n_input = n_scan.nextInt();
        System.out.println("The sum of numbers from 1 to "+ n_input + " is " + calculateSum(n_input) );
    }
}