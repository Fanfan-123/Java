package www.stream;

import java.io.*;

public class ByteStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File(File.separator+"E:"+File.separator
                +"picture"+File.separator+"666"+File.separator+"888"+File.separator+"write.txt");
        if (file.exists()){
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int len = inputStream.read(bytes);
            String str = new String(bytes,0,len);
            System.out.println("读取内容："+str);
            inputStream.close();
        }
    }
}
