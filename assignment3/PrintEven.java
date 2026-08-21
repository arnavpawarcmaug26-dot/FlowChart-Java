public class PrintEven{
    static void printEvenNumbers(){
        int i = 1;
        while(i<51){
            if(i%2==0){
                System.out.println(i);
            }
            i = i + 1;

        }

    }
    public static void main(String[] args){
        printEvenNumbers();
    }
}