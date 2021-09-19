package main.java.practice.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

    public static void main(String[] args) {
        int nums[] = {4,6,4,12,4,1,1,56,7};

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i] == nums[j]){
                    System.out.println("Duplicate element is:"+nums[i]);
                }
            }
        }

        List<Integer> list = Arrays.asList(4,6,4,12,4,1,1,56,7);
        Set<Integer> items = new HashSet<>();
        Set<Integer> duplicates = list.stream().filter(i -> !items.add(i)).collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
