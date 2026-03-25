class PersonDetailsRunner {

    public static void main(String[] args) {

        String[] emails = {"suchit@gmail.com", "suchit@yahoo.com"};
        String[] phone = {"7676716597", "9123456780"};
        String[] addresses = {"Bangalore PG", "Gulbarga Home"};

        String[] result = PersonDetails.getDetailsByName("suchit", emails, phone, addresses);

        if (result != null) {
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }
		
		else {
            System.out.println("Returned null");
        }
    }
}