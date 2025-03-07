package day05;

public class 변수외배열 {
	public static void main(String[] args) {
		String name1="권지언";
		String name2="김민환";
		String name3="김보성";
		String name4="김유민";
		String name5="박수경";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);

		//아래는 배열선언방법인데 모두 가능한 방법이다
//		String[] names = {"권지언" ,  "김민환",  "김보성" , "김유민" , "박수경"};
		String[] names = new String[]{"권지언" ,  "김민환",  "김보성" , "김유민" , "박수경"};
		
//		String[] names = new String[5];
//		names[0]="권지언";
//		names[1]="김민환";
//		names[2]="박수경";
//		names[3]="김보성";
//		names[4]="김유민";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		
		System.out.println("-------------------------------");
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);	
		}
	}
}
