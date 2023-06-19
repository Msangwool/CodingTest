package codingtest.hackerrank.InterviewPreparationKits1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TruchTour {

    static class Result {

        /**
         * Complete the 'truckTour' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY petrolpumps as parameter.
         * */

        public static int truckTour (List<List<Integer>> petrolpumps) {

            int totalPumps = petrolpumps.size();
            int startPump = 0;
            int fuel = 0;

            while (true) {
                int pumpFuel = petrolpumps.get(startPump).get(0);
                int pumpDistance = petrolpumps.get(startPump).get(1);

                fuel += pumpFuel;

                if (fuel >= pumpDistance) {
                    fuel -= pumpDistance;
                    startPump = (startPump + 1) % totalPumps;
                    if (startPump == 0) {
                        return startPump;
                    }
                } else {
                    fuel = 0;
                    startPump = (startPump + 1) % totalPumps;
                }
            }
        }
    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<Integer>> petrolpumps = new ArrayList<>();

            IntStream.range(0, n).forEach(i -> {
                try {
                    petrolpumps.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .toList()
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            int result = Result.truckTour(petrolpumps);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}