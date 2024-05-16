package baekjoon.silver;

import java.io.*;
import java.util.*;

class User {
    int age ;
    String name;
    int joinOrder;

    public User(int age, String name, int joinOrder) {
        this.age = age;
        this.name = name;
        this.joinOrder = joinOrder;
    }
}

public class BOJ_10814 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<User> userList = new ArrayList<>();

        // 정보 저장
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            userList.add(new User(age, name, i));
        }

        // 정렬
        Collections.sort(userList,(u1,u2) -> {
            if (u1.age == u2.age) {
                return Integer.compare(u1.joinOrder, u2.joinOrder);
            } else {
                return Integer.compare(u1.age, u2.age);
            }
        });

        for (User user : userList) {
            System.out.println(user.age + " " + user.name);
        }
    }
}
