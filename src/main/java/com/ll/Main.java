package com.ll;

import java.util.Scanner;

import static com.ll.Container.sc;

public class Main {
    public static void main(String[] args) {
        // 공용 container(공간) 초기화
        Container.init();
        new App().run();
//        App v6 = new App();
//        v6.run();
        // 공용 container(공간) 자원 해제
        Container.close();
    }

}


