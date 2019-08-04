package kata.taminglegacycode.tlc6;

import org.junit.Test;

import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class BankingControllerTest {
    @Test
    public void should_send_short_message_if_sum_is_big_enough() {
        SMService mockSmService = mock(SMService.class);
        BankingController bankingController = new BankingController();
        BankingService mockBankingService = mock(BankingService.class);

        bankingController.updateAccountBalance(1001, "12345", mockSmService, mockBankingService);

        then(mockSmService).should(times(1)).send("your balance is 1001");
    }
}
