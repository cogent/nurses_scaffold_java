package cogent.roster;

public class Nurse {
    private String name;
    private String uuid;

    Nurse(String name, String uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    public String getName() {
        return this.name;
    }

    public String getUuid() {
        return this.uuid;
    }
}
