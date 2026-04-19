class CountryStore {

	Country[] countries=new Country[10];
	int index=0;
	
	void save(Country country){
		
		if (country !=null){
			
			if(this.index<this.countries.length){
				this.countries[this.index]=country;
				this.index++;
				
			}
			else{
				System.out.println("no more can be added");
			}
		}
		else{
			System.out.println("country cannot be null");
		}
	}
	
	Country findByName(String name){
		
		if(name!=null){
			for( int i=0;i< this.index;i++){
				if(this.countries[i]!=null && this.countries[i].name == name){
					return countries[i];
				}
				else{
					System.out.println(" name of the country given is not in the list");
				}
			}
		}
		else{
			System.out.println("name of the country cannot be null");
		}
		return null;
	}

	State findStateByName(String name){
		if(name!=null){
			for(int i=0; i<this.index;i++){
				State[] states=this.countries[i].states;
				
				if(states!=null){
					
					for(int j=0; j<states.length;j++){
						if(states[j]!=null &&states[j].name==name){
							return states[j];
						}
						else{
							System.out.println("no such state is present");
						}
					}
				}
				else{
					System.out.println("name of the states cannot be null");
				}
			}
		}
		else{
			System.out.println("invalid state called null");
		}
		return null;
	}
	
	
	
	
	City[] findAllCityByStateName(String name){
		
		State state = this.findStateByName(name);
		
		if(name!=null){
			return state.cities;
			
		}
		else{
			return null;
		}
	}
	
	int findNoOfDistrictsByCityName(String name){
		if(name!=null){
			for(int i=0;i<this.index;i++){
				State[] states=this.countries[i].states;
				
				if(states !=null){
					for (State start : states){
						if(start!=null && start.cities!=null){
							for(City city:start.cities){
								if(city!=null && city.name== name){
									return city.noOfDistricts;
								}
								else{
									System.out.println("no matching name");
								}
							}
						}
					}
				}
			}
		}
		System.out.println("No matching city found");
    return 0;
	}


	/* Country findByCollectorName(String collectorName){
		if(collectorName!=null){
			for(int i=0; i<this.index; i++){
				Country country = this.countries[i];
				
				if(country != null && country.states !=null){
					for(State state: country.states){
						
						if(state !=null && state.cities!=null){
							for(City city: state.cities){
								
								if(city !=null && city.districts!=null){
									for(District district:city.districts){
										
										if(district!=null && district.collector!=null && district.collector.name!= collectorName){
											return country;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}
	
*/
}
