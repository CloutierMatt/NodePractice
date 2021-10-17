import java.util.Scanner;

public class StackApp{
   public static void main(String[] args){
      StackProject AppStack = new StackProject();
      String buffer = "";
      String menu = "\n(0) Exit\n(1) Peek\n(2) Add new value\n(3) Delete latest value\n(4) Display all\n(5) Check if empty ";
      Scanner kbd = new Scanner(System.in);
      
      do {
         System.out.print(menu);
         buffer = kbd.next();
         if (buffer.charAt(0) == '1') {
            AppStack.peek();
         }   
         
         else if(buffer.charAt(0) == '2') {
            System.out.print("Input an integer: ");
            buffer = kbd.next();
            AppStack.addfront(Integer.parseInt(buffer));
         } 
         else if(buffer.charAt(0) == '3') {
            AppStack.remfront();
         }  
         else if(buffer.charAt(0) == '4') {
            AppStack.display();
         }   
 
      }while(buffer.charAt(0) != '0');
   }
}   