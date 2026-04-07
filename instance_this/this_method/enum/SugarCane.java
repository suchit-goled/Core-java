class SugarCane {

    String variety;
    double height;

    SugarCane(String variety, double height){
        System.out.println("executing sugarcane constructor");
        this.variety = variety;
        this.height = height;
    }

    void sugarCaneDetails(){
        System.out.println("displaying sugarcane details");
        System.out.println("Variety: " + this.variety);
        System.out.println("Height: " + this.height);
    }
}