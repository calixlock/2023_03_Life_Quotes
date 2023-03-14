package com.ll;

import java.util.Scanner;

public class App {
    void run() {

        System.out.println("== 명언 ==");

        while (true) {
            System.out.printf("명령) ");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine();
            if (cmd.equals("종료")) {
                break;
            }


        }
    }
}