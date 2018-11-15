package pl.jkan.creditcard;
import java.math.BigDecimal;

class CreditCardApi {
    private CreditCardRepository cards;
    public CreditCardApi (CreditCardRepository cards) {
        this.cards = cards;
    }
    public void withdraw(String id, double money) {
        CreditCard c = cards.find(id);
        c.withdraw(BigDecimal.valueOf(money));
    }
}