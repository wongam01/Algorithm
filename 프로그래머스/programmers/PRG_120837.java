package programmers;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PRG_120837 {
    public int solution(int hp) {
        // hp를 나누고 몫을 출력, 나머지는 넘겨줌
        int ant = 0;

        ant += (hp / 5);
        hp %= 5;

        ant += (hp / 3);
        hp %=3;

        ant += (hp / 1);

        return ant;
    }
}
