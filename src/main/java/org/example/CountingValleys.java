package org.example;

public class CountingValleys {
    public static void main(String[] args) {
        int result = countingValleys(12, "DDUUDDUDUUUD");
        System.out.println(result);
    }

    public static int countingValleys(int steps, String path) {
        int seaLevel = 0;
        int result = 0;
        boolean belowSeeLevel = false;
        boolean aboveSeaLevel = false;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                seaLevel--;
            } else {
                seaLevel++;
            }
            if (seaLevel > 0) {
                aboveSeaLevel = true;
                if (belowSeeLevel) {
                    belowSeeLevel = false;
                    result++;
                }
            }

            if (seaLevel < 0) {
                belowSeeLevel = true;
                if (aboveSeaLevel) {
                    aboveSeaLevel = false;
                }
            }

            if (seaLevel == 0 && belowSeeLevel) {
                belowSeeLevel = false;
                result++;
            }
        }

        return result;
    }
}