public interface CourseBuilder {
    CourseBuilder name(String name);
    CourseBuilder instructor (String instructor);
    CourseBuilder courseType(String courseType);
    CourseBuilder credits(int credits);
    CourseBuilder schedule(String schedule);
    Course build();
}
