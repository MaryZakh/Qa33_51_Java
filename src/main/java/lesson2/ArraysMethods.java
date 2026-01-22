package lesson2;

public class ArraysMethods {

    public static Integer arrayEvenSum(String[] nums) {
        if (nums == null||nums.length==0) {
            return null;
        }
        Integer res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==null)
                return null;
            int temp = Integer.parseInt(nums[i]);
            if (temp % 2 == 0)
                res += temp;
        }
        return res;
    }
}
