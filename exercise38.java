public class exercise38 {
    /*
    *   Consider the following method,
    *   which is intended to make an array of integers and return the sum of all the odd numbers in the array.
    *   There is an error in the implementation. Choose the option that best describes the error.
     */
            public static int sumOfOdds ( int[] arr){
                int sum = 0;
                for (int i = 0; i <= arr.length; i++) {
                    if (arr[i] % 2 == 1) {
                        sum += arr[i];
                    }
                }
                return sum;
            }

            /*
            *       output?
            *   a- The method does not compile because of a syntax error.
            *   b- The method compiles without error, but throws an exception at runtime. <---- Correct answer
            *   c- The method returns the sum of all the numbers in the array. not just the odd numbers.
            *   d- The method returns zero for all inputs.
            *   e- The method return the sum of all the even numbers in the array, not the odd numbers.
            *   f- The method correctly returns the sum of all the odd numbers in the array.
             */
        }

