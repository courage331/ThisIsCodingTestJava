package implementation;

/** 4장 구현
 *  예제 4.1 상하좌우
 *
 * */
public class UpDownLeftRight {

    public static void main(String[] args) {

        int [] x_dir = {-1,1,0,0};
        int [] y_dir = {0,0,-1,1};
        String [] direction = {"L","R","U","D"};

        int N = 5; //판의 크기
        int [][] board = new int[N][N];
        String [] dir = {"R","R","R","U","D","D"};
        int y=1;
        int x=1;
        for(int i=0; i<dir.length; i++){
            for(int j=0; j<direction.length; j++){
                if(dir[i].equals(direction[j])) {
                    if(x+x_dir[j]==N || x+x_dir[j]==0 || y+y_dir[j]==N || y+y_dir[j]==0){
                        break;
                    }

                    x+=x_dir[j];
                    y+=y_dir[j];
                    break;
               }
            }
        }

        System.out.println("결과 : "+y+" "+x);
    }
}
