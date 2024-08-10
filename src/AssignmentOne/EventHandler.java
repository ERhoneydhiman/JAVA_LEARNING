package AssignmentOne;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventHandler {
    private static boolean isDateConflict(ArrayList<Event> list, Event newEvent) {
        for (Event event : list) {
            if (event.getDate().equals(newEvent.getDate())) {
                return true;
            }
        }
        return false;
    }

    public static boolean addEvent(ArrayList<Event> list, Event newEvent){
        if (isDateConflict(list, newEvent)){
            return false;
        }
        list.add(newEvent);
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Event> events = new ArrayList<>();

        Event e1 = new Event(101, "bday", "meerut", LocalDate.of(2024, 8, 7));
        Event e2 = new Event(102, "wedding", "delhi", LocalDate.of(2024, 8, 9));
        Seminar s1 = new Seminar(103, "physics seminar", "noida", LocalDate.of(2024, 9, 2), 5);
        Seminar s2 = new Seminar(104, "cs seminar", "delhi", LocalDate.of(2024, 9, 2), 5);
        Seminar s3 = new Seminar(105, "AI seminar", "delhi", LocalDate.of(2024, 9, 6), 5);

        ArrayList< String > performerlist1 = new ArrayList<>();
        performerlist1.add("raj");
        performerlist1.add("aman");
        performerlist1.add("rajkumar");
        MusicPerformance m1 = new MusicPerformance(106, "disco", "mumbai", LocalDate.of(2024, 6, 8), performerlist1);

        System.out.println(addEvent(events, e1));
        System.out.println(addEvent(events, s2));
        System.out.println(addEvent(events, e2));
        System.out.println(addEvent(events, s1));
        System.out.println(addEvent(events, s3));
        System.out.println(addEvent(events, m1));



        for (Event i: events){
            System.out.println("----------------------------");
            System.out.println(i);
        }
            System.out.println("----------------------------");

    }
}
