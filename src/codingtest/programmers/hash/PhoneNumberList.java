package codingtest.programmers.hash;

import java.io.*;
import java.util.*;

public class PhoneNumberList {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();

        String strPhoneNumberList = br.readLine().replaceAll(" ", "");

        String[] phoneNumberList = strPhoneNumberList.split("\\[|\\]|,|\"");

        List<String> processedPhoneNumber = new ArrayList<>();

        for (String s : phoneNumberList) {
            if (s != null & s != "") {
                processedPhoneNumber.add(s);
            }
        }

        boolean result = solution.solution(processedPhoneNumber.toArray(new String[processedPhoneNumber.size()]));

        bw.write(result + "");
        bw.flush();
        bw.close();
    }

    static class Solution {
        public boolean solution(String[] phone_book) {

            Arrays.sort(phone_book);

            int ln = phone_book.length;

            for (int i = 0; i < ln - 1; i++) {
                if (phone_book[i + 1].startsWith(phone_book[i])) {
                    return false;
                }
            }

            return true;
        }
    }
}
