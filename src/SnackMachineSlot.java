public class SnackMachineSlot {
    private String itemName;
    private int quantity;
    private double price;
    private int itemsSold;


public SnackMachineSlot(String givenItemName, double initialPrice, int initialQuantity, int itemsSold) {
   
   itemName = "Chips";
   
   quantity = 3;
   if (quantity < 0)
    quantity = 0;
   
   price = 1.5;
     if (price < 0)
        price = 0;

     itemsSold = 0;
    
}


public String toString() {
return ( "Item: " + itemName + "," + " Price: " +  price + "," + " In Stock: " + quantity);
}

public void purchaseOne() {
    if (quantity > 0)
        quantity = quantity - 1;
    itemsSold = itemsSold + 1;
    
      
}

public double getRevenue() {
    return itemsSold * price; 
}

}


