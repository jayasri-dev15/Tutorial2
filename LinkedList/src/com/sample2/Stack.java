package com.sample2;
import java.util.*;
import java.util.EmptyStackException;

public class Stack 
{
	 //performing push operation
    static void push(Stack st, int a)
    {
            st.push(new Integer(a));
            System.out.println("Element "+a+" push to Stack");
            System.out.println("Stack is: " + st);
    }
    //performing pop operation
    static void pop(Stack st)
    {
            Integer a = (Integer) st.pop();
            System.out.println("Element "+a+" pop to the stack");
            System.out.println("Stack is: " + st);
    }
    public static void main(String[] args)
    {
            try
            {
                    Stack stack = new Stack();
                    System.out.println("Stack: "+stack);
                    push(stack, 12);
                    push(stack, 15);
                    push(stack, 32);
                    push(stack, 54);
                    pop(stack);
                    pop(stack);
                    pop(stack);
                    pop(stack);
                    pop(stack);
            }
            catch (EmptyStackException ex)
            {
                    System.out.println("Stack is empty");
            }
    }
}