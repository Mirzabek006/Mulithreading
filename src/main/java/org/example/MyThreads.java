package org.example;

public class MyThreads extends Thread{
    public MyThreads(String name){
        setName(name);//Mazmunli nom berish
    }
    public void run(){
        System.out.println("Thread ishlayapti"+getName());
        if (getName().equals("DataLoader")){
            throw new RuntimeException("Ma'lumot yuklashda xatolik mavjud");
        }else {
            System.out.println("Muvaffaqiyatli ishladi");
        }
    }
}
