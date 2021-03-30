package Greedy;

/** 3장 그리디 알고리즘
 *  예제 3.1 거스름돈
 *
 * */
public class ChangeMoney {

    public static void main(String [] args){

        int n = 1260; //입력값
        int answer = 0; // 결과값
        int [] coin = {500,100,50,10}; //동전종류

        for(int i=0; i<coin.length; i++){
            answer+=n/coin[i];
            n = n%coin[i];
        }
        System.out.println("결과값 : "+answer);
    }
}
