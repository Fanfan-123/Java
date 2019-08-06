public class ByteStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File(File.separator+"E:"+File.separator
                +"picture"+File.separator+"666"+File.separator+"888"+File.separator+"write.txt");
        if (file.exists()){
            Writer writer = new FileWriter(file,true);
            String str = "123456789";
            writer.write(str);
            writer.close();
        }
    }
}
