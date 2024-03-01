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
            char ch = expression.charAt(i); //ch ცვლადში ვინახავთ ციკლით გადაყოლისას მიმდინარე სიმბოლოს (იქნება ციფრი ან '+','-')
            if (!(ch=='+' || ch=='-')) { // თუ მიმდინარე სიმბოლო ციფრია, მაშინ მას გადავიყვანთ ჩარიდან რიცხვში. 48 ascii ცხრილის გამო გამოვაკელი, რომელიც 0-ს შეესაბამება
                currNum = currNum * 10 + ((int)ch - 48);
            }

            if (ch=='+' || ch=='-' || i == expression.length()-1) { // თუ დამტავრდა სიმბოლოები, ან რომელიმე ოპერატორს მივადექით, მაშინ შევასრულებთ მოქმედებებს
                if (oper == '+') {
                    answer += currNum;
                } else {
                    answer -= currNum;
                }
                oper = ch;
                currNum = 0; // მიმდინარე რიცხვს ყოველ ჯერზე ვანულებთ და შემდეგ პირველ if-ში ტავიდან ვითვლით
            }
        }
        return answer;
    }
}
