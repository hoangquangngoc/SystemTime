package ngay17;

import java.io.*;
import java.util.ArrayList;

public class IOLopNhi_Phan {
    static File file = new File("Lop.txt");
    public static void write(ArrayList<Lop> lops){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(lops);
        } catch (Exception e) {
           e.printStackTrace();
        }

    }
    public static ArrayList<Lop>read(){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Lop>lops = (ArrayList<Lop>) objectInputStream.readObject();
            return lops;
        } catch (Exception e) {
          e.printStackTrace();
          return new ArrayList<>();
        }
    }
}
