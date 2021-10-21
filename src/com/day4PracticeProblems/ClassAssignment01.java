package com.day4PracticeProblems;
import java.util.*;

public class ClassAssignment01 {

    public long palindromeInput;
    public long sumPal;
//    public int fibonacciInput;


    public void palindrome(){
        Scanner scForAll = new Scanner(System.in);
        System.out.println("Please enter the number to check.");
        this.palindromeInput = scForAll.nextLong();
        long reversed = palindromeInput;

        while(reversed>0) {
            long remainder = reversed % 10;  //getting remainder
            this.sumPal = (this.sumPal * 10) + remainder;
            reversed = reversed / 10;
        }

          if(palindromeInput == this.sumPal)
                    System.out.println("palindrome number ");
          else
                  System.out.println("not palindrome");
    }

//    public void fibonacci(){
//        System.out.println("Fibonacci Yet to be completed.");
//    }

    public void factorial(int factInput){
        int i = 1;
        long factOutput = 1;
        while( i <= factInput){
                factOutput = factOutput*i;
                i++;
        }
        System.out.println("Factorial of "+factInput+" is "+factOutput+".");
    }

//    public void bubbleSort(){
//        System.out.println("BubbleSort Yet to be completed.");
//    }

    public static void main(String[] args) {
        System.out.println("Start Of Main Method.");
        ClassAssignment01 rv = new ClassAssignment01();
        rv.palindrome();
//        rv.fibonacci();
//        rv.bubbleSort();
        Scanner factScan = new Scanner(System.in);
        System.out.println("Enter number to Find Factorial for.");
        int factInput = factScan.nextInt();
        rv.factorial(factInput);
        System.out.println("End Of Main Method.");
    }


}

