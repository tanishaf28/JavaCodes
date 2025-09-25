import java.util.Scanner;

public class JavaConditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        System.out.println("=== JAVA CONDITIONAL STATEMENTS PROGRAM ===");
        System.out.println("Welcome to Level 2: Conditional Statements!");
        
        do {
            displayMenu();
            System.out.print("Enter your choice (1-7, 0 to exit): ");
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    checkOddEven(scanner);
                    break;
                case 2:
                    checkPositiveNegativeZero(scanner);
                    break;
                case 3:
                    findGreatestOfThree(scanner);
                    break;
                case 4:
                    checkLeapYear(scanner);
                    break;
                case 5:
                    checkVowelConsonant(scanner);
                    break;
                case 6:
                    gradingSystem(scanner);
                    break;
                case 7:
                    checkPrimeNumber(scanner);
                    break;
                case 0:
                    System.out.println("\nThank you for using the Java Conditionals Program!");
                    System.out.println("Keep practicing conditional statements! ");
                    break;
                default:
                    System.out.println(" Invalid choice! Please select a number between 0-7.");
            }
            
            if(choice != 0) {
                System.out.println("\n" + "=".repeat(50));
                System.out.println("Press Enter to continue...");
                scanner.nextLine(); // consume newline
                scanner.nextLine(); // wait for user input
                System.out.println();
            }
            
        } while(choice != 0);
        
        scanner.close();
    }
    
    // Display menu options
    public static void displayMenu() {
        System.out.println("=".repeat(55));
        System.out.println("           CONDITIONAL STATEMENTS MENU");
        System.out.println("=".repeat(55));
        System.out.println("1.  Check Odd or Even Number");
        System.out.println("2.  Check Positive, Negative, or Zero");
        System.out.println("3.  Find Greatest of 3 Numbers");
        System.out.println("4.  Check Leap Year");
        System.out.println("5.  Check Vowel or Consonant");
        System.out.println("6.  Grading System (Marks to Grade)");
        System.out.println("7.  Check Prime Number");
        System.out.println("0.  Exit Program");
        System.out.println("=".repeat(55));
    }
    
    // 1. Check whether a number is odd or even
    public static void checkOddEven(Scanner scanner) {
        System.out.println("\n---  ODD OR EVEN CHECKER ---");
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("\nAnalyzing number: " + number);
        
        if (number % 2 == 0) {
            System.out.println(" Result: " + number + " is an EVEN number");
            System.out.println(" Explanation: " + number + " is divisible by 2 (remainder = 0)");
        } else {
            System.out.println(" Result: " + number + " is an ODD number");
            System.out.println(" Explanation: " + number + " is not divisible by 2 (remainder = 1)");
        }
        
        // Additional info
        System.out.println(" Note: Even numbers end in 0, 2, 4, 6, 8. Odd numbers end in 1, 3, 5, 7, 9");
    }
    
    // 2. Check if a number is positive, negative, or zero
    public static void checkPositiveNegativeZero(Scanner scanner) {
        System.out.println("\n--- ➕➖ POSITIVE/NEGATIVE/ZERO CHECKER ---");
        
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        System.out.println("\nAnalyzing number: " + number);
        
        if (number > 0) {
            System.out.println(" Result: " + number + " is a POSITIVE number");
            System.out.println(" Explanation: The number is greater than zero");
        } else if (number < 0) {
            System.out.println(" Result: " + number + " is a NEGATIVE number");
            System.out.println(" Explanation: The number is less than zero");
        } else {
            System.out.println(" Result: The number is ZERO");
            System.out.println(" Explanation: Zero is neither positive nor negative");
        }
        
        // Additional classification
        if (number != 0) {
            System.out.println(" Additional Info: This is a " + (number > 0 ? "positive" : "negative") + " real number");
        }
    }
    
    // 3. Find the greatest of 3 numbers
    public static void findGreatestOfThree(Scanner scanner) {
        System.out.println("\n---  GREATEST OF THREE NUMBERS ---");
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        
        System.out.println("\nNumbers entered: " + num1 + ", " + num2 + ", " + num3);
        
        double greatest;
        String explanation;
        
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
            explanation = num1 + " is greater than or equal to both " + num2 + " and " + num3;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
            explanation = num2 + " is greater than or equal to both " + num1 + " and " + num3;
        } else {
            greatest = num3;
            explanation = num3 + " is greater than or equal to both " + num1 + " and " + num2;
        }
        
        System.out.println(" Result: The greatest number is " + greatest);
        System.out.println(" Explanation: " + explanation);
        
        // Check for ties
        if (num1 == num2 && num2 == num3) {
            System.out.println(" Special Case: All three numbers are equal!");
        } else if (num1 == greatest && num2 == greatest) {
            System.out.println(" Note: First and second numbers are tied for greatest");
        } else if (num1 == greatest && num3 == greatest) {
            System.out.println("Note: First and third numbers are tied for greatest");
        } else if (num2 == greatest && num3 == greatest) {
            System.out.println(" Note: Second and third numbers are tied for greatest");
        }
    }
    
    // 4. Check leap year
    public static void checkLeapYear(Scanner scanner) {
        System.out.println("\n---  LEAP YEAR CHECKER ---");
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        System.out.println("\nAnalyzing year: " + year);
        
        boolean isLeapYear;
        String explanation;
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                    explanation = year + " is divisible by 400, so it's a leap year";
                } else {
                    isLeapYear = false;
                    explanation = year + " is divisible by 100 but not by 400, so it's not a leap year";
                }
            } else {
                isLeapYear = true;
                explanation = year + " is divisible by 4 but not by 100, so it's a leap year";
            }
        } else {
            isLeapYear = false;
            explanation = year + " is not divisible by 4, so it's not a leap year";
        }
        
        if (isLeapYear) {
            System.out.println(" Result: " + year + " is a LEAP YEAR! ");
            System.out.println(" This year has 366 days (February has 29 days)");
        } else {
            System.out.println(" Result: " + year + " is NOT a leap year");
            System.out.println(" This year has 365 days (February has 28 days)");
        }
        
        System.out.println(" Explanation: " + explanation);
        System.out.println(" Rule: A year is leap if it's divisible by 4, except century years must be divisible by 400");
    }
    
    // 5. Character is vowel or consonant
    public static void checkVowelConsonant(Scanner scanner) {
        System.out.println("\n---  VOWEL OR CONSONANT CHECKER ---");
        
        scanner.nextLine(); // consume newline
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        System.out.println("\nAnalyzing character: '" + ch + "'");
        
        // Check if it's an alphabetic character first
        if (!Character.isLetter(ch)) {
            System.out.println(" Error: '" + ch + "' is not an alphabetic character");
            System.out.println(" Please enter a letter (A-Z or a-z)");
            return;
        }
        
        // Convert to lowercase for easier checking
        char lowerCh = Character.toLowerCase(ch);
        boolean isVowel = false;
        
        switch(lowerCh) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                isVowel = true;
                break;
            default:
                isVowel = false;
        }
        
        if (isVowel) {
            System.out.println(" Result: '" + ch + "' is a VOWEL");
            System.out.println(" Vowels are: A, E, I, O, U (and their lowercase versions)");
        } else {
            System.out.println(" Result: '" + ch + "' is a CONSONANT");
            System.out.println(" Consonants are all letters except vowels (A, E, I, O, U)");
        }
        
        // Additional info
        System.out.println(" Character info: " + (Character.isUpperCase(ch) ? "Uppercase" : "Lowercase") + " letter");
        System.out.println(" ASCII value: " + (int)ch);
    }
    
    // 6. Simple grading system (marks to grade)
    public static void gradingSystem(Scanner scanner) {
        System.out.println("\n--- GRADING SYSTEM ---");
        
        System.out.print("Enter marks (0-100): ");
        double marks = scanner.nextDouble();
        
        System.out.println("\nAnalyzing marks: " + marks);
        
        // Validate marks range
        if (marks < 0 || marks > 100) {
            System.out.println(" Error: Marks should be between 0 and 100");
            return;
        }
        
        char grade;
        String description;
        String performance;
        
        if (marks >= 90) {
            grade = 'A';
            description = "Outstanding";
            performance = "Excellent work! Keep it up! ";
        } else if (marks >= 80) {
            grade = 'B';
            description = "Very Good";
            performance = "Great job! You're doing well! ";
        } else if (marks >= 70) {
            grade = 'C';
            description = "Good";
            performance = "Good work! Keep improving! ";
        } else if (marks >= 60) {
            grade = 'D';
            description = "Satisfactory";
            performance = "You passed! Work harder next time! ";
        } else if (marks >= 50) {
            grade = 'E';
            description = "Needs Improvement";
            performance = "Just passed! Focus on weak areas! ";
        } else {
            grade = 'F';
            description = "Fail";
            performance = "Need to study more! Don't give up! ";
        }
        
        System.out.println(" Grade: " + grade);
        System.out.println(" Description: " + description);
        System.out.println(" Performance: " + performance);
        
        // Show grade boundaries
        System.out.println("\n Grade Scale:");
        System.out.println("A: 90-100 (Outstanding)");
        System.out.println("B: 80-89  (Very Good)");
        System.out.println("C: 70-79  (Good)");
        System.out.println("D: 60-69  (Satisfactory)");
        System.out.println("E: 50-59  (Needs Improvement)");
        System.out.println("F: 0-49   (Fail)");
        
        // Percentage calculation
        System.out.println(" Percentage: " + marks + "%");
    }
    
    // 7. Check if number is prime
    public static void checkPrimeNumber(Scanner scanner) {
        System.out.println("\n---  PRIME NUMBER CHECKER ---");
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        System.out.println("\nAnalyzing number: " + number);
        
        // Handle special cases
        if (number <= 1) {
            System.out.println(" Result: " + number + " is NOT a prime number");
            System.out.println(" Explanation: Prime numbers must be greater than 1");
            System.out.println(" Note: 1 is neither prime nor composite");
            return;
        }
        
        if (number == 2) {
            System.out.println(" Result: " + number + " is a PRIME number");
            System.out.println(" Explanation: 2 is the only even prime number");
            return;
        }
        
        if (number % 2 == 0) {
            System.out.println(" Result: " + number + " is NOT a prime number");
            System.out.println(" Explanation: " + number + " is even and greater than 2, so it's divisible by 2");
            System.out.println(" Factors: 1, 2, " + (number/2) + ", " + number);
            return;
        }
        
        // Check for odd divisors up to square root
        boolean isPrime = true;
        int divisor = 0;
        int limit = (int)Math.sqrt(number);
        
        System.out.println(" Checking divisors from 3 to " + limit + "...");
        
        for (int i = 3; i <= limit; i += 2) {
            if (number % i == 0) {
                isPrime = false;
                divisor = i;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println(" Result: " + number + " is a PRIME number! ");
            System.out.println(" Explanation: " + number + " is only divisible by 1 and itself");
            System.out.println("Factors: 1, " + number);
        } else {
            System.out.println(" Result: " + number + " is NOT a prime number");
            System.out.println(" Explanation: " + number + " is divisible by " + divisor);
            System.out.println(" Some factors: 1, " + divisor + ", " + (number/divisor) + ", " + number);
        }
        
        // Additional info
        System.out.println(" Definition: A prime number has exactly two factors: 1 and itself");
        
        // Show some examples
        if (number <= 20) {
            System.out.println(" Prime numbers ≤ 20: 2, 3, 5, 7, 11, 13, 17, 19");
        }
    }
}
