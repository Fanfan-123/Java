package www.file;

import java.io.File;
import java.io.IOException;

public class FileTest{
    public static void main(String[] args) {
               File file = new File(File.separator+"E:"+File.separator
                +"picture"+File.separator+"666"+File.separator+"888"+File.separator+"test2.java");
               if (! file.getParentFile().exists()){
                   file.getParentFile().mkdirs();
               }
               if (file.exists()){
                   file.delete();
               }else {
                   try {
                       file.createNewFile();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }

    }

}
