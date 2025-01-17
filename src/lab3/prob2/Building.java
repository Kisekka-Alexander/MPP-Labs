package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private static final double MONTHLY_COST = 586;
    private int buildingID;
    private int numberOfApartments;
    private List<Apartment> apartments;

    public Building(int id, int numberOfApartments){
        this.buildingID = id;
        this.numberOfApartments = numberOfApartments;
        apartments = new ArrayList<>();
    }

    public void addApartment(Apartment apartment){
        apartments.add(apartment);
    }

    public double getBuildingProfit(){
        double profits = 0.0;

        for (Apartment apart: apartments){
            profits += apart.getRent();
        }

        return profits - MONTHLY_COST;
    }

}
