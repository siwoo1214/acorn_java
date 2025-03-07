package day15.정렬;

public class Score정렬하기 {
	public static void main(String[] args) {
		Score[] arr = new Score[5];
		
		arr[0] = new Score("박예린",100,97);
		arr[1] = new Score("이정호",99,90);
		arr[2] = new Score("김민환",89,100);
		arr[3] = new Score("김유민",88,77);
		arr[4] = new Score("박수경",85,89);
		
		//정렬(선택정렬)
		
		//국어점수 오름차순
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].kor>arr[j].kor) {
					Score tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		for(Score tmp : arr) {
			System.out.print(tmp+" \n");
		}
		
		System.out.println("=============================");
		
		//영어점수 오름차순
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].eng>arr[j].eng) {
					Score tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		for(Score tmp : arr) {
			System.out.print(tmp+" \n");
		}
	}
}
