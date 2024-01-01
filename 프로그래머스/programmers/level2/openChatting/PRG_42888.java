package programmers.level2.openChatting;

import java.util.ArrayList;
import java.util.HashMap;
public class PRG_42888 {
    private String manageChatRoom(String status,String nickName) {
        if (status.equals("Enter")) {
            return nickName + "님이 들어왔습니다";
        } else if (status.equals("Leave")) {
            return nickName + "님이 나갔습니다";
        }
        return null;
    }

    public String[] solution(String[] record) {
        // ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
        // ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]

        HashMap<String, String> userMap = new HashMap<>();
        ArrayList<String> statusList = new ArrayList<>();

            for (String records : record) {
                String[] parts = records.split(" ");
                String status = parts[0];
                String uid = parts[1];

                if (status.equals("Enter") || status.equals("Change")) {
                    String nickName = parts[2];
                    userMap.put(uid, nickName);
                }
            }

            // 최종 메세지 생성
        for (String records : record) {
            String[] parts = records.split(" ");
            String status = parts[0];
            String uid = parts[1];
            if (status.equals("Enter") || status.equals("Leave")) {
                String nickName = userMap.get(uid);
                statusList.add(manageChatRoom(status, nickName));
            }
        }
        String[] answer = new String[statusList.size()];
        answer = statusList.toArray(answer);

        return answer;
    }
}
