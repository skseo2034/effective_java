package me.whiteship.chapter01.item06;

import java.util.regex.Pattern;

public class RegularExpression {

    private static final Pattern SPLIT_PATTERN = Pattern.compile(",");

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int j = 0; j < 10000; j++) {
            String name = "keesun,whiteship";
            name.split(","); // 콤마가 하나 일때는 내부적으로 하나일때 처리 방시이 있어서 그냥 처리하는게 나을 수 잇다. 다만 여러개 일때는 아래 처럼 패턴을 만들어서 사용하라.
//            SPLIT_PATTERN.split(name);
        }
        System.out.println(System.nanoTime() - start);
    }
}
