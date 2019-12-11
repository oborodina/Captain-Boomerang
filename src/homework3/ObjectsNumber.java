package homework3;

public class ObjectsNumber {

    public static void main (String[] args) {

        Some firstObject = new Some();

        Some secondObject = new Some();

        System.out.println(Some.count);

    }
}

class Some {
    static int count;

    public Some () {
        count++;
    }
}