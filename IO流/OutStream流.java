package www.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File(File.separator+"E:"+File.separator
                +"picture"+File.separator+"666"+File.separator+"888"+File.separator+"write.txt");
        if (! file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        OutputStream outputStream = new FileOutputStream(file);
        String str = "helloworld";
        outputStream.write(str.getBytes());
        outputStream.close();
    }
}
