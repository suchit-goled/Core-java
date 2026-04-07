class Farmer {

    String farmerName;
    int landArea;
    SugarCane sugarcane;

    Farmer(String farmerName, int landArea, SugarCane sugarcane){
        this.farmerName = farmerName;
        this.landArea = landArea;
        this.sugarcane = sugarcane;
    }

    void display(){
        System.out.println("displaying farmer details");
        System.out.println("Farmer Name: " + this.farmerName);
        System.out.println("Land Area: " + this.landArea);

        if(this.sugarcane != null){
            System.out.println("Sugarcane details are valid:");
            sugarcane.sugarCaneDetails();
        } else {
            System.out.println("No sugarcane details");
        }
    }
}