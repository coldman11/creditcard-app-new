package pl.jkan.creditcard;

import org.springframework.context.annotation.Configuration;

@Configuration
class CreditCardConfiguration {
    @Bean
    public CreditCardApi creditcardApi() {
        CreditCardRepository repo = new CreditCardRepository();
        CreditCard c1 = new CreditCard("1234");
        repo.add(c1);
        
        return new CreditCardApi(repo);
    }
}