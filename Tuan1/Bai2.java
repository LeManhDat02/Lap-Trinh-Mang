
package com.mycompany.javaapplication;

import java.net.InetAddress;

public class Bai2 {
    public static void main(String[] args) {
        try {
            // In địa chỉ IP
            // Lấy địa chỉ IP của www.google.com
            InetAddress inet = InetAddress.getByName("www.facebook.com");
            // In địa chỉ IP
            System.err.println("Dia chi IP cua Facebook la : " + inet.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
