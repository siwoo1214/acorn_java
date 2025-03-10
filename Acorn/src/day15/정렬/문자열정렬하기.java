package day15.정렬;

public class 문자열정렬하기 {
	public static void main(String[] args) {
		String[] arr = new String[] {"banana", "tomato", "apple"};
		
		//정렬
		//선택정렬
		//compareTo() 기준문자열.compareTo(비교문자열) => 0(같다), 음수(기준이 앞에 있다,작다), 양수(기준이 뒤에 있다,크다)
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		for(String each : arr) {
			System.out.print(each+" ");
		}
		
		System.out.println();
		
		String a="banana";
		String b="apple";
		
		int result = a.compareTo(b);
		int result2 = b.compareTo(a);
		
		System.out.println("앞에 문자열이 더 크면 '"+result+"'이라는 결과가 나옴");
		System.out.println("앞의 문자열이 더 작은게 오면 '"+result2+"'이라는 결과가 나오게 된다");
	}
}
