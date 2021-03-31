package Greedy;
import java.util.*;
/** 3장 그리디 알고리즘
 *  예제 3.2 큰 수의 법칙
 *
 * */
public class TheLawOfBigNumber {

    public static void main(String[] args) {
        int answer = 0; //정답

        int N = 5; //배열의 크기
        int M = 8; //더해야하는 횟수
        int K = 3; //연속으로 더할수 없는 횟수, k=3이면 연속3번까지 더하기 가능

        int [] arr = {2,4,5,4,6};
        Arrays.sort(arr);

        int cnt = 0; //반복 카운터
        for(int i=0; i<M; i++){
            if(cnt<K){
                answer+=arr[arr.length-1];
                cnt++;
            }else if(cnt==K){
                answer+=arr[arr.length-2];
                cnt=0;
            }else{
                continue;
            }
        }
        System.out.println("정답 :"+ answer);
    }
}
