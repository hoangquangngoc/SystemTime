//package ngay17;
//
//import java.io.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//
//public class IOHoc_Vien {
//   static File file = new File("HocVien.txt");
//
//    public static void write(ArrayList<HocVien>hocViens){
//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter =  new BufferedWriter(fileWriter);
//            for (HocVien hv:hocViens) {
//                bufferedWriter.write(hv.getName()+","+hv.getAge()+","+hv.getGender()+","+hv.getPhone()+","+hv.getBirirthday()+","+hv.getLop());
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//            fileWriter.close();
//        } catch (IOException e) {
//         e.fillInStackTrace();
//        }
//    }
//    public static ArrayList<HocVien> read() {
//        ArrayList<HocVien> hocViens = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String str = bufferedReader.readLine();   //gán str = giá trị của dòng
//            while (str != null) {
//                String[] arr = str.split(",");  // tách dấu phẩy
//                String name = arr[0];
//                int age = Integer.parseInt(arr[1]);
//                String gender = arr[2];
//                String phone = arr[3];
//                Date date = null;
//                String birthday = arr[4];
//                try {
//                    date = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
//                    break;
//                } catch (ParseException e) {
//                    e.fillInStackTrace();
//
//                }
//                int id = Integer.parseInt(arr[5]);
//                String name_lop = arr[6];
//                Class lop = new Class(id, name_lop)
//                HocVien hocVien = new HocVien(name, age, gender, phone, date, lop);
//                hocViens.add(hocVien);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//    }
//}
