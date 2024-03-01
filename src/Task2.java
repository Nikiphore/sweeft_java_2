import java.util.*;

public class Task2 {
    public void runner(){
        String[] strings = {"abbcc", "abc", "abcabc", "cabcbb"};
        List<String> stringList = Arrays.asList(strings);
        System.out.println(stringList);
        System.out.println("number of happy strings: "+numberOfHappyStrings(stringList));
    }
    public int numberOfHappyStrings(List<String> strings){
        int counter=0;
        for (String str: strings){ // გადავუყვებით სტრინგების ლისტს
            boolean isHappy = true;
            for (int i=0; i<str.length()-1; i++){ // გადავუყვებით მიმდინარე სტრინგის თითოეულ სიმბოლოს (ბოლოს წინა სიმბოლომდე)
                if (str.charAt(i)==str.charAt(i+1)){ // თუ ორი მეზობებელი სიმბოლო ერთმანეთის ტოლია, ბულეან ტიპის ცვლადს false-ს ვხდით და ამით ვიგებთ როდის გავზარდოტ მთვლელი
                    isHappy=false;
                    break;
                }
            }
            if (isHappy){
                counter++;
            }
        }
        return counter;
    }

}
