package lab3.prob4;

public class House extends Property {
    private double lotSize;
    private Address address;

    public House(double lotSize){
        this.lotSize = lotSize;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public double computeRent() {
        return lotSize * 0.1;
    }
}
