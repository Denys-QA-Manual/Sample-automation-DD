package net.absoft.Denys.Donets;

public class ageChecker {
    private static final int MIN_AGE = 18;

    public static boolean canPlayGame(int age) {
        return age >= MIN_AGE;
    }
}
