public class main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeedFast();
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeedMedium();
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("fan1: "+fan1.toString());
        System.out.println("fan2: "+fan2.toString());
    }
}
