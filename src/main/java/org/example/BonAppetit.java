package org.example;

import java.util.ArrayList;
import java.util.List;

public class BonAppetit {
    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        int k = 1; // index which anna didn't eat
        int b = 7; // amount of money that anna will pay
        bonAppetit(bill, k, b);

    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int amount = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                amount += bill.get(i);
            }
        }
        amount = b - (amount / 2); // brian's refund amount to anna

        if (amount == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(amount);
        }

    }
}