package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 ==");
        Scanner sc = new Scanner(System.in);
        App v3 = new App(sc);
        v3.run();

        sc.close();
    }

}


