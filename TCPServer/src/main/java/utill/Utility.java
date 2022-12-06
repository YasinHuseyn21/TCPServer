package utill;

import lombok.SneakyThrows;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Utility {
    @SneakyThrows
    public static void writeBytes(String FileName, byte[] data)  {
        FileOutputStream outputStream = new FileOutputStream(new File(FileName));
//        byte[] contentByte=content.getBytes();
        outputStream.write(data);
        outputStream.flush();
        outputStream.close();
        System.out.println("Done");

    }
    @SneakyThrows
    public static byte[] readMessage(DataInputStream din ){
        int msgLen=din.readInt();
        byte[] msg=new byte[msgLen];
        din.readFully(msg);
        return msg;
    }
    @SneakyThrows
    public static byte[] readBytes(String fileName) throws Exception {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        byte[] byteArray = new byte[(int) new File(fileName).length()];
        inputStream.read(byteArray);
        return byteArray;


    }
}
