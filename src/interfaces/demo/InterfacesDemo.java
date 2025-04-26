package interfaces.demo;

public class InterfacesDemo {

    public static void main(String... args) {
        System.out.println("""
INTERFACES
In software engineering when it is important for disparate groups of
programmers to agree to a "Contract" that spells out how their software
interacts.
Each group should be able to write their code without any knowledge of 
how  the other group's code is written.
Generally speaking, "interfaces" are such contracts.
""");
        System.out.println("""
DEFINING AN INTERFACE                           
public interface GroupedInterface extends Interface1, Interface2, Interface3{
// constant declarations
                           
// base of natural logarithms
double E = 2.718282;

// Method signatures
void doSomething(int i, double x);
int doSomethingElse(String s);                           
}
""");
    }

}
