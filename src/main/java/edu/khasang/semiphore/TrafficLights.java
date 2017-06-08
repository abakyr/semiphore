package edu.khasang.semiphore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLights {
    public static void main(String[] args) throws InterruptedException {
        TrafficLights trafficLights = new TrafficLights();
        int input = trafficLights.start();
        trafficLights.traffic(input);
    }

    private static int start() {
        int number = 0;
        System.out.println("Please enter current time: ");
        try (BufferedReader reader =  new BufferedReader( new InputStreamReader(System.in))) {
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }

    private static void traffic(int input) throws InterruptedException {
        int wholeNumber = input/10;
        int fraction = input%10;

        if (wholeNumber > 0) {
            int i = 0;
            while (i < wholeNumber) {
                ThreadController controller = new ThreadController();
                GreenLight greenLight = new GreenLight(controller);
                YellowLight yellowLight = new YellowLight(controller);
                RedLight redLight = new RedLight(controller);
                new Thread(greenLight).start();
                Thread.sleep(1000);
                new Thread(yellowLight).start();
                Thread.sleep(2000);
                new Thread(redLight).start();
                Thread.sleep(3000);
                i++;
            }
        }
        
        Thread.sleep(100);
        if (fraction > 0) {
            if (fraction <= 2) {
                ThreadController controller = new ThreadController();
                GreenLight greenLight = new GreenLight(controller);
                new Thread(greenLight).start();
                Thread.sleep(1000);
            } else if (fraction >= 3 && fraction <= 5) {
                ThreadController controller = new ThreadController();
                GreenLight greenLight = new GreenLight(controller);
                YellowLight yellowLight = new YellowLight(controller);
                new Thread(greenLight).start();
                Thread.sleep(1000);
                new Thread(yellowLight).start();
                Thread.sleep(2000);
            } else {
                ThreadController controller = new ThreadController();
                GreenLight greenLight = new GreenLight(controller);
                YellowLight yellowLight = new YellowLight(controller);
                RedLight redLight = new RedLight(controller);
                new Thread(greenLight).start();
                Thread.sleep(1000);
                new Thread(yellowLight).start();
                Thread.sleep(2000);
                new Thread(redLight).start();
                Thread.sleep(3000);
            }
        }
    }
}