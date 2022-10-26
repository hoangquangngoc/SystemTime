package ngay17;

import java.io.Serializable;

public class Lop implements Serializable {
    private int id;
    private String name_lop;

    public Lop() {
    }

    public Lop(int id, String name_lop) {
        this.id = id;
        this.name_lop = name_lop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name_lop;
    }

    public void setName(String name_lop) {
        this.name_lop = name_lop;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name_lop + '\'' +
                '}';
    }
}
