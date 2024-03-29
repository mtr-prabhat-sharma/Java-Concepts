/**
 * Multithreading is a Java feature that allows concurrent execution of two or more
   parts of a program for maximum utilization of CPU. Each part of such program is
   called a thread. So, threads are light-weight processes within a process.

 * Threads can be created by using two mechanisms :
 * Extending the Thread class
 * Implementing the Runnable Interface
 */
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i < 40000) {
            System.out.println("Thread 1 runninggggggggggggggggggggggggggggggg ");
            i++;
        }

    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i < 40000) {
            System.out.println("Thread 2 running !");
            i++;
        }
    }
}

public class MultithreadingUsingThreadClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
