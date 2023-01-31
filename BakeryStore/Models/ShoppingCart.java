package BakeryStore.Models;

public class ShoppingCart {
    private Bread customerBreadOrder;
    private Pastry customerPastryOrder;
    private int totalCost;

    public ShoppingCart(Bread customerBreadOrder, Pastry customerPastryOrder) {
        this.customerBreadOrder = customerBreadOrder;
        this.customerPastryOrder = customerPastryOrder;
        calculateTotalCost();
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void calculateTotalCost() {
        totalCost = customerBreadOrder.getTotalCost() + customerPastryOrder.calculateTotalCost();
    }
}

