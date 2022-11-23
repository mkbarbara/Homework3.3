public class CreditPaymentService {

    public int calculate(int months, int amount, double loan) {
        double monthLoan = loan/12/100;
        double ann = (monthLoan*Math.pow(1+monthLoan, months))/(Math.pow(1+monthLoan, months)-1);
        double result = amount*ann;
        return (int) result;
    }
}
