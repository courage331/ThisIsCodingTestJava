package implementation;
/** 4장 구현
 *  실전2. 왕실의 나이트
 *
 * */
public class KinghtOfRoyal {
    public static void main(String[] args) {
        int answer = 0;
        String pos = "a1";
        int [][] board = new int[8][8];

        int y = Integer.parseInt(pos.substring(1,2))-1;

        String idx="abcdefgh";
        int x = (idx.indexOf(pos.substring(0,1)));

        int [] y_dir={-2,-2,2,2,-1,1,-1,1};
        int [] x_dir={1,-1,1,-1,2,2,-2,-2};

        for(int i =0; i<y_dir.length; i++){
            if(y_dir[i]+y<0 || y_dir[i]+y>7 || x+x_dir[i]<0 || x+x_dir[i]>7 ){
                continue;
            }else{
                answer++;
            }
        }
        System.out.println("정답 : " + answer);

    }
}
