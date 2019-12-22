package demo5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 字节流读取文件
 */
public class BufferReadeFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file.txt");

        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        BufferedReader br = new BufferedReader(isr);

        String b;
        while ((b = br.readLine()) != null) {
            System.out.println(b);
        }
        br.close();
    }
}
