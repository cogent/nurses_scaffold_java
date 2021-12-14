package cogent.roster;

public class Main {
    public static void main (String [] args) {
        CLI cli = new CLI();

        try {
            RosterOptions options = cli.parseArgs(args);
            System.out.printf(
                    "Calculating roster for %s until %s with %d nurses\n\n",
                    options.getStartDate().toString(),
                    options.getEndDate().toString(),
                    options.getNurses().length);

            Roster roster = new Roster(options);
            RosterFormatter.printRoster(roster, System.out::println);
        } catch (Exception e) {
            System.out.print(e);
            System.exit(1);
        }
    }
}
