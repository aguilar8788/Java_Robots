package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        Computer computer = new Computer("Raspberry Pi", "Raspbian", "Arm");
        Battery battery = new Battery("Lipo", 4, "24v", "DC");
        Frame frame = new Frame("Inconel", "grey/blue");
        TransMechanism mech = new TransMechanism("standard", 3, "articulator servo motors");

	    RSeries R2D2 = new RSeries(computer, frame, battery, mech, 1.09, 2, "Photoreceptor", "Electroshock Prod", "Data Probe", "Small Saw", "Life Form Scanner");

        R2D2.getComputer().powerOn();

        while(!quit){
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    R2D2.getComputer().direction("forward");
                    break;
                case 1:
                    R2D2.getComputer().askQuestion();
                    break;
                case 2:
                    R2D2.getComputer().turnOff();
                    quit = true;
                    break;
                default:
                    System.out.println("Please enter a valid command");

            }

        }
    }
}
