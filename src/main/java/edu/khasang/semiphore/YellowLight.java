package edu.khasang.semiphore;


public class YellowLight implements Runnable {
    private ThreadController threadController;

    public YellowLight(ThreadController threadController) {
        this.threadController = threadController;
    }

    public void run() {
        threadController.executeYellowThread();
        threadController.setCoordinator(3);
    }
}
