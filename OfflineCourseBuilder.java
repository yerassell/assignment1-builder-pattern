public class OfflineCourseBuilder implements CourseBuilder{
    private Course course;
    private String roomNumber;
    private boolean computerAvailable;
    public OfflineCourseBuilder() {
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
    public OfflineCourseBuilder roomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
        course.setRoomNumber(roomNumber);
        return this;
    }
    public OfflineCourseBuilder computerAvailable(boolean computerAvailable) {
        this.computerAvailable = computerAvailable;
        course.setComputersAvailable(computerAvailable);
        return this;
    }

    public Course build(){
        return course;
    }

}
