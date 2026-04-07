public class Fibonacci implements Fibonaccilike, Runnable {
    private static final Object fibbLock = new Object();
    // Fields
    int amountofNumbersInSequence;
    int number1;
    int number2;

    public Fibonacci(int number1, int number2, int amountofNumbersInSequence) {
        this.number2 = number2;
        this.number1 = number1;
        this.amountofNumbersInSequence = amountofNumbersInSequence;
    }

    // Methods
 public void calculate() {
     System.out.println(number1);
     System.out.println(number2);
     synchronized (fibbLock) {
         for (int i = amountofNumbersInSequence - 2; i > 0; i = i - 1) {
             System.out.println(number2 + number1);
             int bob = number1 + number2;

             try {
                 Thread.sleep(200);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }

             ;
             number1 = number2;
             number2 = bob;
         }
     }
 }

    public void run(){
        calculate();

    }

}
