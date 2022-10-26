package ngay6.baitaptrenlop;

public class Fulltime extends quanLi{
    private int salary;

    public Fulltime() {
        this.salary = salary;
    }

    public Fulltime(int id, String name, int age, String address, int salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void showSalary(){
        System.out.println(salary);
    }

    @Override
    public String toString() {
        return super.toString()+"Fulltime{" +
                "salary=" + salary +
                '}';
    }

        public String show(){
        return "1000"+ this.getId()+"abcd"+this.getName()+"21"+this.getAddress()+"hà nội"+this.getAddress()+"lương"+getSalary();

    }
}
