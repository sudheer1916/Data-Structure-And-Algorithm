import java.util.Stack;

//stack based efficient solution for Infix to Prefx conversion.

class InfixToPrefix {

    static int getPriority(char C)
    {

        if (C == '-' || C == '+')
        return 1;
        else if (C == '*' || C == '/')
        return 2;
        else if (C == '^')
        return 3;
        else
        return -1;
    }

    static String reverse(String prefix){
        char[] str = prefix.toCharArray();
        int start=0,end=prefix.length()-1;
        while (start<end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(str);
    }

    static String infixToPrefix(String infix){
        Stack<Character> stk = new Stack<>();
        String prefix = new String();
        int l = infix.length();

        for(int i=l-1;i>=0;i--){
            char ch = infix.charAt(i);

            //If the scanned character is an operand, add it to prefix.
            if(Character.isLetterOrDigit(ch))
            prefix += ch;
            else if(ch == ')')      //right/closed parenthesis
            stk.push(ch);
            else if(ch == '('){     //left/open parenthesis
                while (!stk.isEmpty() && stk.peek()!=')') {
                    prefix += stk.pop();
                }
                stk.pop();      //removes '(' from the stack
            }
            else{
                while (!stk.isEmpty() && getPriority(ch) <= getPriority(stk.peek())) {
                    prefix += stk.pop();
                }
                stk.push(ch);
            }
        }
        // pop all the operators from the stack
        while (!stk.isEmpty()) {
            if(stk.peek() == ')')
            return " invalid expression";
            prefix += stk.pop();
        }
        String result = reverse(prefix);
        return result;
    }
    public static void main(String[] args) {
        String s = ("x+y*z/w+u");
        System.out.print(infixToPrefix(s));
    }    
}
