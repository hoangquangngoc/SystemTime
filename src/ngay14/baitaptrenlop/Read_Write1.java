package ngay14.baitaptrenlop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Read_Write1 {

        File file = new File("D:\\intellij\\demo\\demo\\src\\ngay14\\baitaptrenlop\\phuongtien1.txt");



    public void write(ArrayList<Phuongtiengiaothong>phuongtiengiaothongs){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Phuongtiengiaothong pt : phuongtiengiaothongs){
                bufferedWriter.write(pt.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
