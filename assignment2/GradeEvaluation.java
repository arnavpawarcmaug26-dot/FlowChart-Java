public class GradeEvaluation{
    public static void main(String[] args){
        int maths = 80;
        int science = 85;
        int history = 90;

        int avg = (maths+science+history)/3;
        System.out.println("Average marks: %d ".formatted(avg));

        if(avg>=90){
            System.out.println("Grade: A");
        }
        else if (avg<=89 && avg>=70){
            System.out.println("Grade: B");
        }
        else if (avg<=69 && avg>=50){
            System.out.println("Grade: C");
        }
        else if (avg<=30 && avg>=49){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Fail");
        }

    }
}