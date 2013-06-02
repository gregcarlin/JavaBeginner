/*
 * Prerequisite: Basics
 */
public class Methods {
    
    public static void main(String[] args) { // This is called the method header.
        // Methods are snippets of code that can be run over and over again.
        // We are actually inside of a method called 'main' right now.
        // System.out.println() is a method.
        // System is a class.
        // out is a variable found inside the 'System' class
        // println() is the method.
        
        // Some methods take parameters, others don't. Let's look at a basic method, defined further down the page. Here we call it.
        test();
        // The test method takes no parameters, hence the empty parenthesis.
        
        // Now let's try a method that takes in a single parameter. The method 'myNumber' takes in a number.
        myNumber(3);
        
        // Now let's try a method that takes in two parameters.
        bothMyNumbers(2, 8);
        // Methods can be defined to take in as many parameters as you want, separated by commas.
        
        // Now let's try a method that returns information.
        int i = addTwo(5);
        // The addTwo method takes in a single int parameter, and returns its value + 2
        System.out.println(i); // Prints '7'
    }
    
    public static void test() { // The whole 'public static void' thing will be explained later.
        System.out.println("Hello World!");
    }
    
    public static void myNumber(int n) { // Note the parameter definition. 'int' is the type of the parameter, and we give it the name 'n'
        System.out.println("Your number is " + n);
    }
    
    public static void bothMyNumbers(int a, int b) {
        System.out.println("Your first number is " + a + " and your second number is " + b);
    }
    
    public static int addTwo(int n) { // 'void' is changed to 'int'. 'void' indicate that nothing is returned, but now we want to return an int.
        return n + 2;
    }
    
}
