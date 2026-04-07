class ManufacturingCompany{
    
    String nameOfTheComapany;
    int yearOfestablish;
    Monitor monitor;
    
    ManufacturingCompany(String nameOfTheComapany, int yearOfestablish, Monitor monitor){
        this.nameOfTheComapany = nameOfTheComapany;
        this.yearOfestablish = yearOfestablish;
        this.monitor = monitor;
    }
    
    void display(){
        
        System.out.println("displaying company details for the monitor");
        System.out.println("nameOfTheComapany: " + this.nameOfTheComapany);
        System.out.println("yearOfestablish: " + this.yearOfestablish);

        if(this.monitor != null){
            System.out.println("details are valid:");
            monitor.monitorDetails();
        }
        else{
            System.out.println("details are invalid");
        }
    }
}