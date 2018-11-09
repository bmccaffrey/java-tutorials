public class AutoBoxer {
    Integer integerWrapperObject;
    int actualInteger;

    public void oops() {
        actualInteger = integerWrapperObject;
        System.out.println(actualInteger);
        System.out.println(integerWrapperObject);
    }

    public void implicitConversion() {
        integerWrapperObject = actualInteger;
        System.out.println(actualInteger);
        System.out.println(integerWrapperObject);
    }


}
