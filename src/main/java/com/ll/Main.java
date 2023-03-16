package com.ll;

import java.util.Scanner;

import static com.ll.Container.sc;

public class Main {
    public static void main(String[] args) {
        Container.init();
        App v6 = new App();
        v6.run();
//        new App().run();
        Container.close();
    }

}


