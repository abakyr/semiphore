package edu.khasang.semiphore;

/**
 * Created by Abakyr on 02.06.2017.
 */
public class ThreadController {
    private volatile int coordinator = 1;

    public void setCoordinator(int coordinator) {
        this.coordinator = coordinator;
    }

    public synchronized void executeThread1() {
        while(coordinator != 1) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Green light is On!");
        notifyAll();
        coordinator = 2;
    }

    public synchronized void executeThread2() {
        while(coordinator != 2) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Yellow light is On!");
        notifyAll();
        coordinator = 3;
    }

    public synchronized void executeThread3() {
        while(coordinator != 3) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Red light is On!");
    }
}
