package hello;

import java.util.Scanner;

public class Ex2_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 학생 수 입력
        System.out.print("학생수를 입력하세요 : ");
        int num = sc.nextInt();

        // 배열 생성: 이름, 국어, 영어, 수학 성적 배열
        String[] names = new String[num];
        int[] koreanScores = new int[num];
        int[] englishScores = new int[num];
        int[] mathScores = new int[num];

        // 학생 정보 입력 받기
        for (int i = 0; i < num; i++) {
            System.out.print("학생의 이름, 국어, 영어, 수학 성적을 입력하세요 : ");
            names[i] = sc.next();  // 이름
            koreanScores[i] = sc.nextInt();  // 국어
            englishScores[i] = sc.nextInt();  // 영어
            mathScores[i] = sc.nextInt();  // 수학
        }

        // 학생 성적 출력 및 평균 계산
        for (int i = 0; i < num; i++) {
            int total = koreanScores[i] + englishScores[i] + mathScores[i];
            double avg = total / 3.0;  // 평균 계산
            System.out.printf("%s님 국어점수 : %d 영어점수 : %d 수학점수 : %d 평균 : %.2f\n", names[i], koreanScores[i], englishScores[i], mathScores[i], avg);
            if (avg > 90) {
                System.out.printf("%s님 Excellent!\n", names[i]);
            } else if (avg < 60) {
                System.out.printf("%s님 FAIL\n", names[i]);
            }
        }

        // 전체 평균 계산
        int sumKorean = 0, sumEnglish = 0, sumMath = 0;
        for (int i = 0; i < num; i++) {
            sumKorean += koreanScores[i];
            sumEnglish += englishScores[i];
            sumMath += mathScores[i];
        }

        float avgKorean = sumKorean / (float) num;
        float avgEnglish = sumEnglish / (float) num;
        float avgMath = sumMath / (float) num;

        System.out.printf("국어 평균 : %.2f 영어 평균 : %.2f 수학 평균 : %.2f\n", avgKorean, avgEnglish, avgMath);

        sc.close();
    }
}
