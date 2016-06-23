package com.company;

import java.util.Scanner;

/**
 * Created by peteraguilar on 6/20/16.
 */

public class Computer {
    private Scanner scanner = new Scanner(System.in);
    private String board;
    private String OS;
    private String processor;

    public Computer(String board, String OS, String processor) {
        this.board = board;
        this.OS = OS;
        this.processor = processor;
    }


    private void bootUp(){
        System.out.println("Booting System");
        System.out.println("--");
        System.out.println("------");
        System.out.println("-------------");
        System.out.println("Beep Beep Boop");
        System.out.println(" ");
    }

    public void powerOn(){
        bootUp();
        robotUI();

    }

    public void direction(String direction){
        System.out.println("What direction?");
        move(scanner.nextLine());
    }

    public void askQuestion(){
        System.out.println("What is your question?");
        answerQuestion(scanner.nextLine());
    }


    public void turnOff(){
        System.out.println("Beep beep booooop...");
    }

    private void robotUI(){
        System.out.println(  "===========================\n" +
                "Please choose a command\n" +
                "===========================\n" +
                "0: move\n" +
                "1: ask question\n" +
                "2: shutdown\n" );
    }


    private int move(String direction){
        System.out.println("Moving " + direction + " " + "- - - - ->");
        return - 5;
    }



    private void answerQuestion(String question){
        System.out.println("beep, boop, beep, beep");
    }


    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
