public class Main{

    public static void main(String[] args){

        System.out.println("\n\n==============JAVA RECURSION===========\n");

        // calling ( sum method )

        int result = calculate(5);
        System.out.println("The result is: " + result);

        int results = sum(100);
        System.out.println("The second result is: "  + results);


        System.out.println("\n\n========Calculate Factorial in a Numbers=======\n");
        int number = 5;
        System.out.println("Factorial from " + number +  " is, " + factorial(number));


        System.out.println("\n==============Halting Condition===========\n"); // recursive statement // nested recursive
        int result_2 = sum(15, 100);
        System.out.println("the result is: " + result_2);

    }

    // a simple recursion method!

        // Fist

    private static int calculate(int parameter) {
        if (parameter > 0) {
            return parameter + calculate(parameter-1);
        } else {
            return 0;
        }
    }

        // Second

            // Calculate Factorial in a Numbers

        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }


        // first sum method

    private static int sum(int parameter){
        if (parameter > 0){
            return parameter + sum(parameter -1);
        } else {
            return 0; // output will be = 0
        }
    }


    // the example above is:
    // (5 + sum( 4 ) = 9 + sum( 3 ) = 12 + sum( 2 ) + 14 + sum( 1 ) = 15)

    // so, the result is 15.
    // and, if the statement are else,
    // then output will be = 0


        // second sum method

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

}
