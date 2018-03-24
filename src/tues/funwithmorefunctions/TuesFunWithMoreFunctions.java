package tues.funwithmorefunctions;

/**
 *
 * @author john
 */
public class TuesFunWithMoreFunctions {
    
    public static void printFoo() {
        System.out.println("Foo");
    }
    
    public static void printFoo2(String prefix) {
        prefix = prefix + " Foo";
//        System.out.println(prefix + " Foo");
        System.out.println(prefix);
    }
    
    public static int doubleIt(int x) {
        return x * 2;
    }
    
    public static double doubleIt(double x) {
        return x * 2;
    }
    
    public static String doubleIt(String x) {
        return x + x;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String bar = "Bar";
        int y = 2;
        double z = 2.0;
        Point myPoint1 = new Point();
        Point myPoint2 = new Point();
        Point myPoint3 = new Point();
        
        printFoo();
        printFoo2(bar);
        System.out.println(bar);
        
//        y = doubleIt(y);
        System.out.println(doubleIt(y));
        System.out.println(doubleIt(z));
        System.out.println(doubleIt("wat"));
        System.out.println(y);
        
        System.out.println(myPoint1);
        System.out.println(myPoint1.getX());
        
        myPoint1.setX(5);
        
        System.out.println(myPoint1.getX());
        
        mutateXToTen(myPoint2);
        
        System.out.println(myPoint2.getX());
    }
    
    public static void mutateXToTen(Point p) {
        p.setX(10);
    }
    
}

class Point {
    private int x = 1;
    int y = 2;
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getX() {
        return x;
    }
}