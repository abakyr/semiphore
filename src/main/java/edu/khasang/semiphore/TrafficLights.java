package edu.khasang.semiphore;

import java.util.Scanner;

public class TrafficLights {

    public static void main(String[] args) throws InterruptedException {
        TrafficLights tl = new TrafficLights();
        int n = tl.start();
        tl.trafficLights(n);
    }

    private static int start() {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter current time: ");
        number = sc.nextInt();
        return number;
    }

    private static void trafficLights(int n) throws InterruptedException {
        int wholeNumber = n/10;
        int fraction = n%10;

        if (wholeNumber > 0) {
            int i = 0;
            while (i < wholeNumber) {
                ThreadController tc = new ThreadController();
                Thread1 t1 = new Thread1(tc);
                Thread2 t2 = new Thread2(tc);
                Thread3 t3 = new Thread3(tc);
                new Thread(t1).start();
                Thread.sleep(1000);
                new Thread(t2).start();
                Thread.sleep(2000);
                new Thread(t3).start();
                Thread.sleep(3000);
                i++;
            }
        }
        
        Thread.sleep(100);
        if (fraction > 0) {
            if (fraction <= 2) {
                ThreadController tc = new ThreadController();
                Thread1 t1 = new Thread1(tc);
                new Thread(t1).start();
                Thread.sleep(1000);
            } else if (fraction >= 3 && fraction <= 5) {
                ThreadController tc = new ThreadController();
                Thread1 t1 = new Thread1(tc);
                Thread2 t2 = new Thread2(tc);
                new Thread(t1).start();
                Thread.sleep(1000);
                new Thread(t2).start();
                Thread.sleep(2000);
            } else {
                ThreadController tc = new ThreadController();
                Thread1 t1 = new Thread1(tc);
                Thread2 t2 = new Thread2(tc);
                Thread3 t3 = new Thread3(tc);
                new Thread(t1).start();
                Thread.sleep(1000);
                new Thread(t2).start();
                Thread.sleep(2000);
                new Thread(t3).start();
                Thread.sleep(3000);
            }
        }

    }
}