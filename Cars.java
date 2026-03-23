class Cars{

	public static void main(String[] values){
		
		
		String[] cars={
			"Alto","Swift","Baleno","WagonR","Dzire","i10","i20","Creta","Venue","Verna","City",
            "Amaze","Civic","Jazz","Fortuner","Innova","Scorpio","XUV300","XUV700","Thar","Nexon",
            "Harrier","Safari","Punch","Kwid","Triber","Duster",
            "Magnite","Kiger","Slavia"
        };
		
		int size=cars.length;
		System.out.println("length of the guns :"+size);
		for(int position=0; position<size; position++){
			
			String ref=cars[position];
			cars[6]="Ferari";
			System.out.println("the pos @"+position+" is "+ref);
		}
		
		String name=cars[31];
		System.out.println("element at position:"+name);
		
		}
	}
