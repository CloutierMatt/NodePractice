//NO RELATIONAL OPERATORS(>, <, <=, >=)
//Array based implementation would be easiest
//Will need Stack class and Stackapp class
//Stack is a LIFO(last in first out) data structure

//This is an in-class group based exercise. Please construct and test a class that implements an array-based stack. 
//The class should support push, pop and peek operations as methods. The UML and pseudocode will be presented in class. 
//Submit a single pdf containing source code and testing in the console. 
//Remember that the testing performed should determine that the class is properly implemented. 
//Please put the names of everyone on your team in the pdf that's submitted (this will ensure everyone on your team will get credit). 
//Only make one submission per team.

public class StackProject{
   Node front = null;
   //Node rear = null;
   int numb;
   
   public void display() {
      Node m = front;
      while(m != null) {
         System.out.print("->" + m.data);
         m = m.next;
         
      }
   }
 
   public void peek() {
      Node m = front;
      if(m == null) {
         System.out.print("The stack is currently empty.");
      }   
      else System.out.print("The current value is " + m.data);       
   }
   
   public void addfront(int i) {
      if(isEmpty()) {
         front = new Node(i);
         //rear = front;
      }
      else{   
         front = new Node(i, front);
      }
      numb++;
   }
   
   public void remfront() {
      front = front.next;
      numb--;
   }     
   public boolean isEmpty() {
      return (front == null);
  
   } 
}