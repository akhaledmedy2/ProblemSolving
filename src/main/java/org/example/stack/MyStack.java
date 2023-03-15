package org.example.stack;

import sun.misc.Queue;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List<String> myList;

    public MyStack() {
        myList = new ArrayList<>();
    }

    public void push(int x) {
        myList.add(String.valueOf(x));
    }

    public int pop() {
        if (!myList.isEmpty()) {
            return Integer.parseInt(myList.remove(myList.size() - 1));
        }
        throw new RuntimeException("My Stack is empty");
    }

    public int top() {
        return Integer.parseInt(myList.get(myList.size() - 1));
    }

    public boolean empty() {
        return myList.isEmpty();
    }
}