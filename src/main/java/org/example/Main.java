package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        MyThreads logger=new MyThreads("LoggerThread");
        MyThreads dataLoader=new MyThreads("DataLoader");
        logger.start();
        dataLoader.start();


//        MyThread thread=new MyThread();
//        MyThread thread1=new MyThread();
//        System.out.println("thread1 standart nomi:"+thread.getName());//Thread-0 nomi 1
//        System.out.println("thread2 standart nomi"+thread1.getName());//Thread-1 nomi
//        thread.setName("Birinchi thread");
//        thread1.setName("Ikkinchi thread ");
        //        LoggerThread logger=new LoggerThread();
//        logger.setDaemon(true);
//        logger.start();
//        try {
//            Thread.sleep(5000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        System.out.println("Main tugadi");
//        DaemondThread daemondThread=new DaemondThread();
//        daemondThread.setDaemon(true);
//        daemondThread.start();
//        System.out.println("Main thread tugadi.");
    }
}
