class JuiceShopRunner{

    public static void main(String[] juice){
	
	
	boolean juiceAdded = JuiceShop.addJuiceName("Watermelon juice");
	System.out.println("is juice name added " + juiceAdded);
	
	juiceAdded = JuiceShop.addJuiceName("orange juice");
	System.out.println("is juice name added " + juiceAdded);
	
	juiceAdded = JuiceShop.addJuiceName("Mango juice");
	System.out.println("is juice name added " + juiceAdded);
	
	juiceAdded = JuiceShop.addJuiceName("pineapple juice");
	System.out.println("is juice name added " + juiceAdded);
	
	juiceAdded = JuiceShop.addJuiceName("chikku juice");
	System.out.println("is juice name added " + juiceAdded);
	
	juiceAdded = JuiceShop.addJuiceName("lemon juice");
	System.out.println("is juice name added " + juiceAdded);
	
	juiceAdded = JuiceShop.addJuiceName("avacado shake");
	System.out.println("is juice name added " + juiceAdded);
	
	JuiceShop.showJuiceName();	
	
	boolean juiceUpdated = JuiceShop.updateJuiceName("papaya juice","chikku juice");
	System.out.println("is Juice name updated "+ juiceUpdated);

	JuiceShop.showJuiceName();	
	
	boolean juiceDeleted = JuiceShop.deleteJuiceName("lemon juice");
	System.out.println("is Juice name deleted " +juiceDeleted );
	
	JuiceShop.showJuiceName();
	}

}