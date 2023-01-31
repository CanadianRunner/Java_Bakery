package BakeryStore.Models;

public class Bread {
    private int breadQuantity;

    public Bread(int breadQuantity) {
        this.breadQuantity = breadQuantity;
    }

    public int getTotalCost() {
        return calculateTotalCost();
    }

    public int calculateTotalCost() {
        int totalCost;
        if (breadQuantity > 2) {
            int remainder = breadQuantity % 3;
            int priceOfDeal = (((breadQuantity - remainder) / 3) * 10);
            int priceOfRemaining = remainder * 5;
            totalCost = priceOfDeal + priceOfRemaining;
        } else {
            totalCost = breadQuantity * 5;
        }
        return totalCost;
    }
}

