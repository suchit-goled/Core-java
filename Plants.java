class Plants {
    public static void main(String[] args) {

        String[] plants = {
            "Rose","Tulip","Sunflower","Lily","Jasmine","Marigold","Hibiscus","Orchid","Daisy",
            "Lavender","Mint","Basil","Aloe Vera","Neem","Cactus","Fern","Bamboo","Money Plant","Snake Plant",
            "Peepal","Mango Plant","Banana Plant","Tea Plant","Coffee Plant"
        };

       
        int size=plants.length;
		System.out.println("length of the plants :"+size);
		
		for(int position=0; position<size; position++){
			
			String ref=plants[position];
			System.out.println("the element @"+position+" is "+ref);
		}
		
        }
    }
