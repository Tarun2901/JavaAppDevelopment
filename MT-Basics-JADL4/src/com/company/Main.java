package com.company;

public class Main {

    //first way of creating thread by extending java.lang.thread
    public static void main(String[] args) throws InterruptedException {
	// write your code here
//        MyThread thread = new MyThread();
//        thread.run();
//        thread.start();
        MyThread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(3000);
        //thread.calculate();
       // System.out.println("I am in thread : "+ Thread.currentThread().getName());
    }

    private static class MyThread extends Thread{
        @Override
        public void run()
        {
            System.out.println("I am in thread : "+ currentThread().getName());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I am in thread : "+ currentThread().getName());
          //  calculate();
        }

        public void calculate()
        {   int sum = 0;
            for(int i = 0;i<100;i++)
            {
                sum+=i;
            }
            System.out.println(sum);
        }
    }
//    public static class MyThread extends Thread{
//        @Override
//        public void run()
//        {
//            //whatever written here will be run
//            System.out.println("I am in thread: "+ currentThread().getName()+ " Thread ID: "+ currentThread().getId());
//        }
//    }

}
