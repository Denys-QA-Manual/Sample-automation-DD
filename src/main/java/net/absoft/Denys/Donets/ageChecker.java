package net.absoft.Denys.Donets;

public class ageChecker {
    private final int MIN_AGE = 18;

    public boolean canPlayGame(int age) {
        return age >= MIN_AGE;
    }
}
