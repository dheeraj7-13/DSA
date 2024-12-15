/*	Program: Parenthesis Balancing - Stack Application
*/

public class ParBal {


    public static boolean isBalanced(String expr) {
        // Create a stack 
        char[] stack = new char[expr.length()];
        int tos = -1; // top of stack index


        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

 
            if (ch == '(') {
                tos++;
                stack[tos] = ch;
            }
         
            else if (ch == ')') {
              
                if (tos == -1) {
                    return false;
                }
                tos--; 
            }
        }


        return tos == -1;
    }


    public static void main(String[] args) {
        String expr = "(a+b)+(c+d)";

        if (isBalanced(expr)) {
            System.out.println("Parentheses are balanced");
        } else {
            System.out.println("Parentheses are not balanced");
        }
    }
}
