package interfaceExercise;

public class Main {
    public static void main(String[] args) {
        Payment paypalPayment = new PaypalPayment();
        Payment creditCardPayment = new CreditCardPayment();
        processPayment(creditCardPayment);
    }

    static void processPayment(Payment payment) {
        System.out.println(payment.obtainPayment());
        payment.createPayment();
    }
}
