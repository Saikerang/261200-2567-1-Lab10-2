import com.silphco.PayD;
import com.teamrocket.Xpay;
import com.teamrocket.XpayImpl;

public class Main {
    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Somchai Jaidee");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);
        PayD payD = new XpayToPayDAdapter(xpay);

        System.out.println("Card Owner Name: " + payD.getCardOwnerName());
        System.out.println("Credit Card No: " + payD.getCreditCardNo());
        System.out.println("Card Exp Month/Year: " + payD.getCardExpMonthYear());
        System.out.println("CVV No: " + payD.getCVVNo());
        System.out.println("Total Amount: " + payD.getTotalAmount());


    }
}