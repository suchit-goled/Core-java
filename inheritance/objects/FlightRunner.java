class FlightRunner{

	public static void main(String[] values){
		
		Flight flight1=new Flight();
		System.out.println("flight name:"+flight1.name);
		flight1.name="Indigo";
		System.out.println("updated name:"+flight1.name);
		System.out.println("");
		
		Flight flight2=new Flight();
		System.out.println("source:"+flight2.source);
		flight2.source="Bangalore";
		System.out.println("updated source:"+flight2.source);
		System.out.println("");
		
		Flight flight3=new Flight();
		System.out.println("destination:"+flight3.destination);
		flight3.destination="Delhi";
		System.out.println("updated destination:"+flight3.destination);
		System.out.println("");
		
		Flight flight4=new Flight();
		System.out.println("ticket price:"+flight4.ticketPrice);
		flight4.ticketPrice=5000;
		System.out.println("updated price:"+flight4.ticketPrice);
		System.out.println("");
		
		Flight flight5=new Flight();
		System.out.println("duration:"+flight5.duration);
		flight5.duration=3;
		System.out.println("updated duration:"+flight5.duration);
	}
}