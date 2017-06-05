package edu.khasang.semiphore;

/**
 * Created by Abakyr on 02.06.2017.
 */
public class Thread1 implements Runnable {
    private ThreadController threadController;

    public Thread1(ThreadController threadController) {
        this.threadController = threadController;
    }

    public void run() {
        threadController.executeThread1();
        threadController.setCoordinator(2);
    }
}
