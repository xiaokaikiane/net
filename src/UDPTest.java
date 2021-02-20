import org.junit.Test;

import java.io.IOException;
import java.net.*;

public class UDPTest {
    //发送端
    @Test
    public void sender() throws IOException {
        DatagramSocket socket=new DatagramSocket();
        String s="我是你爸爸";
        byte[] bytes=s.getBytes();
        InetAddress inetAddress=InetAddress.getLocalHost();
        DatagramPacket packet=new DatagramPacket(bytes,0,bytes.length,inetAddress,9090);
        socket.send(packet);
        socket.close();
    }

    //接收端
    @Test
    public void receiver() throws IOException {
        DatagramSocket socket=new DatagramSocket(9090);
        byte[] bytes=new byte[100];
        DatagramPacket packet=new DatagramPacket(bytes,0,bytes.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        socket.close();
    }
}
