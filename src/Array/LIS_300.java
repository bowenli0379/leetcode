package Array;

public class LIS_300 {
    public static int lengthOfLIS(int [] nums){
        int[] maxLen = new int[nums.length];
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    maxLen[i] = Math.max(maxLen[j]+1, maxLen[i]); //这里的长度表示之前的
                }
            }
            res = Math.max(res, maxLen[i]+1); //这里+1，表示加上自身；区分长度和位置
        }
        return res;
    }
    public static void main(String[] args){
        int [] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
}


