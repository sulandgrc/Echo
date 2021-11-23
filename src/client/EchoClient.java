package client;

import java.net.*;
import java.io.*;
import java.util.*;
import server.*;

public class EchoClient {

    public static void main(String[] args) {

        try(Socket s = new Socket("localhost",EchoServer.ECHO_PORT );
           Scanner console = new Scanner(System.in)){

            // send to server with a PrintWriter
            PrintWriter sendToServer = new PrintWriter(s.getOutputStream(), true);

            // receive echo back with Scanner
            Scanner readFromServer = new Scanner(s.getInputStream());

            // prompt user
            System.out.print("Enter some text to send to server: ");
            sendToServer.println(console.nextLine());

            // receive the echo from the Server
            while(readFromServer.hasNextLine()){
                System.out.println(readFromServer.nextLine());
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
