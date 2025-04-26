package interfaces.defaultmethods;

public class Test1 {
    public static void main(String ...args){
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println(myTimeClient.toString());
    }
    
}
