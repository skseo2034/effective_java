package me.whiteship.chapter01.item08.cleaner;

import java.util.List;

public class BigObject {

    private List<Object> resource;

    public BigObject(List<Object> resource) {
        this.resource = resource;
    }

    // inner class 로 만들려면 반드시 static 으로 만들어야 한다.
    // 그리고 절대로 BigObject 클래스에 대한 레퍼런스가 있으면 안된다.
    // 가비지 컬렉션 시 실행이 되는데.. 레퍼런스가 있으면, 다시 만들어 질수 있다.
    // 권장하는 방법은 이것이 아니라. Autocloseable 를 구현하는 것이다.
    public static class ResourceCleaner implements Runnable {

        private List<Object> resourceToClean;

        public ResourceCleaner(List<Object> resourceToClean) {
            this.resourceToClean = resourceToClean;
        }

        @Override
        public void run() {
            resourceToClean = null;
            System.out.println("cleaned up.");
        }
    }
}
