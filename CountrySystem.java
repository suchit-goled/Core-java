class CountrySystem{
	public static void main(String[] args){
		Country.run();
		State.run();
		District.run();
		District.taxing();
		District.measure();
		District.collect();
		District.budget();
		District.revenue();
	}
}