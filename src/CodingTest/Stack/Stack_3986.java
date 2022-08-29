package CodingTest.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Stack_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack;
        String[] strArr;
        int count =0;
        int n = Integer.parseInt(br.readLine());
        if(n>100|n<1){
            System.exit(0);
        }
        for(int i=0; i<n; i++){
            stack = new Stack<>();                          //Stack 초기화
            strArr = br.readLine().split("");         //문자열 받아옴
            for(int j=0; j<strArr.length; j++){             //문자열의 길이만큼 반복
                if(stack.isEmpty()){                        //비어 있다면 추가
                    stack.add(strArr[j]);
                }
                else if(stack.peek().equals(strArr[j])){    //같다면 최상위 원소 제거
                    stack.pop();
                }
                else if(!stack.peek().equals(strArr[j])){   //다르다면 추가
                    stack.add(strArr[j]);
                }
            }
            if(stack.isEmpty()){                            // 위 과정을 거치고 남아있는 원소가 없다면, 조건에 만족함.
                count++;
            }
        }
        System.out.println(count);                          // 조건을 만족하는 문자열이 몇개인지 출력.
    }
}
