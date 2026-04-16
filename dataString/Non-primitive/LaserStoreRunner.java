class LaserStoreRunner {

    public static void main(String[] args) {

      

     
        LaserStore laserStore = new LaserStore();

        laserStore.save(new Laser("Philips", "Medical", 5.5, "Red", 650, true, 5000, "Surgery", 10, "Metal"));
        laserStore.save(new Laser("Sony", "Pointer", 2.0, "Green", 532, true, 1500, "Presentation", 8, "Plastic"));

        System.out.println("---- Laser Details ----");
        laserStore.displayAll();


      
    }
}