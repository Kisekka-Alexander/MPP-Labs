package lab4.probc;

public record Paycheck(double grossPay, double fica,
                       double state, double local, double medicare,
                       double socialSecurity) {

    public Paycheck {
        if(grossPay < 0 || fica < 0 || state < 0 || local < 0 || medicare < 0 || socialSecurity < 0) {
            throw new IllegalArgumentException("Invalid parameters");
        }
    }

    public double getNetPay(){
        return (grossPay - state - fica - local - socialSecurity - medicare);
    }
    public void print(){
        System.out.println("Gross Pay: "+ grossPay
        + "\n" + "Fica: " + fica
                +"\n" + "Fica: " + fica
                +"\n" + "Medicare: " + medicare
                +"\n" + "State: " + state
                +"\n" + "Local: " + local
                +"\n" + "Social security: " + socialSecurity
                +"\n" + "Net Pay: " + getNetPay());
    }
}
