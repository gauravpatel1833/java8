package main.java.practice.sorting;

import java.util.Comparator;
import java.util.List;

public class BookMain {

    public static void main(String[] args) {
        List<BookVO> bookVOList = BookDao.getBookList();

        //Collections.sort(bookVOList,(b1,b2) -> b1.getId() - b2.getId());
        //System.out.println("Books sort on id="+bookVOList);

        //Collections.sort(bookVOList,(b1,b2) -> b1.getName().compareTo(b2.getName()));
        //System.out.println("Books sort on name="+bookVOList);


        //Sorting books based on name using pure lamba
        //bookVOList.stream().sorted((b1,b2) -> b1.getId() - b2.getId()).forEach(b -> System.out.println(b));
        //bookVOList.stream().sorted((b1,b2) -> b1.getName().compareTo(b2.getName())).forEach(b -> System.out.println(b));

        //Sorting books based on name using comparator lamba
        //bookVOList.stream().sorted(Comparator.comparing(b -> b.getName())).forEach(b -> System.out.println(b));

        //Sorting books based on name using method reference
        bookVOList.stream().sorted(Comparator.comparing(BookVO::getSubject)).forEach(b -> System.out.println(b));

        //Sorting books based on name descending using method reference
        bookVOList.stream().sorted(Comparator.comparing(BookVO::getSubject).reversed()).forEach(b -> System.out.println(b));

       /* List<Integer> list = Arrays.asList(2,1,45,6,3);
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
        */

    }
}
