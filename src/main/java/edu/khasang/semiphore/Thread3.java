package edu.khasang.semiphore;

/**
 * Created by Abakyr on 02.06.2017.
 */
public class Thread3 implements Runnable {
    private ThreadController threadController;

    public Thread3(ThreadController threadController) {
        this.threadController = threadController;
    }

    public void run() {
        threadController.executeThread3();
    }
}
