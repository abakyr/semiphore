package edu.khasang.semiphore;


public class GreenLight implements Runnable {
    private ThreadController threadController;

    public GreenLight(ThreadController threadController) {
        this.threadController = threadController;
    }

    public void run() {
        threadController.executeGreenThread();
        threadController.setCoordinator(2);
    }
}
