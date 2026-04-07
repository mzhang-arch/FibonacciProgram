public class Main  {
    public static void main(String[] args) {


Fibonacci fib1 = new Fibonacci(5 ,7, 20);

Fibonacci fib2 = new Fibonacci(3 ,-1, 20);

Fibonacci fib3 = new Fibonacci(6 ,-1, 20);

Fibonacci fib4 = new Fibonacci(1 ,-1, 20);


        Thread Thread1 = new Thread(fib1);
        Thread1.start();

        Thread Thread2 = new Thread(fib2);
        Thread2.start();

        Thread Thread3 = new Thread(fib3);
        Thread3.start();

        Thread Thread4 = new Thread(fib4);
        Thread4.start();

    }
}