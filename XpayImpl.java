import com.teamrocket.Xpay;

public class XpayImpl implements Xpay {
    private String cNo;
    private String customerName;
    private String cExpMonth;
    private String cExpYear;
    private Short cCVVNo;
    private Double amount;

    @Override
    public String getCreditCardNo() {
        return this.cNo;
    }

    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public String getCardExpMonth() {
        return this.cExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return this.cExpYear;
    }

    @Override
    public Short getCardCVVNo() {
        return this.cCVVNo;
    }

    @Override
    public Double getAmount() {
        return this.amount;
    }

    @Override
    public void setCreditCardNo(String cNo) {
        this.cNo = cNo;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cExpMonth = cardExpMonth;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cExpYear = cardExpYear;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cCVVNo = cardCVVNo;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
