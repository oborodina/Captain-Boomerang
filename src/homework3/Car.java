package homework3;

public class Car {
    private String nameCar;
    private boolean go;
    private int speed;

    Car (String name, int speed) {
        this.nameCar = name;
        this.speed = speed;
    }

    public void carStart () {
        this.go = true;
        System.out.println(this.nameCar + " starts");
    }

    public void carStop () {
        this.go = false;
        System.out.println(this.nameCar + " stops");
    }

    public void carGo () {
        if (this.go) {
            System.out.println(this.nameCar + " goes" + " speed:" + this.speed);
        }
    }
}
