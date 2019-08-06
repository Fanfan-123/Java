package www.filecopy;

import java.io.*;

class FileCopyUtil {
    //构造方法私有化
    private FileCopyUtil() {
    }

    //判断源文件存在
    public static boolean sourceFileIsExists(String sourcePath) {
        File sourceFile = new File(sourcePath);
        return sourceFile.exists();
    }

    //判断目标文件的父路径是否存在，不存在的话创建目录
    public static void createParentDir(String destPath) {
        File destFile = new File(destPath);
        if (!destFile.getParentFile().exists()) {
            destFile.getParentFile().mkdirs();
        }
    }

    public static boolean fileCopy(String sourcePath, String descPath) throws IOException {
        File inFile = new File(sourcePath);
        File outFile = new File(descPath);
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(inFile);
            outputStream = new FileOutputStream(outFile);
            byte[] bytes = new byte[1024];
            int len = 0;
            long start =  System.currentTimeMillis();
            while ((len = inputStream.read(bytes)) != -1){
                outputStream.write(bytes,0,len);
            }
            long end = System.currentTimeMillis();
            System.out.println("拷贝文件所花费的时间："+(end-start));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }finally {
            inputStream.close();
            outputStream.close();
        }
        //每次从源文件读取数据同时也向目标文件输出数据
        return true;
    }

}

public class FileCopy {
    public static void main(String[] args) throws IOException {

        String sourcePath = File.separator+"E:"+File.separator
                +"picture"+File.separator+"666"+File.separator+"888"+File.separator+"write.txt";
        String destPath = File.separator+"E:"+File.separator
                +"picture"+File.separator+"666"+File.separator+"888"+File.separator+"test2.txt";
        if (FileCopyUtil.sourceFileIsExists(sourcePath)){
            FileCopyUtil.createParentDir(destPath);
            if (FileCopyUtil.fileCopy(sourcePath,destPath)){
                System.out.println("文件拷贝成功");
            }else {
                System.out.println("文件拷贝失败");
            }
        }else{
            System.out.println("文件不存在");
        }
    }
}
