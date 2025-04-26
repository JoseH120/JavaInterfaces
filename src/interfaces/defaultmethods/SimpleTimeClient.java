package interfaces.defaultmethods;

import java.time.*;

public class SimpleTimeClient implements TimeClientPlus {

    private LocalDateTime dateAndTime;

    public SimpleTimeClient() {
        this.dateAndTime = LocalDateTime.now();
    }

    @Override
    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        this.dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }

    @Override
    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(this.dateAndTime);
        this.dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }

    @Override
    public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        this.dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }

    @Override
    public LocalDateTime getLocalDateTime() {
        return this.dateAndTime;
    }

    @Override
    public String toString() {
        return this.dateAndTime.toString();
    }

}
