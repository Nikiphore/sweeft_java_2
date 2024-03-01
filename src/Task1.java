public class Task1 {

    public void runner(){
        String expression = "5+20-8+5";
        System.out.print(expression + "=" + evaluateExpression(expression));
    }
    public int evaluateExpression(String expression){
        int answer = 0;
        int currNum = 0;
        char oper = '+';

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (!(ch=='+' || ch=='-')) {
                currNum = currNum * 10 + ((int)ch - 48);
            }

            if (ch=='+' || ch=='-' || i == expression.length()-1) {
                if (oper == '+') {
                    answer += currNum;
                } else {
                    answer -= currNum;
                }
                oper = ch;
                currNum = 0;
            }
        }
        return answer;
    }
}
