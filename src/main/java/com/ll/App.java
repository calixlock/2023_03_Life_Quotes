package com.ll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class App {
    final Scanner sc;
    long lastTextNumber = 0;
    List<textBook> textBooks = new ArrayList<>();
    public App(Scanner sc){
        this.sc = sc;
    }
    public void run() {
        while (true) {
            System.out.printf("명령) ");
            String cmd = sc.nextLine().trim(); // trim() : 좌우 공백 제거
            if (cmd.equals("종료")) {
                break;
            }else if (cmd.equals("등록")) {
                long id = lastTextNumber + 1;
                System.out.printf("명언 : ");
                String text = sc.nextLine().trim();
                System.out.printf("작가 : ");
                String authorName = sc.nextLine().trim();

                textBook book = new textBook(id, text, authorName);
                textBooks.add(book);
//                HashMap<String, String> textBook = new HashMap<String, String>();
//                textBook.put(text.toString(),authorName.toString());
                lastTextNumber = id;
                System.out.printf("%d번 명언이 등록되었습니다.\n",lastTextNumber);
            }else if (cmd.equals("목록")) {
//                System.out.printf("생성된 명언 수 : %d\n", textBooks.size());
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-".repeat(30));

                for (int i = textBooks.size() -1; i >=0; i--){
                    textBook read_textbook = textBooks.get(i);

                    System.out.printf("%d / %s / %s\n",read_textbook.getId(),read_textbook.getAuthorName(),read_textbook.getText());
                }
            }else if (cmd.equals("삭제")) {
                System.out.printf("몇 번 명언을 삭제하시겠습니까? : \n");
                int id = sc.nextInt();
            }

        }
    }
}