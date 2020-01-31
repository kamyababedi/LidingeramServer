package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class LidingeramServer {

     static Socket s;
     static ServerSocket ss;
     static InputStreamReader isr;
     static BufferedReader br;
     static String message;

    public static void main(String[] args) {


        try {
            ss = new ServerSocket(4000);

            System.out.println("1");
            while(true) {
                s = ss.accept();
                System.out.println("2");
                isr = new InputStreamReader(s.getInputStream());
                br = new BufferedReader(isr);
                message = br.readLine();

                System.out.println(message);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
