package cogent.roster;

import java.util.Date;

public class RosterOptions {
    private Date startDate;
    private Date endDate;
    private String[] nurses;

    public RosterOptions(Date startDate, Date endDate, String[] nurses) {
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

    public String[] getNurses() {
        return nurses;
    }
}
