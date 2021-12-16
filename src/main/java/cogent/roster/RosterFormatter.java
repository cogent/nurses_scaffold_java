package cogent.roster;

import java.text.SimpleDateFormat;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class RosterFormatter {
    public static void printRoster(Roster roster, Consumer<String> outputRoster) {

        for (Shift shift : roster.getShifts()) {
            String nurses = String.join(", ", shift.getNurses());

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = simpleDateFormat.format(shift.getDate());

            outputRoster.accept(date + " | " + shift.getType() + " | " + nurses + "\n");
        }
    }
}
