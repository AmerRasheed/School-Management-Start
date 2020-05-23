package org.example;

import org.example.data.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    private Student testObjectStudent;

    @Before
    public void setUp() throws Exception {
        testObjectStudent = new Student("Test field1","Test field2","Test field3");

    }

    @Test
    public void test_check_Fruit_class_fields_are_correct() {
        Assert.assertEquals(1,testObjectStudent.getStudentId());
        Assert.assertEquals("Test field1",testObjectStudent.getName());
        Assert.assertEquals("Test field2",testObjectStudent.getEmail());
        Assert.assertEquals("Test field3",testObjectStudent.getAddress());

    }
}
