import org.example.seminar4.CreditCard;
import org.example.seminar4.PaymentForm;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class seminar4Task2 {

    @Test
    public void CardTest(){
        CreditCard creditCard = mock(CreditCard.class);
        when(creditCard.getCardNumber()).thenReturn("12345678910");
        when(creditCard.getCardHolder()).thenReturn("Kobzev");
        when(creditCard.getExpiryDate()).thenReturn("30/10/2023");
        when(creditCard.getCvv()).thenReturn("666");

        PaymentForm paymentForm= new PaymentForm(creditCard);
        paymentForm.pay(100);
        verify(creditCard,times(1)).charge(100);

    }
}
