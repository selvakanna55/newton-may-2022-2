package Assignment;


import java.util.Scanner;
import java.util.Stack;

// don't change the name of this class
// you can add inner classes if needed
class EvaluateExpressionUsingStack {
    static int evaluatePostfix(String exp) {
        String arr[] = exp.split(" ");
        Stack<Integer> stack = new Stack<>();
        for (String curr : arr) {
            if (curr.charAt(0) >= '0' && curr.charAt(0) <= '9') {
                int num = Integer.parseInt(curr);
                stack.push(num);
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (curr) {
                    case "+":
                        stack.push(val2 + val1);
                        break;
                    case "-":
                        stack.push(val2 - val1);
                        break;

                    case "/":
                        stack.push(val2 / val1);
                        break;

                    case "*":
                        stack.push(val2 * val1);
                        break;
                }
            }

        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.print(evaluatePostfix(s));
    }
}
