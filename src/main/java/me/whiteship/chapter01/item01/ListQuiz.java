package me.whiteship.chapter01.item01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListQuiz {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(100);
        numbers.add(20);
        numbers.add(44);
        numbers.add(3);

        System.out.println(numbers);

        Comparator<Integer> desc = (o1, o2) -> o2 - o1;

        // 인터페이스에 default 메소드 로 제공 하고 있다.
        // 인터페이스에 default 메소스 생성시 참조
        // dafult 메소드는 인스턴스(desc) 를 가지고 사용한다.
        numbers.sort(desc.reversed());

        System.out.println(numbers);
    }
}
