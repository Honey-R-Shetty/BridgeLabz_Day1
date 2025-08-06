package promotion;

public enum Level {
    JUNIOR, MID, SENIOR, LEAD;

    public Level getNextLevel() {
        switch (this) {
            case JUNIOR: return MID;
            case MID: return SENIOR;
            case SENIOR: return LEAD;
            default: return null; // LEAD has no next level
        }
    }

    public double getIncrement() {
        switch (this) {
            case JUNIOR: return 5000;
            case MID: return 10000;
            case SENIOR: return 15000;
            case LEAD: return 0;
            default: return 0;
        }
    }
}
