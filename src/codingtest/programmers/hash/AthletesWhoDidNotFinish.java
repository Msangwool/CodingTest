package codingtest.programmers.hash;

import java.io.*;
import java.util.*;

public class AthletesWhoDidNotFinish {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        Solution solution = new Solution();

        String strParticipant = br.readLine().replaceAll(" ", "");
        String strCompletion = br.readLine().replaceAll(" ", "");

        String[] participant = strParticipant.split("\\[|\\]|,|\"");
        String[] completion = strCompletion.split("\\[|\\]|,|\"");

        List<String> processedParticipant = new ArrayList<>();
        List<String> processedCompletion = new ArrayList<>();

        for (String s : participant) {
            if (s != null & s != "") {
                processedParticipant.add(s);
            }
        }
        for (String s : completion) {
            if (s != null & s != "") {
                processedCompletion.add(s);
            }
        }

        String returnValue = solution.solution(
                processedParticipant.toArray(new String[processedParticipant.size()]),
                processedCompletion.toArray(new String[processedCompletion.size()]));

        bw.write(returnValue);
        bw.close();
    }

    static class Solution {
        public String solution(String[] participant, String[] completion) {

            Map<String, Integer> map = new HashMap<>();

            for (String player : participant) {
                map.put(player, map.getOrDefault(player, 0) + 1);
            }

            for (String player : completion) {
                map.put(player, map.get(player) - 1);
            }

            for (Map.Entry<String, Integer> mapEntry : map.entrySet()) {

                if (mapEntry.getValue() != 0) {
                    return mapEntry.getKey();
                }
            }

            return "";
        }
    }
}
