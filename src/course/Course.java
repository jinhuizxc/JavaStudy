package course;

public class Course {

    public int course_id;
    public String course_title;

    public Course(int course_id, String course_title) {
        this.course_id = course_id;
        this.course_title = course_title;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_id=" + course_id +
                ", course_title='" + course_title + '\'' +
                '}';
    }
}
