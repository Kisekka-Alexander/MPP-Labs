package lab4.probe;

public class SavingsAccount extends Account{

    public Double balance;
    public Double interestRate;
    public String acctId;

    public SavingsAccount(String acctId, Double interestRate, Double startBalance){
        this.acctId = acctId;
        this.balance = startBalance;
        this.interestRate = interestRate;
    }

    @Override
    public String getAccountID() {
        return acctId;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public Double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }
}
