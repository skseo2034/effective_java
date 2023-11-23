package me.whiteship.chapter01.item07.executor;

import me.whiteship.chapter01.item01.Product;

import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // int availiableCup = Runtime.getRuntime().availableProcessors(); // 사용가능한 cpu 개수 확인
        // ExecutorService service = Executors.newFixedThreadPool(availiableCup); // cpu 갯수만큼의 threadpool  생성
        ExecutorService service = Executors.newFixedThreadPool(10);

        Future<String> submit = service.submit(new Task());

        System.out.println(Thread.currentThread() + " hello");

        System.out.println(submit.get());

        service.shutdown();
    }

    static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(2000L);
            return Thread.currentThread() + " world";
        }
    }


}
