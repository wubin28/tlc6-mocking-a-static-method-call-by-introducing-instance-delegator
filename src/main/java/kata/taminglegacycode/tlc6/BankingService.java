package kata.taminglegacycode.tlc6;

public class BankingService {
    public static void updateAccountBalance(String id, int sum) {
        // a lot of logic we don't want to run in our tests.
    }

    public void updateAccountBalance_instance(String id, int sum) {
        updateAccountBalance(id, sum);
    }
}
