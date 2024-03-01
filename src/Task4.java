import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public void runner(){
        int[] nums1 = {1, 2, 3, 3, 4, 5};
        int[] nums2 = {3, 4, 4, 5, 6, 7};
        int[] ans = findIntersection(nums1,nums2);
        System.out.println(Arrays.toString(nums1) +" "+ Arrays.toString(nums2));
        System.out.println("intersection of 2 arrays: " +Arrays.toString(ans));
        //for (int item: ans) System.out.print(item+" ");
    }

    public int[] findIntersection(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();
        for (int item : nums1) {
            set.add(item);
        }
        Set<Integer> answer = new HashSet<>();
        for (int item : nums2) {
            if (set.contains(item)) {
                answer.add(item);
            }
        }

        int[] resultArray = new int[answer.size()];
        int i = 0;
        for (int item : answer) {
            resultArray[i++] = item;
        }
        return resultArray;
    }
}
