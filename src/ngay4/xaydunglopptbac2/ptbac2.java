package ngay4.xaydunglopptbac2;

public class ptbac2 {
    double a, b, c;

    public ptbac2() {

    }

    public ptbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double nghiem1(){
        if(this.delta()<0) return 0;
        return ((-b + Math.sqrt(this.delta ())) / (2 * a));
    }
    public double nghiem2(){
        if(this.delta()<0) return 0;
        return ((-b - Math.sqrt(this.delta ())) / (2 * a));
    }
}
