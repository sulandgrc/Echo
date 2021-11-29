package client;

import server.MathServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MathClient {
    public static void main(String[] args) {

        try(Socket s = new Socket("localhost", MathServer.MATH_PORT );
            Scanner console = new Scanner(System.in)){

            // send to server with a PrintWriter
            PrintWriter sendToServer = new PrintWriter(s.getOutputStream(), true);

            // receive echo back with Scanner
            Scanner readFromServer = new Scanner(s.getInputStream());

            // prompt user
            System.out.print("Enter two numbers separated by a space: ");
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
