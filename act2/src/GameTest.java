import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    void factorizerTest() {
        int factorizerTest = 6;
        int factorizerTestResult = 5;
        assertEquals(factorizerTestResult,Game.factorizer(factorizerTest));
    }

    @Test
    void romanicToNumTest() {
        String arrayTest = "II";
        int arrayTestResult =2;
        assertEquals(arrayTestResult, Game.romanicToInteger(arrayTest));
    }

    @Test
    void gameTester() {
        String romanicPointsP1 = "VI";
        String romanicPointsP2 = "XIII";
        Game juego = new Game(romanicPointsP1,romanicPointsP2);
        int i = juego.coinsEarnedP1;
        assertEquals(juego.coinsEarnedP1,5);
        assertEquals(juego.coinsEarnedP2,13);
    }
}