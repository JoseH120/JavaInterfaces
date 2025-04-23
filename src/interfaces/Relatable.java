package interfaces;
public interface Relatable {
    // this (object calling isLargerThan
    // and other must be instances of
    // the same class returns 1, 0, -1
    // if this is greater than,
    // equal to, or less than other
    public int isLargerThan(Relatable other);
    
    /**
     * Any class can implement "Relatable" if there is some way to 
     * compare the relative "size" of objects instantiated from the
     * class. 
     * For Strings, it could be number of characters; for books, it
     * could be number of pages; for Students, it could be the weight,
     * and so forth:
     * For planar geometric objects, area would be a good choice 
     * While volume would work for three-dimensional geometric objects.
     * All such classes can implements the isLargerThan() method.
     * If you know that a class implements Relatable, then you know
     * that you can compare the size of the objects instantiated from
     * that class.
     */
}
