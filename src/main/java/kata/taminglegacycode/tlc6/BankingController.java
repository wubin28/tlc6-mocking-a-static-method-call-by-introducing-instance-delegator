package kata.taminglegacycode.tlc6;

public class BankingController {
    public void updateAccountBalance(int sum, String id, SMService smService) {
        BankingService.updateAccountBalance(id, sum);
        if (sum > 1000) {
            smService.send("your balance is " + sum);
        }
    }
}
