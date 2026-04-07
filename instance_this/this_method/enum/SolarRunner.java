class SolarRunner {

    public static void main(String[] args){

        SolarPanel sp = new SolarPanel("Monocrystalline", 500);

    
        Company comp = new Company(CompanyName.TATA_POWER, "Bangalore", sp);

        comp.display();
    }
}