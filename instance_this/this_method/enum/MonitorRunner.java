class MonitorRunner{
    
    public static void main(String[] args){
        

        Monitor details1 = new Monitor("HP", 173.272);
        
		
		String name="HP Pvt Ltd";
		int year=1995;
        ManufacturingCompany company1 = new ManufacturingCompany(name, year , details1);
        
        company1.display();
    }
}