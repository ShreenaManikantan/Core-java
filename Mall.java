class Mall{

   public static void main(String shopping[]){

  
  
  String groceries[] = {"Urad dal"," Wheat"," Rice"," Ragi","Coffe"," Tea","salt","Black papper"," Honey","oregano","Cchilliflakes","Oils"," Cheese","Red papper"," Greentea"};
  String vegitables[] = {"Carrot","Beans","Brinjal","Cucumber","Potato"," Spring onion","Tomato","Pumpkin","Beetroot","Broccoli","Lettuce","Cauliflower","Radish","Cabbage","Spinach"};
  String fruits[] = {"Apple","Banana","Cherry","Blueberry","Avacado","Grape","Mango","Orange","Fig","Kiwi","Guava","Straberry","Watermelon","Papaya","Pine apple"};
  String snacks[] = {"goli baje","vada pav"," samosa"," banana chips","kachori","pani puri","pav bhaji","sev puri","pakoda","bajji"," Chikki","dabeli","potato fry","Mathri"," bhel puri"};
  String iceCeams[] = {"Vanilla","mango","butters cotch","Cookies Cream","Mint Chocolate Chip","Buttered Pecan","Moose Tracks","chikku","guava","pista","black curret","blue berry","ice cream cake","kulfi","pineapple"};
  String perfumes[] = {"Wild Stone","Park Avenue Euphoria","Bella Vita ","Bella Vita ","Moody","Engage","plum","beardo origin","Villain","aqua Red ","charlene","Iba","fogg","Set Wet","Skinn BY Titan "};
  String chocolates[] = {"munch","dairy milk","fivr star","kitkat","harshesy","snickers","milky way","almand joy","toblerone","coffe bite","bounty","ferroer rocher","galexy","amul dari chocolate","park"};
  String cooldrinks[] = {"cola","sprite"," fanta","pepsi","mazza","slice","7up","mirinda","starry","coke","jeera","fuse","frizz","mountain due","fruti"}; 
  String sweets[] = {"peda","rasgulla","gulab jamun","rasmali","coconet burfi","mysoor pak","kheer","","","kheer kadam","halwa","rasmali","champkali","jalebi","laddu"};
  String cosmetics[] = {"skin toner","Nail paint","lip stick","face wash","Moisturizer ","Foundation","Highlighter","Concealer","Blush","Rosewater"," colour Corrector","Eyeshadow","Mascara","Eyeliner","Setting sprays"};
  String spices[] = {"Termeric","cinnomon"," bay leaf"," Tamiarind","Cardamon","Nutmeg","Clove","Musterd seed","black papper"," anise","Thyme","Cumin seed","fennelcarmon","carom seed","Licorice"};

  System.out.println("Main started");
  
	for(String grocery: groceries){
	   System.out.println(grocery);
	}
	
	
	for(String vegitable: vegitables){
	   System.out.println(vegitable);
	}
	
	
	for(String fruit: fruits){
	   System.out.println(fruit);
	}
	   
	for(String snack: snacks ){
	   System.out.println(snack);
	}
	
	for(String iceCeam: iceCeams){
	   System.out.println(iceCeam);
	}
	
	
	for(String perfume: perfumes){
	   System.out.println(perfume);
	}
	
	
	for(String chocolate: chocolates){
	   System.out.println(chocolate);
	}
	
	
	for(String cooldrink: cooldrinks){
	   System.out.println(cooldrink);
	}

	
	for(String sweet: sweets){
	   System.out.println(sweet);
	} 

	
	for(String cosmetic: cosmetics){
	   System.out.println(cosmetic);
	}
	
	
    for(String spice: spices ){
	   System.out.println(spice);	   
	}
	
	/*System.out.println("List of groceries are:" + groceries[0] +"\n"+ groceries[1] +"\n"+ groceries[2] +"\n"+ groceries[3] +"\n"+ groceries[4] +"\n"+ groceries[5] +"\n"+ groceries[6] +"\n"+ groceries[7] +"\n"+ groceries[8] +"\n"+ groceries[9] +"\n"+ groceries[10] +"\n"+ groceries[11] +"\n"+ groceries[12] +"\n"+ groceries[13] +"\n"+ groceries[14]);
    System.out.println("List of vegitables are:" + vegitables[0] +"\n"+ vegitables[1] +"\n"+ vegitables[2] +"\n"+ vegitables[3] +"\n"+ vegitables[4] +"\n"+ vegitables[5] +"\n"+ vegitables[6] +"\n"+ vegitables[7] +"\n"+ vegitables[8] +"\n"+ vegitables[9] +"\n"+ vegitables[10] +"\n"+ vegitables[11] +"\n"+ vegitables[12] +"\n"+ vegitables[13] +"\n"+ vegitables[14]);
	System.out.println("List of fruits are:" + fruits[0] +"\n"+ fruits[1] +"\n"+ fruits[2] +"\n"+ fruits[3] +"\n"+ fruits[4] +"\n"+ fruits[5] +"\n"+ fruits[6] +"\n"+ fruits[7] +"\n"+ fruits[8] +"\n"+ fruits[9] +"\n"+ fruits[10] +"\n"+ fruits[11] +"\n"+ fruits[12] +"\n"+ fruits[13] +"\n"+ fruits[14]);
	System.out.println("List of snacks are:" + snacks[0] +"\n"+ snacks[1] +"\n"+ snacks[2] +"\n"+ snacks[3] +"\n"+ snacks[4] +"\n"+ snacks[5] +"\n"+ snacks[6] +"\n"+ snacks[7] +"\n"+ snacks[8] +"\n"+ snacks[9] +"\n"+ snacks[10] +"\n"+ snacks[11] +"\n"+ snacks[12] +"\n"+ snacks[13] +"\n"+ snacks[14]);
	System.out.println("List of iceCeams are:" + iceCeams[0] +"\n"+ iceCeams[1] +"\n"+ iceCeams[2] +"\n"+ iceCeams[3] +"\n"+ iceCeams[4] +"\n"+ iceCeams[5] +"\n"+ iceCeams[6] +"\n"+ iceCeams[7] +"\n"+ iceCeams[8] +"\n"+ iceCeams[9] +"\n"+ iceCeams[10] +"\n"+ iceCeams[11] +"\n"+ iceCeams[12] +"\n"+ iceCeams[13] +"\n"+ iceCeams[14]);
	System.out.println("List of perfumes are:" + perfumes[0] +"\n"+ perfumes[1] +"\n"+ perfumes[2] +"\n"+ perfumes[3] +"\n"+ perfumes[4] +"\n"+ perfumes[5] +"\n"+ perfumes[6] +"\n"+ perfumes[7] +"\n"+ perfumes[8] +"\n"+ perfumes[9] +"\n"+ perfumes[10] +"\n"+ perfumes[11] +"\n"+ perfumes[12] +"\n"+ perfumes[13] +"\n"+ perfumes[14]);
	System.out.println("List of chocolates are:" + chocolates[0] +"\n"+ chocolates[1] +"\n"+ chocolates[2] +"\n"+ chocolates[3] +"\n"+ chocolates[4] +"\n"+ chocolates[5] +"\n"+ chocolates[6] +"\n"+ chocolates[7] +"\n"+ chocolates[8] +"\n"+ chocolates[9] +"\n"+ chocolates[10] +"\n"+ chocolates[11] +"\n"+ chocolates[12] +"\n"+ chocolates[13] +"\n"+ chocolates[14]);
	System.out.println("List of cooldrinks are:" + cooldrinks[0] +"\n"+ cooldrinks[1] +"\n"+ cooldrinks[2] +"\n"+ cooldrinks[3] +"\n"+ cooldrinks[4] +"\n"+ cooldrinks[5] +"\n"+ cooldrinks[6] +"\n"+ cooldrinks[7] +"\n"+ cooldrinks[8] +"\n"+ cooldrinks[9] +"\n"+ cooldrinks[10] +"\n"+ cooldrinks[11] +"\n"+ cooldrinks[12] +"\n"+ cooldrinks[13] +"\n"+ cooldrinks[14]);
	System.out.println("List of sweets are:" + sweets[0] +"\n"+ sweets[1] +"\n"+ sweets[2] +"\n"+ sweets[3] +"\n"+ sweets[4] +"\n"+ sweets[5] +"\n"+ sweets[6] +"\n"+ sweets[7] +"\n"+ sweets[8] +"\n"+ sweets[9] +"\n"+ sweets[10] +"\n"+ sweets[11] +"\n"+ sweets[12] +"\n"+ sweets[13] +"\n"+ sweets[14]);
	System.out.println("List of cosmetics are:" + cosmetics[0] +"\n"+ cosmetics[1] +"\n"+ cosmetics[2] +"\n"+ cosmetics[3] +"\n"+ cosmetics[4] +"\n"+ cosmetics[5] +"\n"+ cosmetics[6] +"\n"+ cosmetics[7] +"\n"+ cosmetics[8] +"\n"+ cosmetics[9] +"\n"+ cosmetics[10] +"\n"+ cosmetics[11] +"\n"+ cosmetics[12] +"\n"+ cosmetics[13] +"\n"+ cosmetics[14]);
	System.out.println("List of spices are:" + spices[0] +"\n"+ spices[1] +"\n"+ spices[2] +"\n"+ spices[3] +"\n"+ spices[4] +"\n"+ spices[5] +"\n"+ spices[6] +"\n"+ spices[7] +"\n"+ spices[8] +"\n"+ spices[9] +"\n"+ spices[10] +"\n"+ spices[11] +"\n"+ spices[12] +"\n"+ spices[13] +"\n"+ spices[14]);*/

   System.out.println("Main endeed");
   
   }


}

