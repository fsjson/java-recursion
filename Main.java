public class Main{

    public static void main(String[] args){

        System.out.println("==============JAVA RECURSION===================");

        // calling ( sum method )

        int result = calculate(5);
        System.out.println("The result is: " + result);

        System.out.println("========Calculate Factorial in a Numbers=======");
        int number = 3;
        System.out.println("Factorial from " + number +  ": " + factorial(number));

        System.out.println("==============Halting Condition================"); // recursive statement or nested recursive
        int result_2 = sum(5, 10);
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
                // Note: variable "n" here means: n -- > n(value of numbers/variable)
                    // EX: n(3) then, ( n(3) + n(2) = [5] ) + n(1) = [6]
                    // More Explanation in below!

        // first sum method

    private static int sum(int parameter){
        if (parameter > 0){
            return parameter + sum(parameter -1);
        } else {
            return 0; // output will be = 0
        }
    }


/*

EXPLAINED:
    the example above is:
        (5 + sum( 4 ) = 9 + sum( 3 ) = 12 + sum( 2 ) + 14 + sum( 1 ) = 15)

        so, the result is 15.
        and, if the statement are else,
        then output will be = 0

        The Function of (parameter - 1) it's for reduce from the real value to the reduce value.
        example: real value that in input user(5), so 5 will be - 1 = [4].
        and we got 5 + sum(4 - 1 = [3]) = 9 ETC...

*/


        // second sum method

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

}
