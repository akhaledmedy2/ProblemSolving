package org.example;

public class PageCount {
    public static void main(String[] args) {

        int result = pageCount(30, 25);
        System.out.println(result);
    }

    public static int pageCount(int n, int p) {
        int maxTurnCountFromFront = n / 2;
        int targetPageFromFront = p / 2;
        int targetPageTurnCountFromBack = maxTurnCountFromFront - targetPageFromFront;

        return Math.min(targetPageFromFront, targetPageTurnCountFromBack);
    }
}