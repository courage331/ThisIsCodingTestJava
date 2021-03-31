package Greedy;
/** 3장 그리디 알고리즘
 *  예제 3.4 1이 될때 까지
 *
 * */
public class ToBeOne {
    public static void main(String[] args) {
        int answer = 0; //ㅈ정답

        int N = 27; //어떠한 수
        int K = 3; //나누는려고 하는수

        while(N!=1){
            if(N%K==0){
                N = N/K;
            }else{
                N = N-1;
            }
            answer++;
        }
        System.out.println("정답 : "+answer);
    }
}
