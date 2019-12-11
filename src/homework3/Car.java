package homework3;

public class Car {
    public boolean go;
    public int speed;

    public static void main (String[] args) {
        Car goCar = new Car();

        goCar.carStart();
        goCar.carGo(100);
        goCar.carStop();
    }

    public void carStart () {
        go = true;
        System.out.println("Car start");
    }

    public void carStop () {
        go = false;
        System.out.println("Car stop");
    }

    public void carGo (int number) {
        if (go) {
            speed = number;
            System.out.println("Car goes" + " speed:" + speed);
        }
    }
}
