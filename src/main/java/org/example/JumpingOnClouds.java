package org.example;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnClouds {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);

        int result = jumpingOnClouds(c);
        System.out.println(result);
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int jumpCounts = 0;

        for (int i = 0; i < c.size() - 3; ) {
            i += (c.get(i + 2) == 0) ? 2 : 1;
            jumpCounts++;
        }
        jumpCounts++;


        return jumpCounts;
    }
}