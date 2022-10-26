package demokiemtramodul2;

import java.io.*;
import java.util.ArrayList;

public class IOProduct {
   static File file = new File("D:\\intellij\\demo\\demo\\src\\demokiemtramodul2\\file\\product.txt");

    public static void write(ArrayList<QuanLiSanPham>Quanli){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(Quanli);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    public static ArrayList<QuanLiSanPham>read(){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           ArrayList<QuanLiSanPham>quanLiSanPhams = (ArrayList<QuanLiSanPham>) objectInputStream.readObject();
           return quanLiSanPhams;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
