class Cricket {

    String playerName;
    String team;
    int age;
    String role;
    int matches;
    int runs;
    int wickets;
    double average;
    String country;
    boolean isCaptain;

    Cricket(String playerName, String team, int age, String role,
            int matches, int runs, int wickets, double average,
            String country, boolean isCaptain) {

        this.playerName = playerName;
        this.team = team;
        this.age = age;
        this.role = role;
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
        this.average = average;
        this.country = country;
        this.isCaptain = isCaptain;
    }

   void display() {
    System.out.println("Player Name: " + playerName);
    System.out.println("Team: " + team);
    System.out.println("Age: " + age);
    System.out.println("Role: " + role);
    System.out.println("Matches: " + matches);
    System.out.println("Runs: " + runs);
    System.out.println("Wickets: " + wickets);
    System.out.println("Average: " + average);
    System.out.println("Country: " + country);
    System.out.println("Captain: " + isCaptain);

    }
}