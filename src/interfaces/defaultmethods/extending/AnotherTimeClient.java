package interfaces.defaultmethods.extending;

import interfaces.defaultmethods.TimeClientPlus;
import java.time.ZonedDateTime;
/**
 * When you extend an interface that contains a default method, you can do
 * the following 
 *  1. Not mention the default method at all. Which lets your 
 * extended interface inherit the default method.
 *  2. Redeclare the default method, which makes it abstract.
 *  3. Redefine the default method, which overrides it.
 */
public interface AnotherTimeClient extends TimeClientPlus {

    @Override
    public ZonedDateTime getZonedDateTime(String zoneString);
    
}
