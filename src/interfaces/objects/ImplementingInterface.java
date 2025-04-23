package interfaces.objects;

import interfaces.Relatable;

public Object findLargest(Object object1, Object object2){
    Relatable obj1 = (Relatable)object1;
    Relatable obj2 = (Relatable)object2;
    if ((obj1).isLargerThan(obj2) > 0) {
        return object1;
    }
else{
return object2;
}
    return null;
}

public class ImplementingInterface {
    public static void main(String ...args){
        System.out.println("Implementation of interface Relatable");
        
    }
}
