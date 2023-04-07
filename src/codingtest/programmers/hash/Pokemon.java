package codingtest.programmers.hash;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Pokemon {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();

        String arr = br.readLine();

        int[] phoneNumberList = Stream.of(arr
                        .split("\\[|\\]|\\,|\"|"))
                        .filter(c -> !Objects.equals(c, "") & !Objects.equals(c, " "))
                        .mapToInt(Integer::parseInt).toArray();

        bw.write(solution.solution(phoneNumberList) + "");
        bw.close();
    }

    static class Solution {
        public int solution(int[] nums) {

            Set<Integer> setNums = new HashSet<>();

            for (int num : nums) {
                setNums.add(num);
            }

            int halfNumLength = nums.length / 2;

            if (setNums.size() >= halfNumLength ) {
                return halfNumLength;
            }

            return setNums.size();
        }
    }
}
