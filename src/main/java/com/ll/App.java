package com.ll;

import java.util.Scanner;

public class App {
    Scanner sc;
    public App(Scanner sc){
        this.sc = sc;
    }
    public void run() {

        while (true) {
            System.out.printf("명령) ");


            String cmd = sc.nextLine().trim(); // trim() : 좌우 공백 제거
            if (cmd.equals("종료")) {
                break;
            }


        }
    }
}