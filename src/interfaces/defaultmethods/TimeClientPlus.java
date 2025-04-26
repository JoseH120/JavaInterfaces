package interfaces.defaultmethods;

import java.time.*;

/**
 * Suppose that you want to add new functionality to the "TimeClient" interface,
 * such as the ability to specify a time zone through a "ZoneDateTime" object
 * (Which is like a "LocalDateTime" object except that it stores time zone
 * information)
 */
public interface TimeClientPlus extends TimeClient{

    /**
     * Following this modification to the "TimeClient" interface
     * you would also have to modifiy the class "SimpleTimeClient"
     * and implement the method getZonedDateTime. However, rather than 
     * leaving "getZonedDateTime as abstract () you can instead define
     * a default implementation.
     */
    
    static ZoneId getZoneId(String zoneString){
        try{
            return ZoneId.of(zoneString);
        }catch(DateTimeException e){
            System.err.println("Invalid time zone: " + zoneString + "; using default time zone instead.");
            return ZoneId.systemDefault();
        }
    }
    default ZonedDateTime getZonedDateTime(String zoneString){
        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
    }
}
