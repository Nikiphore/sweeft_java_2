import java.util.Arrays;

public class Task6 {
    public void runner(){
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};
        System.out.println(Arrays.toString(sequence) + " is subset of " + Arrays.toString(array) + " : " + isValidSequence(array, sequence));
    }

    // ჯერ გადავუყვებით მთავარ array მასივს და თითოეულ ელემენტს შევადარებთ sequence-ს ელემენტებს. თუ დაემთხვა, ქვემიმდევრობის ინდექსს ერთით გავზრდით. ასე თუ ქვემიმდევრობის ინდექსი გახდა მისი ელემენტების რაოდენობის ტოლი, ანუ ყველა ელემენტი დაემთხვა სათანადო თანმიმდევრობით და true-ს დავაბრუნებთ
    public boolean isValidSequence(int[] array, int[] sequence){
        int sId = 0;
        for (int item : array) { // გადავუვლით მთავარ მასივს
            if (sId == sequence.length) { // ციკლს გავაჩერებთ თუ ქვემიმდევრობა ბოლომდე გავიარეთ
                break;
            }
            if (item == sequence[sId]) { // თუ დაემთხვა მნიშვნელობები, ინდექსს ვზრდით ერთით
                sId++;
            }
        }
        // ვაბრუნებთ შესაბამისად true-ს ან false-ს
        if (sId == sequence.length) return true;
        else return false;
    }

}
