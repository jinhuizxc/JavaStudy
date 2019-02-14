package course;

import java.util.List;

public class CourseEntity {

    public int date;
    public List<Course> list;


    public CourseEntity(int date, List<Course> course) {
        this.date = date;
        this.list = course;
    }


    @Override
    public String toString() {
        return "CourseEntity{" +
                "date=" + date +
                ", list=" + list +
                '}';
    }
}
