/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst250exeresize03;

import java.util.*;

public class CST250exeresize03 {

 
    public static void main(String[] args) {
        
//       Queue<Integer> myQueue = new LinkedList();
//       Stack<Integer> myStack = new Stack();
//       
//       myQueue.add(1);
//       myQueue.add(2);
//       myQueue.add(3);
//        
//       myStack.add(1);
//       myStack.add(2);
//       myStack.add(3);
//        
//        
//       System.out.println("My Queue:" + myQueue);
//       System.out.println("My Queue:" + myStack);
//        
//       int headOfQueue = myQueue.remove();
//       int headOfStack = myStack.pop();
//        
//        
//       System.out.println("After removing/popping the head element:");
//       System.out.println("My Queue:" + myQueue);
//       System.out.println("My Queue:" + myStack);
      System.out.println(isPalindrome("abcbavasd"));  

    }
    public static Boolean isPalindrome(String word) {
        
        
        char[] wordArray = word.toCharArray();
        
        Queue<Character> wordQueue = new LinkedList();
        Stack<Character> wordStack = new Stack();
        
        for(int i = 0; i<wordArray.length; i++){
            wordQueue.add(wordArray[i]);
            wordStack.add(wordArray[i]);
        }
        
        for(int i = 0; i<wordArray.length; i++){
            if(!Objects.equals(wordQueue.remove(), wordStack.pop())){
                return false;
            }
        }
            return true;
        }
}

    

