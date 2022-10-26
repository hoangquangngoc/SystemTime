package ngay14.baitaptrenlop;

import java.util.Scanner;

public class Oto extends Phuongtiengiaothong{
    private int sochongoi;
    private String kieudongco;

    public Oto() {
    }

    public Oto(int sochongoi, String kieudongco) {
        this.sochongoi = sochongoi;
        this.kieudongco = kieudongco;
    }

    public Oto(int id, String hangsanxuat, int namsanxuat, double giaban, String color, int sochongoi, String kieudongco) {
        super(id, hangsanxuat, namsanxuat, giaban, color);
        this.sochongoi = sochongoi;
        this.kieudongco = kieudongco;
    }

    public int getSochongoi() {
        return sochongoi;
    }

    public void setSochongoi(int sochongoi) {
        this.sochongoi = sochongoi;
    }

    public String getKieudongco() {
        return kieudongco;
    }

    public void setKieudongco(String kieudongco) {
        this.kieudongco = kieudongco;
    }

    @Override
    public String toString() {
        return super.toString() +
                "sochongoi=" + sochongoi +
                ", kieudongco='" + kieudongco + '\'' ;
    }

}
