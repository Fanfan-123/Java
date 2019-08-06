package www.stream;

import java.io.*;

public class ByteStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File(File.separator+"E:"+File.separator
                +"picture"+File.separator+"666"+File.separator+"888"+File.separator+"write.txt");
        if (file.exists()){
           OutputStream out = new FileOutputStream(file);
           Writer writer = new OutputStreamWriter(out);
           String s = "bbbbbbbbbbbbbbbbb";
           writer.write(s);
           writer.close();
        }
    }
}
