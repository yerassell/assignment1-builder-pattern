public class OnlineCourseBuilder implements CourseBuilder{
    private Course course;
    private String platform;
    private String meetingLink;
    private boolean recordingAvailable;

    public OnlineCourseBuilder() {
        course = new Course();
    }

    public CourseBuilder name(String name) {
        course.setName(name);
        return this;
    }
    public CourseBuilder instructor(String instructor) {course.setInstructor(instructor);return this;}
    public CourseBuilder courseType(String courseType) {course.setCourseType(courseType);return this;}
    public CourseBuilder credits(int credits) {course.setCredits(credits);return this;}
    public CourseBuilder schedule(String schedule) {course.setSchedule(schedule);return this;}

    public OnlineCourseBuilder platform(String platform) {
        this.platform = platform;
        course.setPlatform(platform);
        return this;
    }
    public OnlineCourseBuilder meetingLink(String meetingLink) {
        this.meetingLink = meetingLink;
        course.setMeetingLink(meetingLink);
        return this;
    }
    public OnlineCourseBuilder recordingAvailable(boolean recordingAvailable) {
        this.recordingAvailable = recordingAvailable;
        course.setRecordingAvailable(recordingAvailable);
        return this;
    }

    public Course build(){
        return course;
    }

}
