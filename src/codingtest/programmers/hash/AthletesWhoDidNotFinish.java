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

            Arrays.sort(participant);
            Arrays.sort(completion);

            int i;
            for (i = 0; i < completion.length; i++) {
                if (!participant[i].equals(completion[i])) {
                    return participant[i];
                }
            }

            return participant[i];
        }
    }
}
