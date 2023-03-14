package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 ==");
        Scanner sc = new Scanner(System.in);
        App v5 = new App(sc);
        v5.run();

        sc.close();
    }

}


