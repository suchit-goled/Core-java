class MovieTicketRunner {
    public static void main(String[] args) {

        double price = MovieTicket.getPrice("KGF", "Gold", "PVR");
        System.out.println("Ticket price: " + price);

        price = MovieTicket.getPrice("RRR", "Silver", "INOX");
        System.out.println("Ticket price: " + price);

        price = MovieTicket.getPrice("Leo", "Platinum", "PVR");
        System.out.println("Ticket price: " + price);

        price = MovieTicket.getPrice("Jawan", "Gold", "INOX");
        System.out.println("Ticket price: " + price);

        price = MovieTicket.getPrice("Salaar", "Silver", "PVR");
        System.out.println("Ticket price: " + price);

        price = MovieTicket.getPrice("Invalid", "Gold", "PVR");
        System.out.println("Ticket price: " + price);
    }
}