public class OnlineCourseBuilder implements CourseBuilder{
    private final Course course = new Course();

    public CourseBuilder name(String name) {course.setName(name);return this;}
    public CourseBuilder instructor(String instructor) {course.setInstructor(instructor);return this;}
    public CourseBuilder courseType(String courseType) {course.setCourseType(courseType);return this;}
    public CourseBuilder credits(int credits) {course.setCredits(credits);return this;}
    public CourseBuilder schedule(String schedule) {course.setSchedule(schedule);return this;}

    public OnlineCourseBuilder platform(String platform) {
        course.setPlatform(platform);
        return this;
    }
    public OnlineCourseBuilder platformLink(String platformLink) {
        course.setPlatformLink(platformLink);
        return this;
    }
    public OnlineCourseBuilder recordingAvailable(boolean recordingAvailable) {
        course.setRecordingAvailable(recordingAvailable);
        return this;
    }

    public Course build(){
        if (course.getName() == null || course.getName().isEmpty()){
            throw new IllegalStateException("Course name is required");
        }
        if (course.getInstructor() == null || course.getInstructor().isEmpty()){
            throw new IllegalStateException("Instructor is required");
        }
        if (course.getSchedule() == null || course.getSchedule().isEmpty()){
            throw new IllegalStateException("Course schedule is required");
        }
        if (course.getPlatformLink() == null || course.getPlatformLink().isEmpty()){
            throw new IllegalStateException("Link to the platform is required");
        }
        return course;
    }

}
