import java.util.Stack;

class EvaluationOfPrefix {
    static int evaluatePrefix(String exp){
        Stack<Integer> stk = new Stack<>();
        for (int i = exp.length()-1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if(Character.isDigit(ch))
            stk.push(ch -'0');
            else{
                int val1 = stk.pop();
                int val2 = stk.pop();

                switch (ch) {
                    case '+':
                        stk.push(val1+val2);
                        break;
                    case '-':
                        stk.push(val1-val2);
                        break;
                    case '*':
                        stk.push(val1*val2);
                        break;
                    case '/':
                        stk.push(val1/val2);
                        break;
                }
            }
        }
        return stk.peek();
    }
    public static void main(String[] args) {
        String exprsn = "+9*26";
        System.out.println(evaluatePrefix(exprsn));   
    }
}
