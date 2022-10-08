package net.absoft.Denys.Donets;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ageCheckerTest {

    @Test
    public void testAgedUserCanPlay() {
        ageChecker ageChecker = new ageChecker();
        Assert.assertTrue(ageChecker.canPlayGame(19), "Aged user can't play game");
    }
}
