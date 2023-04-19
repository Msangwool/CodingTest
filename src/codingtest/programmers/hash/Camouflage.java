package codingtest.programmers.hash;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Camouflage {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();

        String[][] strings = {{"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}};

        bw.write(solution.solution(strings) + "");
        bw.flush();
        bw.close();
    }

    public static class Solution {
        public int solution(String[][] clothes) {
            int sum = 1;

            Map<String, Integer> clothesMap = new HashMap<>();

            for(String[] clothArr : clothes) {
                clothesMap.put(clothArr[1], clothesMap.getOrDefault(clothArr[1], 0) + 1);
            }

            if (clothesMap.size() == 1) {
                return clothesMap.entrySet().iterator().next().getValue();
            }

            for (Integer value : clothesMap.values()) {
                sum *= (value+1);
            }

            return sum - 1;
        }
    }
}
