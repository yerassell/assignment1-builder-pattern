public class OfflineCourseBuilder implements CourseBuilder{
    private final Course course = new Course();

    public CourseBuilder name(String name) {course.setName(name);return this;}
    public CourseBuilder instructor(String instructor) {course.setInstructor(instructor);return this;}
    public CourseBuilder courseType(String courseType) {course.setCourseType(courseType);return this;}
    public CourseBuilder credits(int credits) {course.setCredits(credits);return this;}
    public CourseBuilder schedule(String schedule) {course.setSchedule(schedule);return this;}
    
    public OfflineCourseBuilder roomNumber(String roomNumber) {
        course.setRoomNumber(roomNumber);
        return this;
    }
    public OfflineCourseBuilder computersAvailable(boolean computersAvailable) {
        course.setComputersAvailable(computersAvailable);
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
        if (course.getRoomNumber() == null || course.getRoomNumber().isEmpty()){
            throw new IllegalStateException("Classroom number is required");
        }
        return course;
    }

}
