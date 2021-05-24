package cogent.roster;

import java.util.Date;
import java.util.List;

public class RosterOptions {
    private Date startDate;
    private Date endDate;
    private List<Nurse> nurses;

    public RosterOptions(Date startDate, Date endDate, List<Nurse> nurses) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.nurses = nurses;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }
}
