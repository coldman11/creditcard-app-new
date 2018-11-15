package pl.jkan.creditcard;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/cards")
class CreditCardController {
    
    CreditCardApi api;
    
    @Autowired
    public CreditCardController(CreditCardApi api) {
        this.api = api;
    }
    
    @GetMapping("/{number}")
    public String balance() {
        return "200 zł";
    }
    @PostMapping("/{number}/{money}")
    public void withdraw(@PathVariable, String number, @PathVariable double money) {
        try {
            api.widthdraw(number, money);
        } catch (Throwable e) {
            
        }
        
    }
}