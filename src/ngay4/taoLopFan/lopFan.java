package ngay4.taoLopFan;

public class lopFan {
    private static final int SLOW = 1 ;
   private static final int MEDIM = 2 ;
   private static final int FAST = 3 ;

   private int speed = SLOW;
   private boolean on = false;
   private double radius =5.0;
   private String color = "blue" ;

   public lopFan () {

   }

    public lopFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(on){
            return speed + ", " +  color + ", và "+ radius + " - fan is on";
        }
        return  color + ", "+ radius + " - fan is off";
    }
}

