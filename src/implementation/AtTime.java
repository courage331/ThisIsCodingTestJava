package implementation;
/** 4장 구현
 *  예제 4.2 시각
 *
 * */
public class AtTime {

    public static void main(String[] args) {
        int N =5;
        int answer =0;
        String time = "";
        for(int i=0; i<=N; i++){
            for(int j=0; j<60; j++){
                for(int k=0; k<60; k++){
                    time = String.valueOf(i)+String.valueOf(j)+String.valueOf(k);
                    if(time.contains("3")){
                        answer++;
                    }
                }
            }
        }
        System.out.println("정답 : "+answer);

    }
}
