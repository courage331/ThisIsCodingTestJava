package implementation;

public class DevelopingGame {

    public static void main(String[] args) {
        int answer = 0;
        int n =4;
        int m = 4;
        int [][] board = new int[n][m];

        board = new int[][]{{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};

        int start_y = 1;
        int start_x = 1;
        int dir = 0;

        boolean possible = true;
        int[][] chk = new int[n][m];
        int pos_x = start_x-1;
        int pos_y = start_y-1;
        chk[pos_y][pos_x] = 1;

        //북 남 서 동
        //0  1  2  3
        int [] y_dir = {-1,1,0,0};
        int [] x_dir = {0,0,-1,1};

        while(possible){
            //북
            if(dir%4==0){
                if(pos_x -1 <0){
                    dir++;
                    continue;
                }else{
                    //이미가본곳
                    if(chk[pos_y][pos_x-1]==1){
                        dir++;
                        continue;
                    //안가본곳
                    }else{
                        pos_x -=1;
                        chk[pos_y][pos_x]=1;
                        dir++;
                        answer++;
                    }
                }



            }



        }

        System.out.println("정답 : "+answer);
    }
}
