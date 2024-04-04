package org.leetcode.easy;


public class ValidParentheses {
    private static String stack = "";
    private static int size = 0;
    public static boolean isValidParentheses(String inputString){
        boolean isValidParentheses = true;
        if(inputString != null && inputString.length()>1 && inputString.length()%2 == 0){
            for (int i = 0; i < inputString.length(); i++) {
                if('{' == inputString.charAt(i) || '[' == inputString.charAt(i) || '(' == inputString.charAt(i)){
                    push(inputString.charAt(i));
                }
                else {
                    if ('}' == inputString.charAt(i)) {
                        char poppedChar = pop();
                        if(!('{' == poppedChar) || (' ' == poppedChar) ){
                            isValidParentheses = false;
                            break;
                        }
                    } else if (']' == inputString.charAt(i)) {
                        char poppedChar = pop();
                        if(!('[' == poppedChar) || (' ' == poppedChar)){
                            isValidParentheses = false;
                            break;
                        }
                    } else if (')' == inputString.charAt(i)) {
                        char poppedChar = pop();
                        if(!('(' == poppedChar) || (' ' == poppedChar)){
                            isValidParentheses = false;
                            break;
                        }
                    }
                }
            }
            if(size>0){
                isValidParentheses = false;
            }
            if(size == 0 && isValidParentheses){
                isValidParentheses = true;
            }
        }
        else {
            isValidParentheses = false;
        }
        stack = "";
        size = 0;
        return isValidParentheses;
    }

    private static void push(char openingBracket){
        stack = stack + openingBracket;
        size++;
    }

    private static char pop(){
        char topOfStack = ' ';
        if(stack.length()>0) {
            topOfStack = stack.charAt(stack.length() - 1);
            stack = stack.substring(0, stack.length() - 1);
            size--;
        }
        return topOfStack;
    }
}
