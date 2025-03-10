package day15.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Member member1 = new Member("다", 10);
        Member member2 = new Member("나", 10);
        Member member3 = new Member("가", 12);
        Member member4 = new Member("가", 9);

        List<Member> members = new ArrayList<>();
        members.add(member1);
        members.add(member2);
        members.add(member3);
        members.add(member4);
		
        MyComparator comparator = new MyComparator();
        Collections.sort(members, comparator);
        // 혹은 members.sort(comparator);
    }
    
    public static class Member {
        public String name;
        public int age;
        public Member(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    
    public static class MyComparator implements Comparator<Member> {

        @Override
        public int compare(Member a, Member b) {
            // 이름이 같다면 나이 순 배열
            if(a.name.equals(b.name)) {
                return a.age - b.age;
            }
            // 이름이 다르다면 
            else {
                return a.name.compareTo(b.name);
            }
        }
    }
}