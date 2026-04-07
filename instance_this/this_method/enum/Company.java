class Company {

    CompanyName companyName; 
    String location;
    SolarPanel panel;

    Company(CompanyName companyName, String location, SolarPanel panel){
        this.companyName = companyName;
        this.location = location;
        this.panel = panel;
    }

    void display(){
        System.out.println("displaying company details");
        System.out.println("Company Name: " + this.companyName);
        System.out.println("Location: " + this.location);

        if(this.panel != null){
            System.out.println("Solar panel details are valid:");
            panel.solarDetails();
        } else {
            System.out.println("No solar panel details");
        }
    }
}