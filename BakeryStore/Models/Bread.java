package BakeryStore.Models;

public class Bread {
    private int totalCost;
    private int quantity;

    public Bread(int quantity, int totalCost) {
        this.totalCost = totalCost;
        this.quantity = quantity;
    }

    public int calculateTotalCost() {
        if (quantity > 2) {
            int remainder = quantity % 3;
            int priceOfDeal = (((quantity - remainder) / 3) * 10);
            int priceOfRemaining = remainder * 5;
            totalCost = priceOfDeal + priceOfRemaining;
            return totalCost;
        } else {
            totalCost = quantity * 5;
            return totalCost;
        }
    }
}