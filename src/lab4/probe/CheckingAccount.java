package lab4.probe;

public class CheckingAccount extends Account{
    public Double balance;
    public Double monthlyFee;
    public String acctId;

    public CheckingAccount(String acctId, Double fee, Double startBalance){
            this.acctId = acctId;
            this.monthlyFee = fee;
            this.balance = startBalance;
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
        return balance - monthlyFee;
    }
}
