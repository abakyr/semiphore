package edu.khasang.semiphore;


public class RedLight implements Runnable {
    private ThreadController threadController;

    public RedLight(ThreadController threadController) {
        this.threadController = threadController;
    }

    public void run() {
        threadController.executeRedThread();
    }
}
