package mthree.com.fullstackschool.dao;

import mthree.com.fullstackschool.model.Course;

import java.util.List;

public interface CourseDao {

    Course createNewCourse(Course course);

    List<Course> getAllCourses();

    Course findCourseById(int id);

    void updateCourse(Course course);

    void deleteCourse(int id);

    void deleteAllStudentsFromCourse(int courseId);
}
