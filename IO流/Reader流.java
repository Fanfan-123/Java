public class ByteStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File(File.separator+"E:"+File.separator
                +"picture"+File.separator+"666"+File.separator+"888"+File.separator+"write.txt");
        if (file.exists()){
           Reader reader = new FileReader(file);
           char[] c = new char[30];
           int len = reader.read(c);
           String s = new String(c,0,len);
            System.out.println(s);
            reader.close();
        }
    }
}
