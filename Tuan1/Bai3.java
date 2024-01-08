
package com.mycompany.javaapplication;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;


public class Bai3 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> netInterfaces = NetworkInterface.getNetworkInterfaces();

            while (netInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = netInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();

                while (inetAddresses.hasMoreElements()) {
                    InetAddress address = inetAddresses.nextElement();
                    System.out.println("Interface: " + networkInterface.getName() + "; Dia chi IP: " + address.getHostAddress());
                }
            }
        } catch (Exception e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}