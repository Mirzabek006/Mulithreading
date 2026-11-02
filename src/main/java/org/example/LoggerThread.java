package org.example;

public class LoggerThread extends Thread{
    public void run(){
        while (true){
            System.out.println("Log"+System.currentTimeMillis());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
