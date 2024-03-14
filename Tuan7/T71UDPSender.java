package baitaptuan7;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author dat
 */
public class T71UDPSender {
    public static void main(String[] args) {
         try {
            //tao doi tuong
            DatagramSocket socket=new DatagramSocket();
            //chuan bi du lieu gui
            byte[] data="Xin chao cac ban UDP moi".getBytes();
            //xac dinh may nhan
            InetAddress address=InetAddress.getByName("localhost");
            int port=12345;
            //tao goi du lieu UDP
            DatagramPacket packet=new
                DatagramPacket(data, data.length, address, port);
            //gui
            socket.send(packet);
            //dong ket noi
            socket.close();
        } catch (Exception e) {
        }
    }
}