package Greedy;
import java.util.*;
/** 3장 그리디 알고리즘
 *  예제 3.3 숫자 카드 게임
 *
 * */

public class NumberCardGame {
    public static void main(String[] args) {
        int answer = 0; //정답
        int N = 3; // 행
        int M = 3; // 열

        int [][] arr= new int[N][M];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]=(int)(Math.random()*100);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int [] minarr = new int[arr.length];

        for(int i =0; i<minarr.length; i++){
            Arrays.sort(arr[i]);
            minarr[i]= arr[i][0];
        }
        Arrays.sort(minarr);
        System.out.println("정답 : "+minarr[minarr.length-1]);

    }
}
