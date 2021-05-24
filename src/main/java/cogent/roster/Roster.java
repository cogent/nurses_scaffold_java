package cogent.roster;

import org.apache.commons.cli.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Roster {
    public static void main (String [] args) {
        CLI cli = new CLI();

        try {
            RosterOptions options = cli.parseArgs(args);

            System.out.printf(
                    "Calculating roster for %s until %s with %d nurses\n\n",
                    options.getStartDate().toString(),
                    options.getEndDate().toString(),
                    options.getNurses().size());

        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
