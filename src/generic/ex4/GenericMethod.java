package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) { //Number는 숫자형(int, double)의 부모 클래스
        System.out.println("bound print: " + t);
        return t;
    }
}
