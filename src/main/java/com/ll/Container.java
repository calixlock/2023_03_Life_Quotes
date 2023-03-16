package com.ll;

import java.util.Scanner;

public class Container {
//    method_1
//    public static final Scanner sc;
//
//    static{
//        sc = new Scanner(System.in);
//    }
//    method_2
    public static Scanner sc;
    public static void init(){
        sc = new Scanner(System.in);
    }
    public static void close(){
        sc.close();
    }
    public static Scanner getScanner() {
        return sc;
    }

}
