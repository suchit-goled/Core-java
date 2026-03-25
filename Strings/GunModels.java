class GunModels{

	public static void main(String[] values){
		
		String[] guns={
			
			"AK-47","M16","SCAR","AUG","M14","SVD","XM8","X95","MP5","MP40","UZI","P90",
			"VECTOR","M10","MAG","M4A1","GROZA","FAMAS","PLASMA","PARAFAL","AWM","KAR98K",
			"M24","M1014","UMP","VSS","THOMPSON","AC80","WOODPECKER","SKS",
		};
		
		int size=guns.length;
		System.out.println("length of the guns :"+size);
		
		for(int position=0; position<size; position++){
			
			String ref=guns[position];
			System.out.println("the pos @"+position+" is "+ref);
		}
		
		System.out.println("");
		
		for(int position=size-1; position>=0; position--){
			
			String ref=guns[position];
			System.out.println("the pos @"+position+" is "+ref);
			
		}
		
		
	}
}