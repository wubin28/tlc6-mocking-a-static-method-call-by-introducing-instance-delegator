package kata.taminglegacycode.tlc6;

public class BankingController {
    public void updateAccountBalance(int sum, String id, SMService smService, BankingService bankingService) {
        bankingService.updateAccountBalance_instance(id, sum);
        if (sum > 1000) {
            smService.send("your balance is " + sum);
        }
    }
}
