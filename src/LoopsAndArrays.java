/*
 * Prerequisite: Basics
 */
public class LoopsAndArrays {
    
    public static void main(String[] args) {
        // An array variable is defined very similarly to any other variable.
        // You can follow this format: Type[] name = new Type[size];
        // For example, let's create an array called "nums" that can store 10 ints.
        int[] nums = new int[10];
        // Creating an array with a size of 10 will reserve 10 spaces in memory to store variables.
        // Arrays can just as easily be created with Objects instead of primitives.
        String[] words = new String[10];
        // The only difference to note between the primitive arrays and the objects arrays are the default values.
        // When an object array is created using the above format, all spaces in the array are set to null.
        // When a primitive array is created using the above format, all spaces are set to that primitive's default value (usually 0)
        // Items in an array can be accessed using the following format: name[index]
        // It is also important to note that the items in arrays are all given index values, starting with the number 0.
        // Therefore, the first item in the array is said to be at index '0'
        // We can also conclude that the last item of an 'n' sized array will be at the index 'n-1'.
        // For example the last item in an array with a size of 10 will be at the index 9
        // Because of all this, we can use the following lines to print out the first items in each array.
        System.out.println(nums[0]); // prints "0"
        System.out.println(words[0]); // prints "null"
        
        // Let's set the numbers in the first array to the numbers 1-10.
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;
        // Trying to access a location in an array that doesn't exist will give you an error.
        
        // That was tedious. Programming should not be tedious. 
        // If you ever find yourself doing something tedious while coding, you're doing it wrong. We'll discuss a better way to do this shortly.
        // First, let's print out everything in the array. While we could write System.out.println 10 times, that would also be tedious. Let's use a loop.
        // The simplest type of loop is the while loop. It will continue to execute a piece of code while a condition is true.
        // Here's how we can use a while loop to print out an array.
        
        int i = 0; // This is going to keep track of where we are in the array.
        while(i < 10) { // Condition is checked. If the condition is true, the code inside the while loop will execute. Otherwise, Java will skip over the while loop.
            System.out.println(nums[i]);
            i++;
        }
        // Note how in this loop, we have a variable called 'i' that keeps track of our current index. The while loop executes like this:
        // 'i' starts at 0. 0 < 10, so the code executes. nums[0] is printed. 'i' increases to 1. 1 < 10. nums[1] is printed. 'i' increases to 2. etc.
        
        // Be careful with while loops! It is easy to create a while loop that never stops! This is called an infinite loop! A simple example can be seen here:
        // while(true) {}
        // 'true' is always true, so the loop will never stop! This will freeze your program!
        // Here's a more subtle example:
        /* 
         * int i = 0;
         * while (i < 10) {
         *     System.out.println(nums[i]);
         * }
         */
        // Note how the exclusion of the line 'i++' causes an infinite loop. 'i' is never changed after it is set to 0, so i is always less than 10!
        
        // There is another loop that simplifies things a bit. It's called the for loop.
        for(int x=0; x<10; x++) {
            System.out.println(nums[x]);
        }
        // The for loop manages our index variable for us. This is done in the first part of the for loop in three parts.
        // These parts are the 'initialization', the 'condition', and the 'incrementation'. They are separated by semicolons.
        // The 'initialization' is executed before the loop starts. We use it to establish our index variable (int x=0)
        // The 'condition' is what is checked before the next iteration of the loop. We use it to ensure we don't get an infinite loop (x<10)
        // The 'incrementation' is executed after each iteration of the loop. We use it to increase our index variable (x++)
        
        // But there's an even simpler way to print out the contents of an array! We can use a for each loop.
        for(int n : nums) {
            System.out.println(n);
        }
        // Note the lack of an index variable. Instead, 'n' represents the number we are currently accessing.
        // Due to this missing index variable, we cannot set the items in the array with a for each loop.
        
        // Now, back to the issue of setting the items in an array to the numbers 1-10. Let's start with a new array.
        int[] items = new int[10];
        // Look back to lines 27-36 where we set the array manually. Notice how each item in the array is set to a number equal to its index + 1
        for(int j=0; j<items.length; j++) { // Notice how items.length is used instead of 10. items.length will return the size of the array (10). Now if the size of the array is changed, this will automatically adjust.
            items[j] = j + 1;
        }
        
        // Try printing out the contents of 'items' to see if it worked. (Spoiler alert: it did)
        
        // Almost forgot to mention the literal for arrays:
        int[] arr = new int[] {7, 3, 19}; // Creates an array with a size of three and the values 7, 3, and 19
        // And even simpler:
        int[] arr2 = {7, 3, 19};
    }
    
}
