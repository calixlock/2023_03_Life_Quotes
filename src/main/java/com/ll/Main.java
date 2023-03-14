package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        app_v1 test = new app_v1();
        test.run();
    }

}
class app_v1 {
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

class app_vx {
    void run(){
        System.out.println("== 명언 ==");
    }
}


