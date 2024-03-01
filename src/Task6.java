import java.util.Arrays;

public class Task6 {
    public void runner(){
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};
        System.out.println(Arrays.toString(sequence) + " is subset of " + Arrays.toString(array) + " : " + isValidSequence(array, sequence));
    }

    public boolean isValidSequence(int[] array, int[] sequence){
        int sId = 0;
        for (int item : array) {
            if (sId == sequence.length) {
                break;
            }
            if (item == sequence[sId]) {
                sId++;
            }
        }
        if (sId == sequence.length) return true;
        else return false;
    }

}
