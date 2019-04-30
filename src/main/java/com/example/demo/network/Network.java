package com.example.demo.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network {

    public static void main(String [] args){
        InetAddress host = null;
        try {
            host = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String hostAddress = host.getHostAddress();
        System.out.println(hostAddress);

    }

}
