package org.example;

import org.example.data.Course;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CourseTest {
    private Course testObjectCourse;

    @Before
    public void setUp() throws Exception {
        //testObjectCourse = new Course(1,"Test field1","Test field2",new Student("c","a","b"));

    }
   // Student<List> obj= expected;
    @Test
    public void test_check_Fruit_class_fields_are_correct() {
        Assert.assertEquals(1,testObjectCourse.getCourseId());
        Assert.assertEquals("Test field1",testObjectCourse.getCourseName());
        Assert.assertEquals(2,testObjectCourse.getWeekDuration());
      //  Assert.assertEquals(,testOb);

    }
}
