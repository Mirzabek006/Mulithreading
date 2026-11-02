package org.example;

import java.net.Socket;

public class DaemondThread extends Thread{
    public void run(){
        while (true){
            System.out.println("Deamond thread ishlayapti");
        }
    }

}
