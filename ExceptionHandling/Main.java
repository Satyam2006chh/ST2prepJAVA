import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 1: Divide by Zero (try-catch-finally)
        // Write a Java program to:
        // Take two integers, divide them,
        // Handle divide by zero using try-catch
        // ─────────────────────────────────────────────────────────────────────

        // int a = 10;
        // int b = 0;
        // try {
        //     int result = a / b;
        //     System.out.println(result);
        // } catch (ArithmeticException e) {
        //     System.out.println("error division by zero is not allowed");
        // } finally {
        //     System.out.println("finally is always executed");
        // }
        // System.out.println("Program continues normally");


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 2: Array Index Out of Bounds
        // Write a program to:
        // Take array of size 5, ask user for index,
        // Print element, handle invalid index
        // ─────────────────────────────────────────────────────────────────────

        // int arr[] = {10, 20, 30, 40, 50};
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter index: ");
        // int index = sc.nextInt();
        // try {
        //     System.out.println("Element: " + arr[index]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Invalid index!");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 3: Multiple Catch Blocks
        // Write a program to:
        // Take a number as string, convert to integer, divide by another number.
        // Handle: invalid number + divide by zero
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number (string): ");
        // String s = sc.next();
        // System.out.print("Enter divisor: ");
        // int d = sc.nextInt();
        // try {
        //     int num = Integer.parseInt(s);
        //     int result = num / d;
        //     System.out.println("Result: " + result);
        // } catch (NumberFormatException e) {
        //     System.out.println("Invalid number format!");
        // } catch (ArithmeticException e) {
        //     System.out.println("Cannot divide by zero!");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 4: Null Pointer Exception
        // Write a program:
        // Declare a string as null, try to print its length, handle the exception
        // ─────────────────────────────────────────────────────────────────────

        // String str = null;
        // try {
        //     System.out.println(str.length());
        // } catch (NullPointerException e) {
        //     System.out.println("String is null!");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 5: throw keyword (Age Validation)
        // Write a Java program:
        // Take age as input, if age < 18 → throw exception,
        // Handle it using try-catch, use finally to print "Process completed"
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter age: ");
        // int age = sc.nextInt();
        // try {
        //     if (age < 18) {
        //         throw new ArithmeticException("Underage!");
        //     }
        //     System.out.println("Eligible");
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // } finally {
        //     System.out.println("Process completed");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 6: throws keyword (File Reading Simulation)
        // Write a program:
        // Create a method readData(), it should try to open a file,
        // Use throws in method, handle exception in main, use finally block
        // ─────────────────────────────────────────────────────────────────────

        // static void readData() throws IOException {
        //     FileReader file = new FileReader("data.txt");
        //     System.out.println("File opened successfully");
        // }
        //
        // try {
        //     readData();
        // } catch (IOException e) {
        //     System.out.println("File not found!");
        // } finally {
        //     System.out.println("Execution finished");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 7: throws with Negative Number Check
        // Write a program:
        // Create method checkNumber(int n), if number is negative → throw exception,
        // Use throws in method, handle in main
        // ─────────────────────────────────────────────────────────────────────

        // static void checkNumber(int n) throws Exception {
        //     if (n < 0) {
        //         throw new Exception("Negative number not allowed");
        //     }
        //     System.out.println("Valid number");
        // }
        //
        // try {
        //     checkNumber(-5);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // } finally {
        //     System.out.println("Done checking");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 8: throws with Divide Method
        // Write a program:
        // Take integer input, create method divide(int a, int b), use throws,
        // Inside method: if b == 0 → throw exception, handle in main, use finally
        // ─────────────────────────────────────────────────────────────────────

        // static int divide(int a, int b) throws ArithmeticException {
        //     if (b == 0) {
        //         throw new ArithmeticException("Cannot divide by zero");
        //     }
        //     return a / b;
        // }
        //
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter b: ");
        // int b = sc.nextInt();
        // try {
        //     int result = divide(a, b);
        //     System.out.println("Result: " + result);
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // } finally {
        //     System.out.println("Calculation finished");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 9: Nested Try-Catch (Inner + Outer Finally)
        // Write a program:
        // Inner try → access invalid array index
        // Inner catch handles it
        // Inner finally prints "Inner done"
        // Outer try → divide numbers
        // Outer catch handles division error
        // Outer finally prints "Outer done"
        // ─────────────────────────────────────────────────────────────────────

        // (code to be written)


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 10: Nested Try-Catch (Array + Division) - Part 1
        // Write a Java program:
        // Create an array of size 3, ask user for index,
        // Inside outer try → inside inner try → access array element,
        // Handle ArrayIndexOutOfBoundsException in inner catch,
        // Outside → perform division, handle ArithmeticException in outer catch
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // int arr[] = {10, 20, 30};
        // try {
        //     try {
        //         System.out.print("Enter index: ");
        //         int index = sc.nextInt();
        //         System.out.println("Element: " + arr[index]);
        //     } catch (ArrayIndexOutOfBoundsException e) {
        //         System.out.println("Invalid index!");
        //     }
        //     System.out.print("Enter number: ");
        //     int a = sc.nextInt();
        //     System.out.print("Enter divisor: ");
        //     int b = sc.nextInt();
        //     int result = a / b;
        //     System.out.println("Result: " + result);
        // } catch (ArithmeticException e) {
        //     System.out.println("Cannot divide by zero!");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 10: Nested Try-Catch (Age + Division) - Part 2
        // Write a program:
        // Take age input, inside inner try: if age < 18 → throw exception,
        // Handle it in inner catch, outer try should perform division,
        // Handle division error outside
        // ─────────────────────────────────────────────────────────────────────

        // Scanner sc = new Scanner(System.in);
        // try {
        //     try {
        //         System.out.print("Enter age: ");
        //         int age = sc.nextInt();
        //         if (age < 18) {
        //             throw new Exception("Underage!");
        //         }
        //         System.out.println("Eligible");
        //     } catch (Exception e) {
        //         System.out.println(e.getMessage());
        //     }
        //     int a = 10;
        //     int b = 0;
        //     int result = a / b;
        // } catch (ArithmeticException e) {
        //     System.out.println("Divide by zero error!");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 11: Divide Two Numbers with Custom Exception (throw)
        // Write a Java program that takes two numbers and performs division.
        // If the denominator is 0, throw a custom exception "Division by zero not allowed".
        // ─────────────────────────────────────────────────────────────────────

        // class Test {
        //     static void takeNumbers(int a, int b) {
        //         if (b == 0) {
        //             throw new ArithmeticException("Division by zero not allowed");
        //         }
        //         int result = a / b;
        //         System.out.println(result);
        //     }
        // }
        // try {
        //     Test.takeNumbers(10, 0);
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 12: Bank Withdrawal System (throw + custom logic)
        // Create a bank system where withdrawal is allowed only if balance >= amount.
        // Otherwise, throw "Insufficient Balance" exception.
        // ─────────────────────────────────────────────────────────────────────

        // class Test {
        //     int balance = 5000;
        //     void withdraw(int amount) {
        //         if (amount > balance) {
        //             throw new ArithmeticException("Insufficient Balance");
        //         }
        //         balance -= amount;
        //         System.out.println("The remaining balance is :" + balance);
        //     }
        // }
        // Test t = new Test();
        // try {
        //     t.withdraw(6000);
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 13: File Reading Simulation (throws keyword)
        // Create a method that declares throws Exception and simulate file reading.
        // Handle the exception in main.
        // ─────────────────────────────────────────────────────────────────────

        // class Test {
        //     static void fileRead() throws IOException {
        //         throw new IOException("File not found");
        //     }
        // }
        // try {
        //     Test.fileRead();
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 14: Nested Try-Catch (Arithmetic + Array)
        // Write a program where:
        // Inner try handles ArithmeticException
        // Outer try handles ArrayIndexOutOfBoundsException
        // ─────────────────────────────────────────────────────────────────────

        // int[] arr = {1, 2, 3};
        // try {
        //     try {
        //         int res = 10 / 0;
        //     } catch (ArithmeticException e) {
        //         System.out.println("Cannot divide by zeroo");
        //     }
        //     System.out.println(arr[5]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Array index eror");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 15: User Defined Exception (InvalidAgeException) - BEST for exams
        // Create your own exception class InvalidAgeException.
        // Throw it if age < 18.
        // ─────────────────────────────────────────────────────────────────────

        // class InvalidAgeException extends Exception {
        //     InvalidAgeException(String msg) {
        //         super(msg);
        //     }
        // }
        // class Test {
        //     static void checkAge(int age) throws InvalidAgeException {
        //         if (age < 18) {
        //             throw new InvalidAgeException("Age must be > 18");
        //         } else {
        //             System.out.println("Eligible");
        //         }
        //     }
        // }
        // try {
        //     Test.checkAge(16);
        // } catch (InvalidAgeException e) {
        //     System.out.println(e.getMessage());
        // }

        // Java already has exception classes like ArithmeticException, IOException, etc.
        // By writing extends Exception, we tell Java:
        // 👉 "I want to make a new kind of exception, with its own name and meaning."
        // Now, whenever you throw new InvalidAgeException("Not eligible");, you are creating
        // an object of your custom exception class and throwing it.

        // super(msg) calls the constructor of the parent class (Exception).
        // The Exception class already has logic to store an error message internally.
        // By passing msg to super, you're telling the parent class:
        // 👉 "Save this message so that later, when someone calls getMessage(), it returns my custom text."


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 16: Login System (Real Life)
        // Create a login system:
        // If username/password wrong → throw exception
        // Use finally to print "Login attempt finished"
        // ─────────────────────────────────────────────────────────────────────

        // class Test {
        //     static void login(String username, String password) {
        //         if (!username.equals("admin") || !password.equals("1234")) {
        //             throw new RuntimeException("Invalid credentials...");
        //         }
        //         System.out.println("Logged in Successfull...");
        //     }
        // }
        // try {
        //     Test.login("admin", "1234");
        // } catch (RuntimeException e) {
        //     System.out.println(e.getMessage());
        // } finally {
        //     System.out.println("Login attempt finished");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 17: Password Validation (Custom Exception)
        // Validate password:
        // length < 6 → throw exception
        // no digit → throw exception
        // ─────────────────────────────────────────────────────────────────────

        // class PasswordException extends Exception {
        //     PasswordException(String msg) {
        //         super(msg);
        //     }
        // }
        // class Test {
        //     static void validate(String password) throws PasswordException {
        //         if (password.length() < 6) {
        //             throw new PasswordException("Password length must be greater than 6....");
        //         }
        //         boolean digit = false;
        //         for (char ch : password.toCharArray()) {
        //             if (Character.isDigit(ch)) {
        //                 // means it has digit
        //                 digit = true;
        //                 break;
        //             }
        //         }
        //         if (!digit) {
        //             throw new PasswordException("Password must have the digits inside it....");
        //         }
        //     }
        // }
        // try {
        //     Test.validate("password1234");
        // } catch (PasswordException e) {
        //     System.out.println(e.getMessage());
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 18: ATM System (Multiple Custom Exceptions)
        // Design an ATM system:
        // If PIN is incorrect → throw exception
        // If withdrawal > balance → throw exception
        // Always print "Transaction Ended" using finally
        // ─────────────────────────────────────────────────────────────────────

        // class InvalidPINException extends Exception {
        //     InvalidPINException(String msg) {
        //         super(msg);
        //     }
        // }
        // class InsufficientFundsException extends Exception {
        //     InsufficientFundsException(String msg) {
        //         super(msg);
        //     }
        // }
        // class ATM {
        //     int balance = 10000;
        //     int pin = 1234;
        //     void withdraw(int enteredPin, int amount) throws InvalidPINException, InsufficientFundsException {
        //         if (enteredPin != pin) {
        //             throw new InvalidPINException("Invalid PIN");
        //         }
        //         if (amount > balance) {
        //             throw new InsufficientFundsException("Not enough balance");
        //         }
        //         balance -= amount;
        //         System.out.println("Withdraw successful. Remaining balance: " + balance);
        //     }
        // }
        // ATM atm = new ATM();
        // try {
        //     atm.withdraw(1234, 15000);
        // } catch (InvalidPINException | InsufficientFundsException e) {
        //     System.out.println(e.getMessage());
        // } finally {
        //     System.out.println("Transaction Ended");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 19: Student Result Processing (Custom Exception + throws)
        // Create a system:
        // If marks < 0 or > 100 → throw exception
        // Calculate average of 3 subjects
        // Use throws and handle in main
        // ─────────────────────────────────────────────────────────────────────

        // class InvalidMarksException extends Exception {
        //     InvalidMarksException(String msg) {
        //         super(msg);
        //     }
        // }
        // class Student {
        //     static double calculateAverage(int m1, int m2, int m3) throws InvalidMarksException {
        //         if (m1 < 0 || m2 < 0 || m3 < 0 || m1 > 100 || m2 > 100 || m3 > 100) {
        //             throw new InvalidMarksException("Marks must be between 0 and 100");
        //         }
        //         return (m1 + m2 + m3) / 3.0;
        //     }
        // }
        // try {
        //     double avg = Student.calculateAverage(90, 85, 110);
        //     System.out.println("Average: " + avg);
        // } catch (InvalidMarksException e) {
        //     System.out.println(e.getMessage());
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 20: Array Processing System (Null + Index Check)
        // Write a program:
        // Accept array and index
        // If index invalid → handle exception
        // If array is null → throw exception
        // ─────────────────────────────────────────────────────────────────────

        // class Test {
        //     static int getElement(int arr[], int index) {
        //         if (arr == null) {
        //             throw new NullPointerException("Array is null");
        //         }
        //         try {
        //             return arr[index];
        //         } catch (ArrayIndexOutOfBoundsException e) {
        //             System.out.println("Invalid index accessed");
        //             return -1;
        //         }
        //     }
        // }
        // int arr[] = {10, 20, 30};
        // int value = Test.getElement(arr, 5);
        // System.out.println("Value: " + value);


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 21: Employee Salary Validation (Custom Exception)
        // Create employee system:
        // Salary < 10000 → throw exception
        // Bonus calculation = 10%
        // Use multiple catch
        // ─────────────────────────────────────────────────────────────────────

        // class InvalidSalaryException extends Exception {
        //     InvalidSalaryException(String msg) {
        //         super(msg);
        //     }
        // }
        // class Employee {
        //     static double calculateBonus(double salary) throws InvalidSalaryException {
        //         if (salary < 10000) {
        //             throw new InvalidSalaryException("Salary too low");
        //         }
        //         return salary * 0.10;
        //     }
        // }
        // try {
        //     double bonus = Employee.calculateBonus(8000);
        //     System.out.println("Bonus: " + bonus);
        // } catch (InvalidSalaryException e) {
        //     System.out.println(e.getMessage());
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Question 22: Login Attempts Limit System
        // Create login system:
        // Max 3 attempts, if failed → throw exception
        // Use loop + exception. After 3 failures → "Account locked"
        // ─────────────────────────────────────────────────────────────────────

        // class LoginFailedException extends Exception {
        //     LoginFailedException(String msg) {
        //         super(msg);
        //     }
        // }
        // class Test {
        //     static void login(String user, String pass) throws LoginFailedException {
        //         if (!user.equals("admin") || !pass.equals("1234")) {
        //             throw new LoginFailedException("Invalid credentials");
        //         }
        //         System.out.println("Login successful");
        //     }
        // }
        // int attempts = 0;
        // while (attempts < 3) {
        //     try {
        //         Test.login("admin", "wrong");
        //         break;
        //     } catch (LoginFailedException e) {
        //         attempts++;
        //         System.out.println(e.getMessage());
        //     }
        // }
        // if (attempts == 3) {
        //     System.out.println("Account locked");
        // }


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Predict Output 1: finally with return
        // ─────────────────────────────────────────────────────────────────────

        // static int test() {
        //     try {
        //         return 10;
        //     } finally {
        //         System.out.println("Finally executed");
        //     }
        // }
        // public static void main(String[] args) {
        //     System.out.println(test());
        // }

        // inside the test() the try block firstly executes and then return 10 is prepared
        // but before the control actually returns the finally block is executed or finally blocks always runs
        // so finally executed is printed
        // after the finally finishes the method completes the return 10 and 10 is returned to main and the output is:
        // Finally executed
        // 10


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Predict Output 2: System.exit(0) inside try
        // ─────────────────────────────────────────────────────────────────────

        // try {
        //     System.out.println("Try block");
        //     System.exit(0);
        // } finally {
        //     System.out.println("Finally block");
        // }

        // Step by step explanation -
        // program enters the try block and then after first sout it comes to System.exit(0);
        // when its called means System.exit(0) is called -
        // then it terminates the JVM immediately and once the jvm shuts down no further code executes not even the finally block
        // Because of that, "Finally block" is never printed.
        // Output: Try block


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Predict Output 3: return inside finally overrides try return
        // ─────────────────────────────────────────────────────────────────────

        // static int test() {
        //     try {
        //         return 1;
        //     } catch (Exception e) {
        //         return 2;
        //     } finally {
        //         return 3;
        //     }
        // }
        // public static void main(String[] args) {
        //     System.out.println(test());
        // }

        // 🔍 Execution Flow
        // try runs → return 1; is prepared.
        // Before the method actually returns, Java always executes finally.
        // In your finally, you also have a return 3;
        // This overrides whatever was prepared earlier (1 or 2).
        // So the method ends by returning 3.

        // Why This Happens:
        // In Java, finally is guaranteed to run before the method exits.
        // If finally itself has a return, that becomes the final return value, no matter what happened in try or catch.
        // That's why you don't see 1 or 2 — they get overridden.
        // Output: 3


        // ─────────────────────────────────────────────────────────────────────
        // 🧠 Predict Output 4: try + finally (no catch) — valid in Java
        // ─────────────────────────────────────────────────────────────────────

        // try {
        //     System.out.println("Try block");
        // } finally {
        //     System.out.println("Finally block");
        // }

        // This is perfectly valid because Java allows three legal forms:
        // 1. try + catch
        // 2. try + finally
        // 3. try + catch + finally
        // Output: Try block → Finally block

        // 🔍 Why try + finally (no catch) is useful:
        // Sometimes you don't want to handle the exception here,
        // you just want to make sure cleanup code runs (like closing a file/connection)
        // before the exception propagates up to the caller.

    }
}
