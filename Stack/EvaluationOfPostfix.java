import java.util.Stack;

class EvaluationOfPostfix {
    static int evaluatePostfix(String exp){     //O(n) 
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // If the scanned character is an operand (number here),
            // push it to the stack.
            if(Character.isDigit(ch))
            stk.push(ch - '0');

            //  If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else{
                int val1 = stk.pop();
                int val2 = stk.pop();

                switch (ch) {
                    case '+':
                        stk.push(val2+val1);
                        break;
                    case '-':
                        stk.push(val2-val1);
                        break;
                    case '*':
                        stk.push(val2*val1);
                        break;
                    case '/':
                        stk.push(val2/val1);
                        break;
                }
            }
        }
        return stk.pop();
    }
    public static void main(String[] args) {
        String exp="231*+9-";
        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
    }
}
