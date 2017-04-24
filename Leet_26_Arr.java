//https://leetcode.com/problems/remove-duplicates-from-sorted-array/#/description

import java.util.Arrays;

public class Leet_26_Arr {

    public static void main(String[] args) {
        int[] nums={1,1,2};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]<nums[j]){
                if(j-i == 1 ){
                    i++;
                }else{
                    nums[++i]=nums[j];
                }
            }
            j++;
        }

        return i+1;
    }
}
