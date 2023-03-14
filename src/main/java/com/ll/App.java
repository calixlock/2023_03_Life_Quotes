package com.ll;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    final Scanner sc;
    private long lastTextNumber = 1;
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
            else if (cmd.equals("등록")) {
                System.out.printf("명언 : ");
                String text = sc.nextLine().trim();
                System.out.printf("작가 : ");
                String author = sc.nextLine().trim();

                HashMap<String, String> textBook = new HashMap<String, String>();
                textBook.put(text.toString(),author.toString());
                System.out.printf("%d번 명언이 등록되었습니다.\n",lastTextNumber);
                lastTextNumber++;
            }
        }
    }
}