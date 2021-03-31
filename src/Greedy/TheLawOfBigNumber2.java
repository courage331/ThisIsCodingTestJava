package Greedy;
import java.util.*;
/** 3장 그리디 알고리즘
 *  예제 3.2 큰 수의 법칙
 *   다른 방법으로 풀어보기
 * */
public class TheLawOfBigNumber2 {
    public static void main(String[] args) {
        int answer = 0; //정답

        int N = 5; //배열의 크기
        int M = 8; //더해야하는 횟수
        int K = 3; //연속으로 더할수 없는 횟수, k=3이면 연속3번까지 더하기 가능

        int [] arr = {2,4,5,4,6};
        Arrays.sort(arr);

        int bigNum = arr[arr.length-1];
        int secondNum = arr[arr.length-2];

        answer = (M/(K+1))*(bigNum*K+secondNum) + (M%(K+1)) * bigNum;

        System.out.println("정답 :"+ answer);
    }
}
