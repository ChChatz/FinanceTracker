public class FinanceAccountApp {

    public static void main(String[] args) {

        FinanceAccount Emma = new FinanceAccount("Emma", 500, 4.8,10);
        FinanceAccount Alex = new FinanceAccount("Alex", 700, 6.5, 8);

        Emma.displayAccountInfo();
        Alex.displayAccountInfo();
    }
}
