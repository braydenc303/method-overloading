package academy.learnprogramming;

// Method Overloading is a feature that allows a class to have more than one method having the same name if their argument lists are different. These can differ by the number of input parameters, the type of input parameters, or both.

// Though you can change the return type, when overloading, that alone will not allow you to overload a method, you must have a different argument list in order to overload the method.

public class Main {
    public static void main(String[] args) throws Exception {
        int newScore = calculateScore("Brayden", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(69);
        calcFeetAndInchesToCentimeters(50);
        calcFeetAndInchesToCentimeters(-1);
        calcFeetAndInchesToCentimeters(12, 13);
        calcFeetAndInchesToCentimeters(-1, -1);
        calcFeetAndInchesToCentimeters(0, 5);
        calcFeetAndInchesToCentimeters(3, 15);
    }

    // Create a method called calcFeetAndInchesToCentimeters
    // It needs two parameters.
    // feet is the first parameter, inches is the 2nd parameter
    public static void calcFeetAndInchesToCentimeters(double feet, double inches) {

        // You should validate that the first parameter is >=0
        // You should validate that the second parameter is  >= 0 and <=12
        if(feet >= 0 && inches >=0 && inches <=12) {
            System.out.println(feet + " feet and " +inches + " inches is equal to " + ((feet * 12d) + inches) * 2.54d + " cm.");
        } else {
            System.out.println("Invalid arguments. Feet must be positive, and inches must be between 1 and 12.");
        }
        // return -1 from the method if either of the above is not true.
    }

    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    public static void calcFeetAndInchesToCentimeters(double inches) {
        // validate that it is >=0
        if( inches >= 0 ) {
            double feet = (int) inches/12;
            // can also be done like this
            // double feet = (Math.floor(inches/12d));
            double inchesRemaining = (int) inches % 12d;
            System.out.println(inches + " is equal to " + feet + " feet " + inchesRemaining + " inches.");
            calcFeetAndInchesToCentimeters(feet, inchesRemaining);
        } else {
            System.out.println("Invalid distance. Number must be positive.");
        }
        // return -1 if that is not true
        // If it is valid, calculate how many feet are in the inches and then call the other overloaded method passing the correct feet and inches
    }
        // hints: Use double for the number datatypes
    // 1 inch = 2.54cm and 1 foot is 12 inches
    // use the link I give you to confirm your code is calculating correctly.
    //www.metric-conversions.org/length/feet-to-centimeters.htm
    // Calling another overloaded method just requires you to use the right number of parameters.

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score. ");
        return 0;
    }
}

// RECAP
// Method overloading is a feature that allows us to have more than one method with the same name, as long as we use different parameters.

// An example would be that you have to create a method which can return:

// The sum of two, three, or four, numbers. Each method would have parameters passed to it with the numbers to sum.

// This makes it easier to remember the method names if they all do a similar thing.

// Method overloading is a common practice and is implemented in other programming languages as well.

// It improves code readability and re-usability.

// It is easier to remember one methodh name instead of multiple names. 

// Acheives consistency in naming. One name for methods that are commonly used. For example, println.

// Overloaded methods give programmers the flexibility to call a similar method with different types of data, based on the types of arguments/parameters that you define.

