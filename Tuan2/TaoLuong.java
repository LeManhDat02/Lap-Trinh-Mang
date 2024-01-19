package com.mycompany.javaapplication.Tuan2;

/**
 *
 * @author DatNgu
 */
// Bài 1
public class TaoLuong extends Thread {
    @Override
    public void run() {
        System.out.println("Luong bat dau chay");
    }

    public static void main(String[] args) {
        // Tao luong
        TaoLuong myThread = new TaoLuong();
        // Bat dau luong
        myThread.start();
    }
}
