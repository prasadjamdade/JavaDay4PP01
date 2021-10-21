package com.day4PracticeProblems;
import java.util.*;

public class ClassAssignment01 {

    public long palindromeInput;
    public long sumPal;
    public int fibonacciInput;
    public int pal2Input;

    public void palindromeTester(){
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
        System.out.println("Fibonacci Yet to be completed.");
    }

    public void factorial(int factInput){
        int i = 1;
        long factOutput = 1;
        while( i <= factInput){
                factOutput = factOutput*i;
                i++;
        }
        System.out.println("Factorial of "+factInput+" is "+factOutput+".");
    }

    public void bubbleSort(){
        System.out.println("BubbleSort Yet to be completed.");
    }

    public static void main(String[] args) {
        System.out.println("Start Of Main Method.");

        ClassAssignment01 rv = new ClassAssignment01();
        rv.palindromeTester();
        rv.fibonacci();
        rv.bubbleSort();

        //generic scanner object
        Scanner scan = new Scanner(System.in);

        //Factorial Function input
        System.out.println("Enter number to Find Factorial for.");
        int factInput = scan.nextInt();
        rv.factorial(factInput);

        System.out.println("Please Enter number of digits you want to print palindrome chain for.");
        int palindrome2Input = scan.nextInt();
        rv.palindrome2Input(palindrome2Input);

        System.out.println("\nEnd Of Main Method.");
    }

    private  void palindrome2Input(int inputToPrintPalindromeSeries) {

        this.pal2Input = inputToPrintPalindromeSeries;

        for (int i=1; i<=pal2Input/2;i++){
            System.out.print(i);
        }

        if (inputToPrintPalindromeSeries%2 != 0){
            System.out.print((inputToPrintPalindromeSeries/2)+1);
        }

        for (int j=pal2Input/2; j>0;j--) {
            System.out.print(j);
        }

    }
}

