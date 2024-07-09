package codingtest.programmers.basic.day_5;

public class ConnectedNumber {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 4, 5, 2, 1}));
        // 393
    }

    public static int solution(int[] num_list) {
        StringBuilder add = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int i : num_list) {
            if (i % 2 == 1) {
                add.append(i);
            } else {
                even.append(i);
            }
        }

        return Integer.parseInt(add.toString()) + Integer.parseInt(even.toString());
    }

}
