// Christos Chatziioannou // Final Project – Part II

public class FinanceAccountArrayApp {
    public static void main(String[] args) {

        FinanceAccount[] accounts = {
            new FinanceAccount("Emma", 500, 4.8,10),
            new FinanceAccount("Alex", 700, 6.5, 8),
            new FinanceAccount("Joe", 1000,5,10),
        };

        System.out.println("Finance Accounts Summary: \n");
        for (FinanceAccount account : accounts){
            account.displayAccountInfo();
        }

    }
}
