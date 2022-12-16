import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.ARG_IN;

public class Main {
    public static void main(String[] args) {
        String romanicPointsP1 = "IX";
        String romanicPointsP2 = "XIII";
        
        int mode = 1;

        System.out.println("Para probar el test predefinido usar el \"mode\" = 1");
        System.out.println("Para usar el programa para una partida en vivo usar el \"mode\" = 2");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escoge el modo: ");

        if (scanner.hasNextInt()){
            mode = scanner.nextInt();
        } else {
            System.out.println("Argumentos incorrectos.");
        }

        if(mode < 1 || mode > 2) {
            System.out.println("Modo incorrecto");
        } else if (mode == 1) {
            if (numbersCondition(romanicPointsP1,romanicPointsP2)) {
                int coinsEarnedP1 = factorizer(romanicToInteger(romanicPointsP1));
                int coinsEarnedP2 = factorizer(romanicToInteger(romanicPointsP2));

                System.out.println("El jugador 1 ha conseguido "+coinsEarnedP1+" monedas, y el jugador 2 "+coinsEarnedP2);
            } else {
                System.out.println("Los números románicos introduciods son demasiado grandes.");
            }
        } else {
            
        }
        
    }

    private static boolean numbersCondition(String romanicPointsP1, String romanicPointsP2) {
        return romanicPointsP1.contains("L") || romanicPointsP1.contains("C") || romanicPointsP1.contains("D") || romanicPointsP1.contains("M") || romanicPointsP1.contains("L") || romanicPointsP1.contains("C") || romanicPointsP1.contains("D") || romanicPointsP1.contains("M");
    }

    private static int factorizer(int numToFactorize) {
        int divisor = 2;
        int result = 0;
        ArrayList factorizedNumber = new ArrayList<>();
        while(numToFactorize != 1) {
            if(numToFactorize % divisor == 0){
                factorizedNumber.add(divisor);
                System.out.print(divisor + " ");
                numToFactorize = numToFactorize / divisor;
            }else {
                divisor++;
            }
        }
        for (int i = 0; i < factorizedNumber.size(); i++) {
            result += (Integer) factorizedNumber.get(i);
        }

        return result;
    }

    private static int romanicToInteger(String pointsToConvert) {
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