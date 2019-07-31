public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST =3;
    private int speed = SLOW;
    private boolean on = false;
    private  double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeedSlow() {
        this.speed = SLOW;
    }
    public void setSpeedMedium() {
        this.speed = MEDIUM;
    }
    public void setSpeedFast() {
        this.speed = FAST;
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

    public Fan(){
    }
    public String toString(){
        if(this.on)
            return "Speed: "+ this.getSpeed()+" Color: "+this.getColor()+" Radius: "+this.getRadius()+" fan is on";
        else return "Speed: "+ this.getSpeed()+" Color: "+this.getColor()+" Radius: "+this.getRadius()+" fan is off";
    }

}
