package com.example.user.week6_test.checkparenthesis;


import java.util.Stack;

public class CheckParenthesis {

    private Stack<Character> stack;

    public Boolean check(String testString) {

        if (testString.length() % 2 != 0) {
            return false;
        }

        stack = new Stack<>();

        for (int i = 0; i < testString.length(); i++) {
            if(!checkClose(testString.charAt(i)))
                return false;
            //stack.push(testString.charAt(i));
        }
        return stack.size() == 0;
    }

    private boolean checkClose(char c) {
        try {
            if (c == ')' || c == '}' || c == ']') {
                stack.pop();
            } else
                stack.push(c);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
