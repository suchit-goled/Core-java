class TissueStore {

    Tissue[] store = new Tissue[20];
    int index = 0;

    void save(Tissue t) {
        if (index < store.length) {
            store[index] = t;
            index++;
            System.out.println("Tissue saved");
        } else {
            System.out.println("Store full");
        }
    }

    void displayAll() {
        for (int i = 0; i < index; i++) {
            store[i].display();
        }
    }
}