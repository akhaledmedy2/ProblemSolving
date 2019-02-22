/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sun.misc.BASE64Encoder;

/**
 *
 * @author user
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static int solution(int[] A) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                {
                    if (A[i] == A[j]) {
                        result++;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {3, 5, 6, 3, 3, 5};
        System.out.println(solution(A));
    }
}
