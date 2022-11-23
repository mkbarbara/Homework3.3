public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("На 12 месяцев: " + service.calculate(12, 1_000_000, 9.99));
        System.out.println("На 24 месяца: " + service.calculate(24, 1_000_000, 9.99));
        System.out.println("На 36 месяцев: " + service.calculate(36, 1_000_000, 9.99));
    }
}