import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    void factorizerTest() {
        int arrayTest[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int arrayTestResult[] = {1,2,3,4,5,5,7,6,6,7,11,8,13};
        Game juego = new Game("","");
        for (int i=0; i<arrayTest.length; i++) {
            assertEquals(arrayTestResult[i],juego.factorizer(arrayTest[i]));
        }
    }

    @Test
    void romanicToNumTest() {
        String arrayTest[] = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII"};
        int arrayTestResult[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        Game juego = new Game("","");
        for (int i=0; i<arrayTest.length; i++) {
            assertEquals(arrayTestResult[i],juego.romanicToInteger(arrayTest[i]));
        }
    }

    @Test
    void gameTester() {
        String romanicPointsP1 = "VI";
        String romanicPointsP2 = "XIII";
        Game juego = new Game(romanicPointsP1,romanicPointsP2);
    }
}