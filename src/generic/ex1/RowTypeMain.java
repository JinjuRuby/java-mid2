package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox<>();
        //GenericBox<Object> intgerBox = new GenericBox<>(); //권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
