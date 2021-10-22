package com.day4PracticeProblems;
import java.util.*;

public class ClassAssignment01 {

    public long palindromeInput;
    public long sumPal;
//    public int fibonacciInput;
    public int pal2Input;

    public void palindromeTest(){
        Scanner scForAll = new Scanner(System.in);
        System.out.println("Please enter the number to check.");
        this.palindromeInput = scForAll.nextLong();
        long reversed = palindromeInput;

        while(reversed>0) {
            long remainder = reversed % 10;  //getting remainder
            this.sumPal = (this.sumPal * 10) + remainder;  //generating reversed string digit by digit
            reversed = reversed / 10; //reducing main number to reverse each digit

        }

          if(palindromeInput == this.sumPal)
                    System.out.println("palindrome number ");
          else
                  System.out.println("not palindrome");
    }

    public void fibonacci(){
        System.out.println("\nFibonacci Yet to be completed.");
    }

    public void factorial(){
        Scanner scanFact = new Scanner(System.in);
        System.out.println("\nEnter number to Find Factorial for.");
        int factInput = scanFact.nextInt();
        int i = 1;
        long factOutput = 1;
        while( i <= factInput){
                factOutput = factOutput*i;
                i++;
        }
        System.out.println("Factorial of "+factInput+" is "+factOutput+".\n");
    }

    public void bubbleSort(){
        System.out.println("\nBubbleSort Yet to be completed.\n");
    }

    public static void main(String[] args) {
        System.out.println("Start Of Main Method.");

        ClassAssignment01 rv = new ClassAssignment01();
        Scanner methodSelectScan = new Scanner(System.in);
        System.out.println("""
                Please select operation from following options.
                1.Palindrome Number Test
                2.Fibonacci series
                3.Sort input number sequence (Bubble-sort)
                4.Factorial
                5.Palindrome number generator.
                6.All""");

        int methodSelectInput = methodSelectScan.nextInt();


        switch (methodSelectInput) {
            case 1 -> rv.palindromeTest();
            case 2 -> rv.fibonacci();
            case 3 -> rv.bubbleSort();
            case 4 -> rv.factorial();
            case 5 -> rv.palindromePrint();
            default -> {
                rv.palindromeTest();
                rv.fibonacci();
                rv.bubbleSort();
                rv.factorial();
                rv.palindromePrint();
            }
        }
        System.out.println("\nEnd Of Main Method.");
    }

    private  void palindromePrint() {

        Scanner scanPal2 = new Scanner(System.in);
        System.out.println("\nPlease Enter number of digits you want to print palindrome chain for.");
        int palindrome2Input = scanPal2.nextInt();
        this.pal2Input = palindrome2Input;
        for (int i=1; i<=pal2Input/2;i++){System.out.print(i);}
        if (palindrome2Input%2 != 0){System.out.print((palindrome2Input/2)+1);}
        for (int j=pal2Input/2; j>0;j--) {System.out.print(j);}

    }
}

