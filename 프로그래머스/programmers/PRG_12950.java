package programmers;

public class PRG_12950 {
    public int[][] solution(int[][] arr1 , int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        // arr1   arr2   answer
        // [1,2], [3,4], [4,6], 
        // [2,3]  [5,6]  [7,9]

        // 행의 크기 = arr1.length
        // 열의 크기 = arr1[0].length

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
