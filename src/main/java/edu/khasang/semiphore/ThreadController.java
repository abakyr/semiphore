package edu.khasang.semiphore;

public class ThreadController {
    private volatile int coordinator = 1;

    public void setCoordinator(int coordinator) {
        this.coordinator = coordinator;
    }

    public synchronized void executeGreenThread() {
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

    public synchronized void executeYellowThread() {
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

    public synchronized void executeRedThread() {
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
