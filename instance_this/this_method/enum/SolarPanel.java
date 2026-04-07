class SolarPanel {

    String type;
    int capacity;

    SolarPanel(String type, int capacity){
        System.out.println("executing solar panel constructor");
        this.type = type;
        this.capacity = capacity;
    }

    void solarDetails(){
        System.out.println("displaying solar panel details");
        System.out.println("Type: " + this.type);
        System.out.println("Capacity (W): " + this.capacity);
    }
}