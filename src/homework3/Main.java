package homework3;

public class Main {

    public static void main (String[] args) {
        ObjectsNumber firstObject = new ObjectsNumber();
        ObjectsNumber firstObject1 = new ObjectsNumber();
        ObjectsNumber secondObject = new ObjectsNumber();
        Car lada = new Car("Lada", 60);

        Car mazda = new Car("mazda", 130);

        System.out.println(ObjectsNumber.getCount());
        System.out.println(CircleArea.calculateArea());
        lada.carStart();
        lada.carGo();
        lada.carStop();
        mazda.carStart();
        mazda.carGo();
        mazda.carStop();

    }
}
