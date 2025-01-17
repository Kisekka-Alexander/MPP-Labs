package lab3.prob4;

public class Trailer extends Property {

    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public double computeRent() {
        return 500;
    }
}
