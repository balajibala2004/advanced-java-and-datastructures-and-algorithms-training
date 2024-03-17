 public static int[] generateFibonacciNumbers(int n) {
        int[] fibonacciNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            fibonacciNumbers[i] = fibonacci(i);
        }
        return fibonacciNumbers;
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] result = generateFibonacciNumbers(n);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
