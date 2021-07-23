/*
-1을 초기값으로 두어 나타나지 않음을 표현한 것은 좋은 아이디어입니다.
Java.util.Arrays를 import 하면
int[] cow = new int[10];
Arrays.fill(cow, -1); 을 통해 배열을 -1로 초기화할 수 있습니다.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cow = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i =0; i< n ; i++){
            st = new StringTokenizer(br.readLine());
            int cownum = Integer.parseInt(st.nextToken());
            int loc = Integer.parseInt(st.nextToken());

            if (cow[cownum-1] == -1 ){
                cow[cownum-1] = loc;
            }
            else if (cow[cownum-1] != loc){
                count ++;
                cow[cownum-1] = loc;
            }
        }
        System.out.println(count);
    }
}
