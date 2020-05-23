package org.example.data;

import java.util.Objects;

public class Student {
    public static int counter=0;
    private int StudentId;
    private String name;
    private String email;
    private String address;

    public Student(String name, String email, String address) {
        this.StudentId=++counter;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentId() == student.getStudentId() &&
                Objects.equals(getName(), student.getName()) &&
                Objects.equals(getEmail(), student.getEmail()) &&
                Objects.equals(getAddress(), student.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), getName(), getEmail(), getAddress());

    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
