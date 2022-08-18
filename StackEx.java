import java.util.*;
class StackEx
  {
    public static void main(String args[])
    {
      Stack<Integer> marks =new Stack<Integer> ();
      marks.push(55);
      marks.push(68);
      marks.push(74);
      marks.push(85);
      marks.push(90);
     
      if(marks.empty())
        System.out.println("Stack is Empty ");
      else 
        //returns Top element
        System.out.println("Top element in the Stack is :"+marks.peek());
      System.out.println("Element 74 is present in Stack is :"+marks.search(74));
     //It removes the top element from the stack
      marks.pop();
       System.out.println("Top element in the Stack after pop is :"+marks.peek());
    }
  }