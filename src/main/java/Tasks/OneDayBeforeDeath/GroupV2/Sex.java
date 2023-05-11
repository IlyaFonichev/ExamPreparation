package Tasks.OneDayBeforeDeath.GroupV2;

public enum Sex {
    male("парень"),
    female("девушка");

    private final String type;
    Sex(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
