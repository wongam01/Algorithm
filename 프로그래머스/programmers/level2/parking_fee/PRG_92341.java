package programmers.level2.parking_fee;

import java.util.*;

public class PRG_92341 {
    //  IN -> 저장 , OUT -> 출차 시간 빼서 저장 -> 분으로 변환 후 계산
    //  IN 만 있고, OUT 이 없을 때 -> 23:59 - IN 의 값 빼주기
    //  " " 로 분리
    private int timeToMinutes(String time) { // 시간 -> 분 변환
        String[] split = time.split(":");
        int hours = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);
        return hours * 60 + minutes;
    }

    private int calculateFee(int[] fees,int parkingTime) { // 요금 계산 로직
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        if (parkingTime <= basicTime) {
            return basicFee;
        } else {
            return basicFee + (int)Math.ceil((double)(parkingTime -basicTime) / unitTime) * unitFee;
        }
    }

    //  ["16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT",   "23:58 3961 IN"]
    public int[] solution(int[] fees, String[] records) {
        // 차량 번호에 따른 주차 시간 저장
        HashMap<Integer, Integer> inFeeMap = new HashMap<>();
        HashMap<Integer, Integer> totalFeeMap = new HashMap<>();


        for (String record : records) {
            String[] parts = record.split(" ");
            int time = timeToMinutes(parts[0]);
            int vehicleNumber = Integer.parseInt(parts[1]);
            String status = parts[2];

            if (status.equals("IN")) { // IN -> 시간 저장
                inFeeMap.put(vehicleNumber, time);
            } else if (status.equals("OUT")) { // inFeeMap 값 가져온 뒤 현재 값에서 차감
                int inTime = inFeeMap.get(vehicleNumber);
                int parkingTime = time - inTime; // 최종 주차 시간
                inFeeMap.remove(vehicleNumber);
                totalFeeMap.put(vehicleNumber, totalFeeMap.getOrDefault(vehicleNumber, 0) + parkingTime); // 누적 값 update 필요
            }
        }

        int endOfDay = timeToMinutes("23:59");
        // IN 만 있고 OUT 은 없는 경우
        for (Integer vehicleNumber : inFeeMap.keySet()) { //
            int inTime = inFeeMap.get(vehicleNumber);
            int parkingTime = endOfDay - inTime;
            totalFeeMap.put(vehicleNumber, totalFeeMap.getOrDefault(vehicleNumber, 0) + parkingTime);
        }

        // 최종 주차 요금 계산
        int[] answer = new int[totalFeeMap.size()];
        int idx = 0;
        ArrayList<Integer> sortedVehicle = new ArrayList<>(totalFeeMap.keySet());
        Collections.sort(sortedVehicle);
        for (Integer vehicleNumber : sortedVehicle) {
            int parkingTime = totalFeeMap.get(vehicleNumber);
            answer[idx++] = calculateFee(fees, parkingTime);
        }
        return answer;
    }
}
