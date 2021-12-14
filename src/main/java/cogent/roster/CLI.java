package cogent.roster;

import org.apache.commons.cli.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CLI {
    private Options options = new Options();
    private CommandLineParser parser = new DefaultParser();
    private HelpFormatter formatter = new HelpFormatter();


    public CLI() {
        options.addOption(Option.builder("s").longOpt("startDate").desc("the first date of the period to roster, in YYYY-MM-DD format").hasArg(true).build());
        options.addOption(Option.builder("e").longOpt("endDate").desc("the final date of the period to roster, in YYYY-MM-DD format").hasArg(true).build());
        options.addOption(Option.builder("f").longOpt("filename").desc("a nurses file to import").hasArg(true).build());
    }

    public RosterOptions parseArgs(String [] args) throws ParseException, java.text.ParseException, IOException {
        CommandLine cmd = parser.parse(options, args);
        if (cmd.getOptions().length != 3) {
            formatter.printHelp("Build a nurses roster", options);
            System.exit(1);
        }

        Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse(cmd.getOptionValue("s"));
        Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(cmd.getOptionValue("e"));
        String filename = cmd.getOptionValue("f");

        BufferedReader br = new BufferedReader(new FileReader(filename));
        List<String> nurses = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            nurses.add(line);
        }

        return new RosterOptions(startDate, endDate, nurses.toArray(String[]::new));
    }
}




