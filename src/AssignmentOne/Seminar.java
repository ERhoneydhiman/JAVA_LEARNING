package AssignmentOne;

import java.time.LocalDate;

public class Seminar extends Event{

    int no_of_speaker;


    public Seminar(int id, String event_name, String location, LocalDate date, int no_of_speaker) {
        super(id, event_name, location, date);
        this.no_of_speaker = no_of_speaker;
    }

    @Override
    public String toString() {
        return "\tSeminar\t"+"\nID:"+id+"\nEvent name: "+event_name+"\nLocation: "+location+"\nDate: "+date+"\nNo of speaker: "+no_of_speaker;
    }
}
