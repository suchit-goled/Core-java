class LipStickBrand{


	public static void main(String[] values){
		
		String[] lipstickBrands={
			"Lakme","Maybelline","MAC", "Colorbar","Revlon","Faces","Sugar","Chamber","Elle18","Nykaa"
		};
		
		int size=lipstickBrands.length;
		System.out.println("length of the lipstickBrands :"+size);
		
		for(int position=0; position<size; position++){
			
			String ref=lipstickBrands[position];
			System.out.println("the pos @"+position+" is "+ref);
		}
	}
}