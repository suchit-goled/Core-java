package outer.com;

public class ShoeRunner {

    public static void main(String[] args) {

        Puma puma = new Puma();

        puma.brand();
        System.out.println("Price: " + puma.price());
    }
}