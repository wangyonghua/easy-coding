package com.wyh.easystuding.multithread;

/**
 * @author : wangyonghua
 * @date Date : 2019/12/9 19:26
 * 主线程怎么捕捉子线程异常setDefaultUncaughtExceptionHandler
 */
public class CatchException {

    public static void main(String[] args) throws InterruptedException {

        Runnable subThread = () -> {
            int i = 19, j = 0;
            System.out.println("start");
            i = i / j;
            System.out.println("end");
        };

        Thread thread = new Thread(subThread);

        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.out.println(e);
        });
        thread.start();
    }
}
