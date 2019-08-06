package www.file;

import javafx.scene.chart.PieChart;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest{
    public static void main(String[] args) {
        File file = new File(File.separator+"E:"+File.separator
                +"picture"+File.separator+"666"+File.separator+"888");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        //取得文件信息
        //保证是文件且文件存在
        if (file.isFile() && file.exists()){
            //取得文件大小
            System.out.println("文件大小："+file.length());
            //获得文件上一次修改时间
            System.out.println("上一次修改日期："+new Date(file.lastModified()));
        }
        //取得目录信息
        //取出目录中的全部组成
        //保证是目录且目录存在
        if (file.exists() && file.isDirectory()){
            //列出文件中的全部组成
            File[] results = file.listFiles();
            for (File f : results){
                System.out.println(f);
            }
        }
    }
}
