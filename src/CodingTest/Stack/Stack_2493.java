package CodingTest.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Stack_2493 {

    //왼쪽의 모든 기둥의 원소를 비교하기 위해 copy해놨던 stack을 원래대로 넣어주는 함수.
    public static void copy(int size, Stack stack, Stack stackCopy, int number){
        for(int t=0; t<size; t++){
            stack.add(stackCopy.pop());
        }
        stack.add(number);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stackCopy = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int number, size;                       //비교를 위해 원소를 넣을 number 변수 필요.
                                                //stack의 원소를 빼고 추가하는 과정에서 size값이 변하기에 고정적인 size를 임의로 설정
        boolean test;                           //신호가 잡힌 기둥이 있었는지 판단하는 변수
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        if(n>500000 | n<1){
            System.exit(0);
        }

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            test = false;                                       //기존엔 false 값으로 test 설정.
            number = Integer.parseInt(st.nextToken());
            if(stack.isEmpty()){                                //스택이 비어 있다면 첫번째 기둥이고 첫번째 기둥은 무조건 0 반환.
                stack.add(number);
                sb.append(0).append(" ");
            } else {
                size = stack.size();                            //size 고정적으로 설정
                for(int j=0; j<size; j++) {                     //stack의 크기만큼 반복하며 신호를 잡을 수 있는 기둥이 있는지 비교.
                    stackCopy.add(stack.pop());
                    if (stackCopy.peek() >= number) {           //신호를 잡을 수 있다면 해당 기둥이 몇 번째인지 반환.
                        sb.append(size - j).append(" ");
                        size = stackCopy.size();                //비교하기 위해 빠졌던 stack을 원상태로 복귀.
                        copy(size, stack, stackCopy, number);
                        test = true;                            //신호를 받는 기둥이 존재했으므로 true값 반환.
                        break;
                    }
                }
                if(test == false){                              //신호를 받는 기둥이 없었을 시.
                    size = stackCopy.size();
                    copy(size, stack, stackCopy, number);       //기존 stack을 원 상태로 복구하고
                    sb.append(0).append(" ");                   //0반환.
                }
            }
        }
        System.out.println(sb);                                 //StringBuilder에 넣어놨던 전체 결과 값 반환.
    }
}
