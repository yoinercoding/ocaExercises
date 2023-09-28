package interfaceExercise;

public class CreditCardPayment implements Payment{

    @Override
    public void createPayment() {
        System.out.println("El metodo de pago creado es Credit Card");
    }

    @Override
    public String obtainPayment() {
        return "Credit Card";
    }
}
