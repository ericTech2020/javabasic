package com.java.javabasic.thread;

public class SyncDemo {
    public static void main(String[] args) {
        SyncThread syncThread = new SyncThread();
       /* SyncThread syncThread1 = new SyncThread();
        SyncThread syncThread2 = new SyncThread();
        SyncThread syncThread3 = new SyncThread();*/
        /*Thread A_thread1 = new Thread(syncThread, "A_thread1");
        Thread A_thread2 = new Thread(syncThread, "A_thread2");
        Thread B_thread1 = new Thread(syncThread, "B_thread1");
        Thread B_thread2 = new Thread(syncThread, "B_thread2");
        Thread C_thread1 = new Thread(syncThread, "C_thread1");
        Thread C_thread2 = new Thread(syncThread, "C_thread2");*/
        Thread D_thread1 = new Thread(syncThread, "D_thread1");
        Thread D_thread2 = new Thread(syncThread, "D_thread2");

   /*     Thread D_thread3 = new Thread(syncThread2, "D_thread3");
        Thread D_thread4 = new Thread(syncThread3, "D_thread4");*/

        /*Thread E_thread1 = new Thread(syncThread, "E_thread1");
        Thread E_thread2 = new Thread(syncThread1, "E_thread2");*/
       /* A_thread1.start();
        A_thread2.start();
        B_thread1.start();
        B_thread2.start();
        C_thread1.start();
        C_thread2.start();*/
        D_thread1.start();
        D_thread2.start();
      /*  D_thread3.start();
        D_thread4.start();*/
      /*  E_thread1.start();
        E_thread2.start();*/

    }
}
