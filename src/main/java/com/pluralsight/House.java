package com.pluralsight;

public class House extends Asset{

    private String address;
    private int condition;
    private  int squareFoot;
    private  int lotSize;

    public House(String description, String dateAcquired, Double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getCondition() {
            return condition;
    }
    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }



    // A house's value is determined as
// $180.00 per square foot (excellent)
// $130.00 per square foot (good)
// $90.00 per square foot (fair)
// $80.00 per square foot (poor)
// PLUS 25 cents per square foot of lot size
    @Override
    public Double getValue() {
       double pricePerSqFt = 0.00;

        switch (condition){
            case 1: //excellent
                pricePerSqFt = 180.00;
                break;

            case 2: //good
                pricePerSqFt = 130.00;
                break;

            case 3: //fair
                pricePerSqFt = 90.00;
                break;

            case 4: //poor
                pricePerSqFt = 80.00;
                break;

            default:
                System.out.println("This doesn't fit any condition");
        }

        double houseValue = pricePerSqFt * condition;
        double lotValue = lotSize * 0.25;
        double totalValue = houseValue + lotValue;

        return 0.00;
    }

}
