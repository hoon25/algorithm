package grammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*
Immutable 리스트 생성하기
 */
public class ImmutableList {
    public static void main(String[] args) {

        // java8
        List<String> results = Arrays.asList("a", "b", "c");
        results = Collections.unmodifiableList(results);
        // 변경불가 확인
        results.add("e"); //UnsupportedOperationException

        // java8 ArrayList (ArrayList의 경우 List로 형변환이 필요)
        List<String> results2 = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        results2 = Collections.unmodifiableList(results2);
        // 변경불가 확인
        results2.add("e"); //UnsupportedOperationException

        // java9 List immutable
        List<String> results3 = List.of("a", "b", "c");
        // 변경불가 확인
        results3.add("e"); //UnsupportedOperationException
    }
}
