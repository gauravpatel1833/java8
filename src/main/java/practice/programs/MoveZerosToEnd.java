package main.java.practice.programs;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int nums[] = {1,0,3,0,0,7,8};
        pushZerosToEnd(nums,nums.length);
        for (int num : nums) {
            System.out.print(num +",");
        }
    }

    private static void pushZerosToEnd(int[] nums, int length) {
        int count = 0;

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for(int i=0 ;i<length;i++){
            if(nums[i] !=0){
                nums[count++] = nums[i];
            }
        }
        while(count<length){
            nums[count++] = 0;
        }
    }
}
