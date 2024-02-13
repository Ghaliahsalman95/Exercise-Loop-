import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
/*.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that
number.
If the number is a multiple of 5, you need to print "Buzz" instead of that
number.
If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
instead of that number*/
        System.out.println("-----------Exercise 1--------------");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");
            } else System.out.println(i);
        }
        //--------------------------------------Exercise 2----------
        /*2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox Expected Output: Reverse
string: xof nworb kciuq ehT*/
        System.out.println("-----------Exercise 2--------------");
        String reserve = "";
        String newStr = "";
        char wordChart;
        System.out.println("Write word to reverse it.");
        String word = input.nextLine();
        word = word.replace(" ", "");
        for (int i = word.length() - 1; i >= 0; i--) {
            reserve = reserve + word.charAt(i);
        }
        System.out.println("Output: " + reserve);
///-------------------------------------------- Exercise 3------------------------

/**Write a program to find the factorial value of any number entered
 through the keyboard.*/
        System.out.println("Enter number ");
        int factnum = 1;
        int numFactorial = input.nextInt();
        for (int i = 1; i <= numFactorial; i++) {
            factnum *= i;
        }
        System.out.println("The factorial value of The number entered is " + factnum);
//------------------------Exercise 4----------------------------------------

        /*4.Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another. (Do not use Java
built-in method)*/
        System.out.println("Enter the base number");
        int newnumber = 1;
        int base = input.nextInt();
        System.out.println("Enter the power number");
        int power = input.nextInt();
        for (int i = 1; i <= power; i++) {
            newnumber *= base;
        }
        System.out.println("The result is " + newnumber);

//------------------------Exercise 5----------------------------------------
       /* 5.Write a program that reads a set of integers, and then prints the sum of
        the even and odd integers.*/
        int sumEven = 0, sumOdd = 0, read = 0;
        System.out.println("Please enter number set of Integer");
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i + ": Please enter number ");
            read = input.nextInt();
            if (read % 2 == 0) {
                sumEven += read;
            } else if (read % 2 == 1) {
                sumOdd += read;
            }
            i++;
        }
        System.out.println(n + " Set of number ");
        System.out.println("Total Even number is " + sumEven);
        System.out.println("Total Odd number is " + sumOdd);

//---------------------------------Exercise 6--------------------------

        /*6.Write a program that prompts the user to input a positive integer. It
should then output a message indicating whether the number is a prime
number.*/

        int iter = 2, prime = 0;

        System.out.print("Please enter number to check : ");
        int num = input.nextInt();
        if(num==1){System.out.println("\n" + num + " is a Prime Number.");}
        while (iter < num) {
            if (num % iter == 0) { prime++; break;} iter++;}
        if (prime == 0){
            System.out.println("\n" + num + " is a Prime Number.");}
        else{
            System.out.println("\n" + num + " is not a Prime Number.");}

//------------------------------- Exercise 7------------------------
        /*7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
another for loop to print the days (Days 1 -7) for each week.
Expected Output:
Week 1
Day1
Day2
Day3
Day4
Day5
Day6
Day7
Week 2
Day1
Day2*/

        for (int week=1;week<=4;week++){
            System.out.println("--------Week "+ week+"--------- ");
            for(int day=1;day<=7;day++){
                System.out.println("Day "+ day);

            }
        }
//------------------------------- Exercise 8------------------------

/*8.Write a program thats check if the word is a palindrome or not. hint: A
string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left.*/
        String reserve8 = "";
        String newStr8 = "";
        char wordChart8;
        //--- reuseble code exercise 2 reverse
        System.out.println("Please enter word to check if it palindrome or not");
        String word8 = input.next();
        word8 = word8.replace(" ", "");
        for (int pal = word8.length() - 1; pal >= 0; pal--) {
            reserve8 = reserve8 + word8.charAt(pal);}
        if (word8.equals(reserve8)) {
            System.out.println("The word is a palindrome ");}
        else { System.out.println("The word is Not a palindrome ");}
        }


    }
