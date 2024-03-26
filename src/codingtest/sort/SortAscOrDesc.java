package codingtest.sort;

import java.util.Arrays;
import java.util.Collections;

public class SortAscOrDesc {
    public static void main(String[] args) {
        // Arrays.sort() 를 사용해서 정렬
        int a_1[] = {3, 1, 5, 4, 2};
        Arrays.sort(a_1);
        System.out.println(Arrays.toString(a_1));

        // 내림차순 1번
        Integer a_2[] = {3, 1, 5, 4, 2};
        Arrays.sort(a_2, Collections.reverseOrder());
        System.out.println(Arrays.toString(a_2));

        // 내림차순 2번
        int a_3[] = {3, 1, 5, 4, 2};
        Integer[] tmp = Arrays.stream(a_3).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());
        System.out.println(Arrays.toString(tmp));

        // 내림차순 2번
        int a_4[] = {-3, -1, -5, -4, -2};
        Arrays.sort(a_4);
        for (int i = 0; i < a_4.length; i++) {
            a_4[i] *= -1;
        }
        System.out.println(Arrays.toString(a_4));
    }
}
