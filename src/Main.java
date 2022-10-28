public class Main {

    public static void main(String[] args) {
        // Initializing a variable via an expression of values.
        int myFirstNumber = (10 + 5) + (2 * 10);

        // Initializing a second variable via value.
        int mySecondNumber = 12;

        // Initializing a third variable via an expression of variable and value.
        int myThirdNumber = myFirstNumber * 2;

        // Initializing a fourth variable via an expression of variables.
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        // Prints the value stored in variable myTotal.
        System.out.println(myTotal);

        // Initializing a fifth variable whose value is 1000 less the current value of variable myTotal.
        int myLastOne = 1000 - myTotal;

        // Prints the value stored in variable myLastOne.
        System.out.println(myLastOne);
    }
}