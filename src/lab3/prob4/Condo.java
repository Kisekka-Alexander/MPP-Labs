package lab3.prob4;

public class Condo extends Property {

    private int numOfFloors;
    private Address address;

    public Condo(int numOfFloors){
        this.numOfFloors = numOfFloors;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public double computeRent() {
        return 400 * numOfFloors;
    }
}
