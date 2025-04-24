package interfaces.objects;

import interfaces.Relatable;

public class ImplementingInterface {

    public static Object findLargest(Object object1, Object object2) {
        Relatable obj1 = (Relatable) object1;
        Relatable obj2 = (Relatable) object2;
        if ((obj1).isLargerThan(obj2) > 0) {
            return object1;
        } else {
            return object2;
        }
    }

    public static Object findSmallest(Object object1, Object object2) {
        Relatable obj1 = (Relatable) object1;
        Relatable obj2 = (Relatable) object2;
        if ((obj1).isLargerThan(obj2) < 0) {
            return object1;
        } else {
            return object2;
        }
    }

    public static boolean isEqual(Object object1, Object object2) {
        Relatable obj1 = (Relatable) object1;
        Relatable obj2 = (Relatable) object2;
        if ((obj1).isLargerThan(obj2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Implementation of interface Relatable");
        RectanglePlus rp1 = new RectanglePlus(new Point(0, 0), 200, 100);
        RectanglePlus rp2 = new RectanglePlus(new Point(100, 200), 200, 200);

        System.out.print("printing the area of the rectangle 1: ");
        System.out.println(rp1.getArea());

        System.out.print("printing the area of the rectangle 2: ");
        System.out.println(rp2.getArea());

        System.out.print("The greater area of the rectangle is: ");
        RectanglePlus large = (RectanglePlus) findLargest(rp1, rp2);
        System.out.println(large.getArea());
        
        System.out.print("The smallest are of the rectangle is: ");
        RectanglePlus small = (RectanglePlus) findSmallest(rp1, rp2);
        System.out.println(small.getArea());
        
        System.out.print("The areas are equals? ");
        System.out.println(isEqual(rp1, rp2));

    }

}
