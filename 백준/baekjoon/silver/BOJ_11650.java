package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class map {
    int x;
    int y;

    public map(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BOJ_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        List<map> mapList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            mapList.add(new map(x, y));
        }

        Collections.sort(mapList, (u1, u2) -> {
            if (u1.x == u2.x) { // x값이 같으면 작은 y 값부터 반환
                return Integer.compare(u1.y, u2.y);
            } else {
                return Integer.compare(u1.x, u2.x);
            }
        });

        for (map map : mapList) {
            System.out.println(map.x + " " + map.y);
        }

    }
}
