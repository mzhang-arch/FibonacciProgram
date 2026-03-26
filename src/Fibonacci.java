public class Fibonacci implements Fibonaccilike {
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
    for(int i = amountofNumbersInSequence; i > 0; i = i - 1 ) {
     System.out.println(number2 + number1 );
     int bob = number1 + number2;;
    number1 = number2;
     number2 = bob;


    }
    }
}
