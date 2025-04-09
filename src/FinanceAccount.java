public class FinanceAccount {

    private String accountHolder;
    private double monthlyContribution;
    private double interestRate;
    private int years;

    public FinanceAccount(String accountHolder, double monthlyContribution, double interestRate, int years){
        this.accountHolder = accountHolder;
        this.monthlyContribution = monthlyContribution;
        this.interestRate = interestRate;
        this.years = years;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public double getMonthlyContribution() {
        return monthlyContribution;
    }

    public void setMonthlyContribution(double monthlyContribution) {
        this.monthlyContribution = monthlyContribution;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double calculateTotalSavings(){
        return (monthlyContribution * 12 * years);
    }

    public double calculateInterestEarned(){
        return (calculateTotalSavings() * (interestRate/100));
    }

    public void displayAccountInfo(){
        System.out.println("Account Information - " + accountHolder);
        System.out.println("Monthly Contribution: " + monthlyContribution);
        System.out.println("Interest Rate: "+ interestRate + "%");
        System.out.println("Years: " + years);
        System.out.println("Total Savings: $" + calculateTotalSavings());
        System.out.println("Total Interest Earned: $" + calculateInterestEarned() + "\n");

    }
}
