class FoodRunner{

	public static void main(String[] values){
		
		String name="biriyani";
		String[] item=FoodItem.getIngridients(name);
		
		
		if(item!=null){
			System.out.println("the item lenght is :"+item.length);
			
			for(String ref:item){
				
				System.out.println("the item required is:"+ref);
			}
			
		}
		name="poha";
		item=FoodItem.getIngridients(name);
		
		
		if(item!=null){
			System.out.println("the item lenght is :"+item.length);
			
			for(String ref:item){
				
				System.out.println("the item required is:"+ref);
			}
			
		}
		
	}
	
	}