package ch1.item1;

public class item1 {

    public static void main(String[] args) {

        Boolean b = item1.ValueOf(true);

        System.out.printf("Boolean value is %b", b);
    }

//    static factory method
    public static Boolean ValueOf( boolean b ) {
        return b ? Boolean.TRUE: Boolean.FALSE;
    }
}
