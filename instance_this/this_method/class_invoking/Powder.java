class Powder {

    String brand = "Ponds";
    String color = "White";
    double quantity = 50.0; 

    void info() {

        System.out.println("executing no arg const in powder");
        System.out.println("executing details of powder");
        System.out.println("powder brand: " + this.brand);
        System.out.println("powder color: " + this.color);
        System.out.println("quantity of powder: " + this.quantity + " grams");
    }
}