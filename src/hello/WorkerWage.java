package hello;

import java.util.Scanner;

class Worker {
    String name;
    int code;
    int worktime;

    public Worker(String name, int code, int worktime) {
        this.name = name;
        this.code = code;
        this.worktime = worktime;
    }
}


public class WorkerWage {
    Scanner sc;
    Worker[] empArr;
    
    //static 쓰기 싫다면 인스턴스 객체를 만들어라    
    public WorkerWage() {
        this.sc = new Scanner(System.in);
        this.empArr = new Worker[3];
    }
    
    
    public static void main(String[] args) {
        WorkerWage manager = new WorkerWage();  
        manager.infoInput();
        manager.infoPrint();
        manager.sc.close();
    }


    public void infoInput() {
        for (int i = 0; i < 3; i++) {
            System.out.printf("직원 %d 정보 입력 (이름, 코드, 근무시간): ", i + 1);
            empArr[i] = new Worker(sc.next(), sc.nextInt(), sc.nextInt());
        }
    }

    
    public void infoPrint() {
        System.out.println("\n--- 직원 정보 출력 ---");
        for (Worker emp : empArr) {
            int wage = 0;
            switch (emp.code) {
                case 1: wage = emp.worktime * 2000; break;
                case 2: wage = emp.worktime * 2500; break;
                case 3: wage = emp.worktime * 3000; break;
                case 4: wage = emp.worktime * 4000; break;
            }
            System.out.printf("이름: %s, 코드: %d, 근무시간: %d시간, 임금 : %d\n", 
                              emp.name, emp.code, emp.worktime, wage);
        }
    }
}
