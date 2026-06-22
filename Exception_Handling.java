import java.util.Scanner;
public class Exception_Handling {
    public static void main(String[] args) {
        Scanner  get=new Scanner(System.in);
        System.out.println("Enter a num:");
         int num1=get.nextInt();
         System.out.println("Enter a num");
         int num2=get.nextInt();
         try{
            System.out.println("Division value is"+(num1/num2));

         }
         catch(ArithmeticException e){
            System.out.println("No number can be divised by zero");
            System.out.println("Enter a num:");
             num1=get.nextInt();
            System.out.println("Enter a num");
             num2=get.nextInt();
            System.out.println("Division value is:"+(num1/num2));

         }
         finally{
            System.out.println("Progran executed successfully");
         }
    }
    
}
