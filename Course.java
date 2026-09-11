public class Course {
    private String name;
    private String instructor;
    private String courseType;          //lecture or practice
    private int credits;
    private String schedule;            //date and time: Monday 14:00
    //Offline Courses Format
    private String  roomNumber;         //C1.3.140
    private boolean computersAvailable;
    //Online Courses Format
    private String platform;            //Microsoft Teams or learn.astanait.edu.kz
    private String meetingLink;
    private boolean recordingAvailable;

    public Course(String name, String instructor, String courseType, int credits, String schedule, String roomNumber, boolean computerAvailable, String platform, String meetingLink, boolean recordingAvailable){
        this.name = name;
        this.instructor = instructor;
        this.courseType = courseType;
        this.credits = credits;
        this.schedule = schedule;
        this.roomNumber = roomNumber;
        this.computersAvailable = computerAvailable;
        this.platform = platform;
        this.meetingLink = meetingLink;
        this.recordingAvailable = recordingAvailable;
    }

    public String getName(){return name;}
    public String getInstructor(){return instructor;}
    public String getCourseType(){return courseType;}
    public int getCredits(){return credits;}
    public String getSchedule(){return schedule;}
    public String getRoomNumber(){return roomNumber;}
    public boolean isComputersAvailable(){return computersAvailable;}
    public String getPlatform(){return platform;}
    public String getMeetingLink(){return meetingLink;}
    public boolean isRecordingAvailable(){return recordingAvailable;}

    public void setName(String name) {this.name = name;}
    public void setInstructor(String instructor) {this.instructor = instructor;}
    public void setCourseType(String courseType) {this.courseType = courseType;}
    public void setCredits(int credits) {this.credits = credits;}
    public void setSchedule(String schedule) {this.schedule = schedule;}
    public void setRoomNumber(String roomNumber) {this.roomNumber = roomNumber;}
    public void setComputersAvailable(boolean computersAvailable) {this.computersAvailable = computersAvailable;}
    public void setPlatform(String platform) {this.platform = platform;}
    public void setMeetingLink(String meetingLink) {this.meetingLink = meetingLink;}
    public void setRecordingAvailable(boolean recordingAvailable) {this.recordingAvailable = recordingAvailable;}

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", courseType='" + courseType + '\'' +
                ", credits=" + credits +
                ", schedule='" + schedule + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", computersAvailable=" + computersAvailable +
                ", platform='" + platform + '\'' +
                ", meetingLink='" + meetingLink + '\'' +
                ", recordingAvailable=" + recordingAvailable +
                '}';
    }
}
