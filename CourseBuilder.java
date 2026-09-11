public interface CourseBuilder {
    void setName(String name);
    void setInstructor (String instructor);
    void setCourseType(String courseType);
    void setCredits(int credits);
    void setSchedule(String schedule);
    Course build();
}
