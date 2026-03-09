interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagamento de " + amount + " realizado com Cartao de Credito");
    }
}

class PixPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagamento de " + amount + " realizado com PIX");
    }
}

class PaymentProcessor {

    private static PaymentProcessor instance;

    private PaymentProcessor() {}

    public static PaymentProcessor getInstance() {
        if(instance == null){
            instance = new PaymentProcessor();
        }
        return instance;
    }

    public void processPayment(PaymentStrategy strategy, double amount){
        strategy.pay(amount);
    }
}

class PaymentFacade {

    private PaymentProcessor processor = PaymentProcessor.getInstance();

    public void payWithPix(double amount){
        processor.processPayment(new PixPayment(), amount);
    }

    public void payWithCreditCard(double amount){
        processor.processPayment(new CreditCardPayment(), amount);
    }
}

public class Main {

    public static void main(String[] args) {

        PaymentFacade payment = new PaymentFacade();

        payment.payWithPix(150);
        payment.payWithCreditCard(300);

    }
}