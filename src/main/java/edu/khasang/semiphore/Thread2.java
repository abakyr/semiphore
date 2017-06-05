package edu.khasang.semiphore;

/**
 * Created by Abakyr on 02.06.2017.
 */
public class Thread2 implements Runnable {
    private ThreadController threadController;

    public Thread2(ThreadController threadController) {
        this.threadController = threadController;
    }

    public void run() {
        threadController.executeThread2();
        threadController.setCoordinator(3);
    }
}
