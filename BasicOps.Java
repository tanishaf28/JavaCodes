import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        System.out.println("=== JAVA BASICS PROGRAM ===");
        System.out.println("Welcome to the comprehensive Java basics program!");
        
        do {
            displayMenu();
            System.out.print("Enter your choice (1-9, 0 to exit): ");
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    helloWorld();
                    break;
                case 2:
                    personalDetails(scanner);
                    break;
                case 3:
                    swapNumbers(scanner);
                    break;
                case 4:
                    findASCII(scanner);
                    break;
                case 5:
                    calculator(scanner);
                    break;
                case 6:
                    temperatureConverter(scanner);
                    break;
                case 7:
                    rectangleCalculations(scanner);
                    break;
                case 8:
                    circleCalculations(scanner);
                    break;
                case 9:
                    triangleCalculations(scanner);
                    break;
                case 0:
                    System.out.println("Thank you for using the Java Basics Program!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
            if(choice != 0) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine(); // consume newline
                scanner.nextLine(); // wait for user input
            }
            
        } while(choice != 0);
        
        scanner.close();
    }
    
    // Display menu options
    public static void displayMenu() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("         MAIN MENU");
        System.out.println("=".repeat(40));
        System.out.println("1. Hello World Program");
        System.out.println("2. Personal Details");
        System.out.println("3. Swap Two Numbers");
        System.out.println("4. Find ASCII Value");
        System.out.println("5. Simple Calculator");
        System.out.println("6. Temperature Converter");
        System.out.println("7. Rectangle Area & Perimeter");
        System.out.println("8. Circle Area & Circumference");
        System.out.println("9. Triangle Area & Perimeter");
        System.out.println("0. Exit");
        System.out.println("=".repeat(40));
    }
    
    // 1. Hello World Program
    public static void helloWorld() {
        System.out.println("\n--- HELLO WORLD PROGRAM ---");
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java programming!");
    }
    
    // 2. Personal Details
    public static void personalDetails(Scanner scanner) {
        System.out.println("\n--- PERSONAL DETAILS ---");
        scanner.nextLine(); // consume newline
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine(); // consume newline
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        
        System.out.print("Enter your hobby: ");
        String hobby = scanner.nextLine();
        
        System.out.println("\n--- YOUR DETAILS ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("City: " + city);
        System.out.println("Hobby: " + hobby);
    }
    
    // 3. Swap Two Numbers
    public static void swapNumbers(Scanner scanner) {
        System.out.println("\n--- SWAP TWO NUMBERS ---");
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        
        // Method 1: Using third variable
        System.out.println("\nMethod 1: Using third variable");
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
        
        // Reset values for method 2
        temp = num1;
        num1 = num2;
        num2 = temp;
        
        // Method 2: Without using third variable (arithmetic)
        System.out.println("\nMethod 2: Without third variable (arithmetic)");
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
        
        // Reset values for method 3
        temp = num1;
        num1 = num2;
        num2 = temp;
        
        // Method 3: Without using third variable (XOR)
        System.out.println("\nMethod 3: Without third variable (XOR)");
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
    
    // 4. Find ASCII Value
    public static void findASCII(Scanner scanner) {
        System.out.println("\n--- ASCII VALUE FINDER ---");
        scanner.nextLine(); // consume newline
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        int ascii = (int) ch;
        System.out.println("ASCII value of '" + ch + "' is: " + ascii);
        
        // Additional: Show ASCII values of common characters
        System.out.println("\nSome common ASCII values:");
        System.out.println("'A' = " + (int)'A');
        System.out.println("'a' = " + (int)'a');
        System.out.println("'0' = " + (int)'0');
        System.out.println("' ' (space) = " + (int)' ');
    }
    
    // 5. Simple Calculator
    public static void calculator(Scanner scanner) {
        System.out.println("\n--- SIMPLE CALCULATOR ---");
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("\nChoose operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. All operations");
        System.out.print("Enter your choice: ");
        
        int operation = scanner.nextInt();
        
        switch(operation) {
            case 1:
                System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                if(num2 != 0) {
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;
            case 5:
                System.out.println("All operations:");
                System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
                System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
                if(num2 != 0) {
                    System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Division: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation choice!");
        }
    }
    
    // 6. Temperature Converter
    public static void temperatureConverter(Scanner scanner) {
        System.out.println("\n--- TEMPERATURE CONVERTER ---");
        
        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + "°C = " + fahrenheit + "°F");
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5/9;
                System.out.println(fahrenheit + "°F = " + celsius + "°C");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    
    // 7. Rectangle Calculations
    public static void rectangleCalculations(Scanner scanner) {
        System.out.println("\n--- RECTANGLE AREA & PERIMETER ---");
        
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        
        double area = length * width;
        double perimeter = 2 * (length + width);
        
        System.out.println("\nRectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area + " square units");
        System.out.println("Perimeter: " + perimeter + " units");
    }
    
    // 8. Circle Calculations
    public static void circleCalculations(Scanner scanner) {
        System.out.println("\n--- CIRCLE AREA & CIRCUMFERENCE ---");
        
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        
        final double PI = 3.14159;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        
        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area + " square units");
        System.out.println("Circumference: " + circumference + " units");
    }
    
    // 9. Triangle Calculations
    public static void triangleCalculations(Scanner scanner) {
        System.out.println("\n--- TRIANGLE AREA & PERIMETER ---");
        
        System.out.println("Choose calculation method:");
        System.out.println("1. Using base and height (for area)");
        System.out.println("2. Using all three sides");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.print("Enter base of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = scanner.nextDouble();
                
                double area = 0.5 * base * height;
                System.out.println("\nTriangle Details:");
                System.out.println("Base: " + base);
                System.out.println("Height: " + height);
                System.out.println("Area: " + area + " square units");
                break;
                
            case 2:
                System.out.print("Enter first side: ");
                double side1 = scanner.nextDouble();
                System.out.print("Enter second side: ");
                double side2 = scanner.nextDouble();
                System.out.print("Enter third side: ");
                double side3 = scanner.nextDouble();
                
                double perimeter = side1 + side2 + side3;
                
                // Using Heron's formula for area
                double s = perimeter / 2; // semi-perimeter
                double areaHeron = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
                
                System.out.println("\nTriangle Details:");
                System.out.println("Side 1: " + side1);
                System.out.println("Side 2: " + side2);
                System.out.println("Side 3: " + side3);
                System.out.println("Perimeter: " + perimeter + " units");
                System.out.println("Area (using Heron's formula): " + areaHeron + " square units");
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}
