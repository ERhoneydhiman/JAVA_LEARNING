package AssignmentOne;

import java.time.LocalDate;
import java.util.ArrayList;

public class MusicPerformance extends Event{
    ArrayList<String> performer_list;


    public MusicPerformance(int id, String event_name, String location, LocalDate date, ArrayList<String> performer_list) {
        super(id, event_name, location, date);
        this.performer_list = performer_list;
    }

    @Override
    public String toString() {
        return "\tMusic Concert\t"+
                "\nID:"+id+
                "\nEvent name: "+event_name+
                "\nLocation: "+location+
                "\nDate: "+date+
                "\nPerformers: "+ performer_list.toString();
    }
}
