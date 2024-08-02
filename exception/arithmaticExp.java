
import java.util.Scanner;



class arithematicExp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
    try {
        int result=a/b;
        System.out.println("result");
    } catch (ArithmeticException e) {
        System.out.println("Can't divided by zero");
         e.printStackTrace();
        System.out.println(e.getMessage());
     

        
    }

    }

}