class IPL {

    String name = "IPL";
    int teams = 10;
    String sponsor = "TATA";
    boolean international = true;
    int matches = 74;
    String format = "T20";
    double revenue = 1000.0;
    boolean playoffs = true;
    int duration = 2;
    String country = "India";

    public IPL(String name, int teams, String sponsor, boolean international, int matches,
               String format, double revenue, boolean playoffs, int duration, String country) {

        System.out.println("Before change:");
        System.out.println("name: " + this.name);
        System.out.println("teams: " + this.teams);
        System.out.println("sponsor: " + this.sponsor);
        System.out.println("international: " + this.international);
        System.out.println("matches: " + this.matches);
        System.out.println("format: " + this.format);
        System.out.println("revenue: " + this.revenue);
        System.out.println("playoffs: " + this.playoffs);
        System.out.println("duration: " + this.duration);
        System.out.println("country: " + this.country);

        this.name = name;
        this.teams = teams;
        this.sponsor = sponsor;
        this.international = international;
        this.matches = matches;
        this.format = format;
        this.revenue = revenue;
        this.playoffs = playoffs;
        this.duration = duration;
        this.country = country;

        System.out.println("\nAfter change:");
        System.out.println("name: " + this.name);
        System.out.println("teams: " + this.teams);
        System.out.println("sponsor: " + this.sponsor);
        System.out.println("international: " + this.international);
        System.out.println("matches: " + this.matches);
        System.out.println("format: " + this.format);
        System.out.println("revenue: " + this.revenue);
        System.out.println("playoffs: " + this.playoffs);
        System.out.println("duration: " + this.duration);
        System.out.println("country: " + this.country);
    }
}