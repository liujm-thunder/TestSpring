package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by liujianmeng on 16/9/14.
 */
public class NioBuffer {

    public static void main(String[] args) {
        try {
            nioCopyFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void nioCopyFile() throws IOException{
        FileInputStream fis  = new FileInputStream("/Users/liujianmeng/input.txt");
        FileOutputStream fos = new FileOutputStream("/Users/liujianmeng/output.txt");
        FileChannel readChannel = fis.getChannel();
        FileChannel writeChannel = fis.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true){
            buffer.clear();
            int len = readChannel.read(buffer);
            if (len==-1){
                break;
            }
            buffer.flip();
            writeChannel.write(buffer);
        }

        readChannel.close();
        writeChannel.close();
    }
}
