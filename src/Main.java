public class Main {

    public static void main(String[] args) {
        int myFirstNumber = (10 + 5) + (2 * 10);

        // Initializing a second variable via value.
        int mySecondNumber = 12;

        // Initializing a third variable via variable.
        int myThirdNumber = myFirstNumber * 2;

        // Using variables in an expression.
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        // Prints the value stored in variable myTotal.
        System.out.println(myTotal);

        // Initializing a fifth variable whose value is 1000 less the current value of variable myTotal.
        int myLastOne = 1000 - myTotal;

        // Prints the value stored in variable myLastOne.
        System.out.println(myLastOne);
    }
}