
class CountryDetails{
	
	
		public static void main(String[] args){
		
		
		Address address= new Address(11,56560);
		
		President president= new President("Droupadi Murmu",68,address);
		
		
		
		Collector collector=new Collector("kishan", 524);
		
	
		District district=new District("bangalore north", collector);
		District[] districts={district};
		
		City city= new City("bangalore",5,districts);
		City[] cities={city};
		
		State state= new State("Karnataka",4265538,cities);
		State[] states={state};
		
		Country country= new Country("India",president,states);
		
		
		CountryStore store=new CountryStore();
		store.save(country);
		
		Country foundCountry = store.findByName("India");
        if (foundCountry != null) {
            System.out.println("name of the country:"+foundCountry.name);
        }
		
		
        State foundState = store.findStateByName("Karnataka");
        if (foundState != null) {
            System.out.println("State Found: " + foundState.name);
        }
		
		City[] foundCities = store.findAllCityByStateName("Karnataka");

			if (foundCities != null) {
				for (City start : foundCities) {
					System.out.println("City: " + start.name);
				}
			}

			
			int count = store.findNoOfDistrictsByCityName("bangalore");
			System.out.println("No of Districts: " + count);


				
			/*
			Country collectorCountry = store.findByCollectorName("kishan");
			if (collectorCountry != null) {
				System.out.println("Collector belongs to Country: " + collectorCountry.name);

	
			}*/
		}
}
