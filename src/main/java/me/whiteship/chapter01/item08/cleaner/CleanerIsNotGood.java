package me.whiteship.chapter01.item08.cleaner;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class CleanerIsNotGood {

    public static void main(String[] args) throws InterruptedException {
        Cleaner cleaner = Cleaner.create();

        List<Object> resourceToCleanUp = new ArrayList<>();
        BigObject bigObject = new BigObject(resourceToCleanUp);

        // 어떤 자원이 gc 가 될때 이렇게 자원을 해제 하라고 지시한다.
        cleaner.register(bigObject, new BigObject.ResourceCleaner(resourceToCleanUp));

        bigObject = null;
        System.gc();
        Thread.sleep(3000L);
    }

}
