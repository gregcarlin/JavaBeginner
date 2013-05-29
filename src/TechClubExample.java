import java.util.Scanner;


/* 
 * Basic Definitions of Key Terms:
 * 
 * Class - File that contains code
 * Method - A snippet of code found in a class. When a method is run, it is said to be 'called'.
 * Reserved Word - A special word used by Java that you are not allowed to use to name variables. Examples include 'public' and 'new'. They show up in purple in Eclipse.
 * Null - The absence of data. More on this later.
 * 
 */

public class TechClubExample {
    
    public static void main(String[] args) { // This is a special method automatically called when the program starts
        
        System.out.println("This is an example program!"); // Prints the text in quotes
        
        // Remember the format for variables: "Type name = value";
        int x = 3; // Creates a new variable of type 'int' with the name 'x' and a value of '3'. An 'int' variable stores an integer.
        System.out.println(x); // Prints out '3'
        x = 6; // Sets x to 6. Note that 'int' is not written because Java is already aware of x's type.
        System.out.println(x); // Prints out '6'
        x = x + 1; // Sets x equal to itself plus one
        x += 1; // Shorthand for the above
        x++; // Even shorter hand
        // Try printing x to see what it does
        
        /*
         * Variable Types:
         * 
         * There are two categories of variable types: primitives and objects
         * Primitives are basic data types. Examples include 'int' and 'boolean'. They show up in purple (but not the only thing that shows up in purple!) when written in Eclipse. There are only 8 primitive data types.
         * Objects are more complex. Examples include 'Scanner' and 'String'. They are made up of variables and methods that use primitives and other objects. Objects come from classes.
         * Now our definition of a class becomes more complex: A class is a blueprint for an object. It outlines the variables and methods that will be in the object.
         * An object is created using the 'new' reserved word.
         * 
         * To create a primitive variable, you can continue to use the basic variable format:
         * Generalized: type name = value;
         * Example: int x = 3;
         * 
         * When creating an object variable, our generalization can get a little more detailed:
         * Generalized: Type name = new Type(parameters);
         * Example: Scanner input = new Scanner(System.in);
         * 
         * If you would like to create a variable without giving it a value, you can set it to null. Null is the absence of value.
         * Scanner input = null;
         * You can also just omit the '= null'
         * Scanner input;
         * Both lines are equivalent when working with object variables.
         * You can also use the second method with primitives.
         * int x;
         * However, primitives cannot be null.
         * int x = null;
         * Would give you an error. Omitting the equals sign with a primitive variable will assign it a default value, which is usually 0.
         * 
         * Other important differences include:
         * You cannot call methods on primitive data types.
         * You can use '==' to check if two primitive data types are equal, but you should use the equals() method with objects.
         * All primitive data types have corresponding classes that can be used to wrap them. This is not important at the moment.
         * 
         */
        
        Scanner input = new Scanner(System.in); // Creates a Scanner object variable called 'input'
        String word = input.next(); // Creates a variable called 'word' with the type 'String' and assigns it to the next word typed in by the user.
        System.out.println("Your word was " + word);
        
        // Let's try the grades project
        int grade = input.nextInt(); // We can reuse the same Scanner object. Note that we also use nextInt() instead of next() to get a number. Note that if the user puts in a non-integer value, they will receive an ugly error.
        String letter; // letter is now null.
        if(grade >= 96) {
            letter = "A+";
        } else if(grade >= 90) {
            letter = "A";
        } else if(grade >= 86) {
            letter = "B+";
        } else if(grade >= 80) {
            letter = "B";
        } else if(grade >= 76) {
            letter = "C+";
        } else if(grade >= 70) {
            letter = "C";
        } else if(grade >= 65) {
            letter = "D";
        } else {
            // at this point, we know grade < 65
            letter = "F";
        }
        System.out.println("You got a " + letter);
        
    }
}
