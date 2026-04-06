class Net {

    String material = "Nylon";
    String color = "Black";
    int holes = 4;

    void info() {

        System.out.println("executing no arg const in net");
        System.out.println("executing details of net");
        System.out.println("net material: " + this.material);
        System.out.println("net color: " + this.color);
        System.out.println("number of holes: " + this.holes);
    }
}