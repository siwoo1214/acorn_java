//package day05;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class 짝수배열문제 {
//	public void printArgs(String... args) {
//
//	    for (String arg : args) {
//	        System.out.println(arg);
//	    }
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//1차배열(정수형 배열 10개) 숫자 10개를 저장할 수 있는 배열 준비하기
//		//수를 입력받아서 짝무만 저장하고 출력하기
//		//수가 0이면 입력되면 종료
//		
//			
//		}
//		
//		//숫자를 입력받아서 10개 출력하기
////		int[] arr2 = new int[10];
////		for(int i=0; i<arr2.length; i++) {
////			arr2[i]=sc.nextInt();
////		}
////		
////		for(int tmp : arr2) {
////			System.out.print(tmp+" ");
////		}
////		
//		
//		//숫자를 입력받아서 0이 아니면 배열에 저장한 후 입력된 갯수만큼 출력하기
////		ArrayList<Integer> list = new ArrayList<>();
////
////		while(true) {
////			System.out.print("배열에 추가할 숫자 입력 (0 입력 시 종료): ");
////            int input = sc.nextInt();
////
////            if (input == 0) break;
////            list.add(input);
////		}
////		
////        for (int num : list) {
////            System.out.print(num + " ");
////        }
//        
////        int idx=0;
////        int[] arr4 = new int[1];
////        while(true) {
////        	System.out.println("숫자 입력하시오 : ");
////        	int tmp=sc.nextInt();
////        	if(tmp==0) {
////        		break;
////        	} 
////        	if (idx >= arr4.length) {
////                 arr4 = Arrays.copyOf(arr4, arr4.length + 1);
////            }
////
////            arr4[idx] = tmp;
////            idx++;
////        }
////        
////        for(int qw : arr4) {
////        	System.out.println(qw+" ");
////        }
//		
////		int input = sc.nextInt();
////		int index=0;
////		int[] arr4 = new int[10];
////		
////		while(input!=0) {
////			arr4[index]=input;
////			index++;
////			input=sc.nextInt();
////		}
////        
////        System.out.print("입력된 숫자: ");
////        for (int i = 0; i < index; i++) {
////            System.out.print(arr4[i] + " ");
////        }
//	}
//}
