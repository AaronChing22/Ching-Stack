/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class StackDemo {
private static final int capacity = 3;
int arr[] = new int[capacity];
int top = -1;

public void push(int pushedElement){
    if(top < capacity -1){
        top++;
        arr[top] = pushedElement;
        System.out.println("Element " + pushedElement + " is pushed to Stack!");
        printElements();
    }else{
        System.out,println("Stack Overflow!");
    }
}

public void pop() {
    if (top >=0) {
        top--;
        System.out.println("Pop operation done!");
    }else{
        System.out.println("Stack Overflow!");
    }
}

public void printElements(){
    if(top >=0){
        System.out.println("Elements in stack:");
        for (int i = 0; i<= top; i++){
        System.out.println(arr[i]);
        }
    }
}

public static void main (String[]args){
    StackDemo stackDemo = new StackDemo();
    
    stackDemo.pop();
    stackDemo.push(23);
    stackDemo.push(2);
    stackDemo.push(73);
    stackDemo.push(21);
    stackDemo.pop();
    stackDemo.pop();
    stackDemo.pop();
    stackDemo.pop();
    
    }
}