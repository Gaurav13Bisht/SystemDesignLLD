package DesignPatterns.Creational.FactoryDesignPattern.SpringBootImplementation;


public interface PaymentProvider {
    void acceptPayment();
}


//@Service("STRIPE")
//public class StripePaymentProvider implements PaymentProvider {
//    @Override
//    public void acceptPayment() {
//        System.out.println("Accepting payment using Stripe");
//    }
//}
//
//@Service("PAYPAL")
//public class PayPalPaymentProvider implements PaymentProvider {
//    @Override
//    public void acceptPayment() {
//        System.out.println("Accepting payment using PayPal");
//    }
//}
//
//@Service
//public class PaymentProviderFactory {
//
//    private final Map<String, PaymentProvider> paymentProviderMap;
//
//    // Constructor injection
//    public PaymentProviderFactory(Map<String, PaymentProvider> paymentProviderMap) {
//        this.paymentProviderMap = paymentProviderMap;       // Auto population of this map
//    }
//
//    public PaymentProvider getPaymentProvider(String providerType) {
//        PaymentProvider provider = paymentProviderMap.get(providerType.toUpperCase());
//        if (provider == null) {
//            throw new IllegalArgumentException("Unknown payment provider type: " + providerType);
//        }
//        return provider;
//    }
//}
//
//
//@RestController
//public class PaymentController {
//
//    private final PaymentProviderFactory factory;
//
//    public PaymentController(PaymentProviderFactory factory) {
//        this.factory = factory;
//    }
//
//    @GetMapping("/process-payment")
//    public String processPayment(@RequestParam String providerType) {
//        PaymentProvider provider = factory.getPaymentProvider(providerType);
//        provider.acceptPayment();
//        return "Payment processed with " + providerType;
//    }
//}