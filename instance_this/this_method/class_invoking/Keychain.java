class Keychain {

    String material = "Metal";
    String color = "Silver";
    int keys = 3;

    void info() {

        System.out.println("executing no arg const in keychain");
        System.out.println("executing details of keychain");
        System.out.println("keychain material: " + this.material);
        System.out.println("keychain color: " + this.color);
        System.out.println("number of keys: " + this.keys);
    }
}