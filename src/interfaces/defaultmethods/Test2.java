package interfaces.defaultmethods;

public class Test2 {

    public static void main(String... args) {
        TimeClientPlus myTimeClient = new SimpleTimeClient();
        System.out.println("Current time: " + myTimeClient.toString());
        System.out.println("Time in california: " + myTimeClient.getZonedDateTime("Blah blah").toString());
    }
}
