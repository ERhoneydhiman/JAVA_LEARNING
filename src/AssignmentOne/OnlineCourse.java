package AssignmentOne;

public class OnlineCourse extends Course{
    String platform;
    Double duration;

    public OnlineCourse(String courseName, String instructor, Double credits, String platform, Double duration) {
        super(courseName, instructor, credits);
        this.duration = duration;
        this.platform = platform;
    }


    public String displayCourse(){
        return "\tOnline Course\t"+
                "\nCourse name: "+courseName+
                "\nInstructor: "+instructor+
                "\nFees: "+credits+
                "\nPlatform: "+platform+
                "\nDuration: "+duration+" Hours";
    }
}
