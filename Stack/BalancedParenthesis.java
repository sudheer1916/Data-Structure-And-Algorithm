import java.util.ArrayDeque;
import java.util.Deque;

/*
Given a Input string of parenthesis " {, }, (, ), [ and ] "
we need to check if this string is balanced or not.
balanced parenthesis :- 
1) the bracet which opened latest has to close first
2) the no of open brackets shuold be equal to closing brackets
eg :- " ({[ ]}) " , " { }([( )]) "  but not " ([ )] ";
we use stack here because of LIFO nature.
*/
public class BalancedParenthesis {      //efficient  O(n), aux space O(n)

    static boolean matching(char a,char b){
        return ( (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}') );
    }

    static boolean isBalanced(String str){
        Deque<Character> s = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
            s.push(str.charAt(i));
            else{
                //checks if there is any remaining closed bracket like "(( )))" i.e last bracket
                if(s.isEmpty() == true)    
                return false;
                //checks if the top element in the stack is open bracket and 
                //charAt(i) not equal to close bracket of it 
                else if(matching(s.peek(),str.charAt(i)) == false)
                return false;
                else    //above conditions not applied so,we remove the element from stack
                s.pop();
            }
        }
        return (s.isEmpty() == true);   //if stacks contains any open bracket like "(((( )))"i.e charAt(3);
    }
    public static void main(String[] args) {
        String str = "{()}[]"; 
    
        if (isBalanced(str)) 
            System.out.print("Balanced"); 
        else
            System.out.print("Not Balanced");
    }
}
