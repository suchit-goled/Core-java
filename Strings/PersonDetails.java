class PersonDetails {

    static String[] getDetailsByName(String name, String[] emails, String[] phone, String[] addresses) {

        System.out.println("Searching details for: " + name);

        if (name == null) {
            System.out.println("Invalid name");
            return null;
        }

        if (name == "suchit") {

            String[] details = {
                "Email1: " + emails[0],
                "Email2: " + emails[1],
                "Phone1: " + phone[0],
                "Phone2: " + phone[1],
                "Address1: " + addresses[0],
                "Address2: " + addresses[1]
            };

            return details;
        }
		
		if (name == "sumit") {

            String[] details = {
                "Email1: " + emails[0],
                "Email2: " + emails[1],
                "Phone1: " + phone[0],
                "Phone2: " + phone[1],
                "Address1: " + addresses[0],
                "Address2: " + addresses[1]
            };

            return details;
        }

        System.out.println("No data found");
        return null;
    }
}
