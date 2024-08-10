package AssignmentOne;

import java.time.LocalDate;

public class Event {
//    26. Write a Java program to create a class called "Event" with attributes for
//    event name, date, and location. Create subclasses "Seminar" and
//    "MusicalPerformance" that add specific attributes like number of speakers for
//    seminars and performer list for concerts. Implement methods to display event
//    details and check for conflicts in the event schedule.
//    related classes: MusicPerformer, Seminar, EventHandler(main)

    String event_name;
    String location;
    LocalDate date;
    int id;

    public Event(int id, String event_name, String location, LocalDate date){
        this.date = date;
        this.event_name = event_name;
        this.location = location;
        this.id = id;
    }

    public LocalDate getDate(){
        return this.date;
    }
    public int getID(){
        return this.id;
    }


    @Override
    public String toString() {
        return "ID:"+id+"\nEvent name: "+event_name+"\nLocation: "+location+"\nDate: "+date;
    }
}
