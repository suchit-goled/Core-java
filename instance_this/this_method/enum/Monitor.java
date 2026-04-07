class Monitor{
	
	String brand;
	double series;
	
	Monitor(String brand, double series){
		
		System.out.println("executing monitor in monitor");
		this.brand=brand;
		this.series=series;
		
	}
	
	void monitorDetails(){
		
		System.out.println("displaying details of the monitor");
		System.out.println("Monitor brand:"+this.brand);
		System.out.println("Monitor series:"+this.series);
		
		
	}
	
	
}