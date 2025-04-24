package interfaces.evolving;

/**
 * Consider an interface that you have developed called DoItDemo
 */
public interface DoItDemo {

    public void doSomething(int i, double x);

    public int doSomethingElse(String s);

    /**
     * Suppose that, at a later time, you want to add a thir method to DoItDemo,
     * so that the interface now becomes
      
     * public boolean didItWork(int i, double x, String s);

     * If you make this change, then all classes that implements the 
     * old DoItDemo interface will break because they no longer implement
     * the old interface. Programmers relying on this interface will
     * protest loudly. 
     */
    
    /**
     * Alternatively, you can define you new methods as DefaultMethods
     * The following example defines a default method named didItWork
     */
    public default boolean didItWork2(int i, double x, String s){
        return false;
    }
    
    /**
     * You could also define new "static methods" to existing interfaces
     * Users who have classes that implement interfaces enhanced with new
     * default or static methods do not have to modify or recompile them
     * to accommodate the additional methods
     */
}
