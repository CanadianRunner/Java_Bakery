package BakeryStore.Models;

public class Pastry {
    private int pastryQuantity;

    public Pastry(int pastryQuantity) {
        this.pastryQuantity = pastryQuantity;
    }

    public int getTotalCost() {
        return calculateTotalCost();
    }
  
    public int calculateTotalCost() {
        int totalCost;
        int numberOfDeals = pastryQuantity / 3;
        int numberOfRemainders = pastryQuantity % 3;
        int priceOfDeals = numberOfDeals * 5;
        int priceOfRemainders = numberOfRemainders * 2;
        totalCost = priceOfDeals + priceOfRemainders;
        return totalCost;
    }
}

