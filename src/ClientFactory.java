import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientFactory implements  Runnable{

    public ClientFactory(String string, Socket clientSocket) throws IOException {
        Thread thread = new Thread();
        thread.start();
        System.out.println("start");
        if(string.equals("index.html")) {
            OutputStream out = null;

            out = clientSocket.getOutputStream();

            out.write("HTTP/1.0 200 OK Follows\r\n".getBytes());
            out.write("\r\n".getBytes());
            out.write("<H1>Welcome to the best webSite in the world BITCHES!<H1>".getBytes());
            out.write("\r\n".getBytes());
            out.write("<p>response Header on the way...wait for it.....keep waiting<p>".getBytes());



        }
        if(string.equals("text")){
            OutputStream out = clientSocket.getOutputStream();
            out.write("HTTP/1.0 200 OK Follows\r\n".getBytes());
            out.write("\r\n".getBytes());
            out.write("<H1>Welcome to the best webSite in the world BITCHES!<H1>".getBytes());
            out.write("\r\n".getBytes());
            out.write("<p>response Header on the way...wait for it.....keep waiting<p>".getBytes());


        }
        if(string.equals("image")){
            OutputStream out = clientSocket.getOutputStream();
            out.write("HTTP/1.0 200 OK Follows\r\n".getBytes());
            out.write("\r\n".getBytes());
            out.write("<H1> era muito fixe que uma imagem aparecesse<H1>".getBytes());
            out.write("<img src=\"https://st.depositphotos.com/2170303/2736/i/600/depositphotos_27361601-stock-photo-very-old-woman-showing-her.jpg\" alt=\"Middle Finger\">".getBytes());


        }
        if(!string.equals("text")&&!string.equals("image")&&!string.equals("")&&!string.equals("index.html")){
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            out.write("HTTP/1.0 404 Not Found \r\n".getBytes());
            out.write("\r\n".getBytes());
            out.write("<p> 404 file not found!BItch".getBytes());
            out.write("<img src=\"https://www.meme-arsenal.com/memes/8e09492fce9d770286f91f6c7e1ab12d.jpg\" alt=\"Middle Finger\">".getBytes());



        }
    }

    @Override
    public void run() {


    }
}
