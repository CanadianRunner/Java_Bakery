package BakeryStore.Models;

public class Pastry {
    private int totalCost;
    private int quantity;

    public Pastry(int quantity, int totalCost) {
        this.totalCost = totalCost;
        this.quantity = quantity;
    }

    public int calculateTotalCost() {
        if (quantity > 2) {
            int remainder = quantity % 3;
            totalCost = (((quantity - remainder) / 3) * 5) + (remainder * 2);
            return totalCost;
        } else {
            totalCost = quantity * 2;
            return totalCost;
        }
    }
}