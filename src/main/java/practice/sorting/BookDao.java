package main.java.practice.sorting;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public static List<BookVO> getBookList(){
        List<BookVO> bookVOList = new ArrayList<>();
        bookVOList.add(new BookVO(2,"Spring","Framework"));
        bookVOList.add(new BookVO(1,"Hibernate","Database"));
        bookVOList.add(new BookVO(3,"Java","Core Java"));
        return bookVOList;
    }
}
