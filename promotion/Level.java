package promotion;

public class Level{
    private static final String[] levels = {"Junior", "Mid", "Senior", "Lead"};
    private static final double[] increments = {5000, 10000, 15000, 0};

    public static int getLevelIndex(String level) {
        for (int i = 0; i < levels.length; i++) {
            if (levels[i].equalsIgnoreCase(level)) {
                return i;
            }
        }
        return -1;
    }

    public static String getNextLevel(String currentLevel) {
        int index = getLevelIndex(currentLevel);
        if (index >= 0 && index < levels.length - 1) {
            return levels[index + 1];
        }
        return null; // Already at highest level
    }

    public static double getIncrement(String nextLevel) {
        int index = getLevelIndex(nextLevel);
        if (index >= 0) {
            return increments[index];
        }
        return 0;
    }
}
