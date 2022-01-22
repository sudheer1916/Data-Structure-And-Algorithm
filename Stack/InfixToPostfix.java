import java.util.*;

class InfixToPost{
    // A utility function to return precedence of a given operator
    // Higher returned value means higher precedence
    static int pres(char ch){
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;    
        }
        return -1;
    }
    static String infixToPost(String exp){
        Stack<Character> stk = new Stack<>();
        String result = new String();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            //If the scanned character is an operand, add it to output.
            if(Character.isLetterOrDigit(ch))
            result += ch;

            // If the scanned character is an '(', push it to the stack.
            else if(ch == '(')      //open/left parenthesis
            stk.push(ch);

            // If the scanned character is an ')', pop and output from 
            // the stack until an '(' is encountered.
            else if(ch == ')'){
                while (!stk.isEmpty() && stk.peek() != '(') {
                    result += stk.pop();
                }
                stk.pop();      //removes ')' from stack
            }

            else{       // an operator is encountered
                while (!stk.isEmpty() && pres(ch) <= pres(stk.peek())) {
                    result += stk.pop();
                }
                stk.push(ch);
            }
        }
        // pop all the operators from the stack
        while (!stk.isEmpty()) {
            if(stk.peek() == '(')
            return " invalid expression";
            result += stk.pop();
        }
        return result;
    } 
    public static void main(String[] args) {
        
        String exp = "a+b*(c^d-e)^(f+g*h)-i" ;
        System.out.println(infixToPost(exp));
    }
}