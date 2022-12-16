public class Game {
    public int coinsEarnedP1;
    public int coinsEarnedP2;

    public Game(String romanicPointsP1, String romanicPointsP2) {
        if (!numbersCondition(romanicPointsP1, romanicPointsP2)) {
            coinsEarnedP2 = factorizer(romanicToInteger(romanicPointsP2));
            coinsEarnedP1 = factorizer(romanicToInteger(romanicPointsP1));

            System.out.println("El jugador 1 ha conseguido "+coinsEarnedP1+" monedas, y el jugador 2 "+coinsEarnedP2);
        } else {
            System.out.println("Los números introducidos són incorrectos");
        }
    }

    private static boolean numbersCondition(String romanicPointsP1, String romanicPointsP2) {
        return romanicPointsP1.contains("L") || romanicPointsP1.contains("C") || romanicPointsP1.contains("D") || romanicPointsP1.contains("M") || romanicPointsP2.contains("L") || romanicPointsP2.contains("C") || romanicPointsP2.contains("D") || romanicPointsP2.contains("M");
    }

    public static int factorizer(int numToFactorize) {
        int divisor = 2;
        int result = 0;

        while(numToFactorize != 1) {
            if(numToFactorize % divisor == 0){
                result += divisor;
                numToFactorize = numToFactorize / divisor;
            }else {
                divisor++;
            }
        }

        return result;
    }

    public static int romanicToInteger(String pointsToConvert) {
        int pointsConverted = 0;

        for (int i=0; i < pointsToConvert.length(); i++) {
            if (pointsToConvert.length() == 1) {
                if (pointsToConvert.charAt(i) == 'I') { 
                    pointsConverted = 1; 
                }else if (pointsToConvert.charAt(i) == 'V') { 
                    pointsConverted = 5; 
                } else {
                    pointsConverted = 10;
                }
            } else if (pointsToConvert.charAt(i) == 'I') {
                if (i != pointsToConvert.length() - 1) {
                    if(pointsToConvert.charAt(i + 1) != 'I') {
                        pointsConverted--;
                    } else {
                        pointsConverted++;
                    }
                } else {
                    pointsConverted++;
                }
            } else if (pointsToConvert.charAt(i) == 'V') {
                pointsConverted += 5;

            } else {
                pointsConverted += 10;
            }
        }
        return pointsConverted;
    }

}