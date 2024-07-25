class FlipkartRunner{

  public static void main(String [] item){
  
  boolean itemAdded = Flipkart.addItemName("TV");
  System.out.println("is item added "+itemAdded);
  
  itemAdded = Flipkart.addItemName("washing machin");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("oven");
  System.out.println("is item added "+ itemAdded);

  itemAdded = Flipkart.addItemName("bottle");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("headphones");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("bucket");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("clock");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("furniture");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("moblies");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("water heater");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("ironbox");
  System.out.println("is item added "+ itemAdded);

  Flipkart.showItemList();
  
  boolean itemUpdated = Flipkart.updateItemName("laptop","moblies");
  System.out.println("is item updated "+ itemUpdated);

  Flipkart.showItemList();
  
  boolean itemDeleted = Flipkart.deleteItemName("water heater");
  System.out.println("is item deleted "+ itemDeleted);
  
  Flipkart.showItemList();
  }

}