package client;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

import static utill.Utility.readBytes;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket socketClient = new Socket("192.168.0.109",6565);
        OutputStream outputStream = socketClient.getOutputStream();
        DataOutputStream data = new DataOutputStream(outputStream);

        byte[] bytes=readBytes("C:/Workspace/yasin.jpeg");
        data.writeInt(bytes.length);
        data.write(bytes);
        socketClient.close();

    }

}
