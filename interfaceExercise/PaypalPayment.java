package interfaceExercise;

import java.math.BigDecimal;

public class PaypalPayment implements Payment{

    @Override
    public void createPayment() {
        System.out.println("El metodo de pago creado es Paypal");
    }

    @Override
    public String obtainPayment() {
        return "Paypal";
    }

    public BigDecimal totalPrice() {
        return BigDecimal.TEN;
    }
}
