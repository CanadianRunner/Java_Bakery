package BakeryStore.Models;

public class ShoppingCart {
    private int totalCost;

    public ShoppingCart(int totalCost) {
        this.totalCost = totalCost;
    }

    public int calculateTotalCost(int breadCost, int pastryCost) {
        totalCost = breadCost + pastryCost;
        return totalCost;
    }
}