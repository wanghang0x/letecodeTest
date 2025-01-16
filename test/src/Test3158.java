import java.util.*;

public class Test3158 {

    public int duplicateNumbersXOR(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int res=0;

        for (int num:nums){
            if (set.contains(num)){
                res^=num;
            }
            set.add(num);
        }
        return res;
    }
}
