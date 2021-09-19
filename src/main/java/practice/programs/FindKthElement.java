package main.java.practice.programs;

import java.util.Arrays;

public class FindKthElement {

    public static void main(String[] args) {
        int elementNo = 4;
        int value = findKthElement(elementNo);
        System.out.println(elementNo+"th Element is :"+value);
    }

    private static int findKthElement(int elementNo) {
        int nums[] = {4,6,13,12,64,1,32,56,7};
        //Arrays.stream(nums).distinct().boxed().sorted(Comparator.reverseOrder()).skip(elementNo-1).limit(1).findFirst().get();
        /*Arrays.sort(nums);
        System.out.println(nums[elementNo-1]);*/
        return Arrays.stream(nums).distinct().sorted().skip(elementNo-1).limit(1).findFirst().getAsInt();
    }
}
