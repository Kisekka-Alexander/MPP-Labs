package lab3.prob2;

import java.util.*;

public class LandlordInfo {

    private List<Building> buildingList;

    public LandlordInfo(){
        buildingList = new ArrayList<>();
    }

    public void addBuilding(Building building){
        buildingList.add(building);
    }

    public double calcProfits(){
        double profits = 0.0;

        for(Building b: buildingList){
            profits += b.getBuildingProfit();
        }

        return profits;
    }
}
