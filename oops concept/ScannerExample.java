import java.util.Scanner;
class ScannerExample{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter Name:");
        String name=sc.nextLine();
         System.out.print("enter Age:");
        int age=sc.nextInt();
       
        System.out.println("Hello:" +name);
        System.out.println("your age:"+age);
    }
}