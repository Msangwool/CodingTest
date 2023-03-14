package codingtest.programmers.hash;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pokemon {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();

        ArrayList<Integer> intArr = new ArrayList<>();

        String arr = br.readLine();
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) != '[' & arr.charAt(i) != ',' & arr.charAt(i) != ']') {
                intArr.add(Character.getNumericValue(arr.charAt(i)));
            }
        }

        int[] nums = intArr.stream().mapToInt(i -> i).toArray();

        bw.write(solution.solution(nums) + "");
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
