package com.example.model;

public class Student {
    String username;
    String password;

    Course course;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", course=" + course +
                '}';
    }

    public static class Course {
        int math;
        int chinese;
        int english;

        public int getMath() {
            return math;
        }

        public void setMath(int math) {
            this.math = math;
        }

        public int getChinese() {
            return chinese;
        }

        public void setChinese(int chinese) {
            this.chinese = chinese;
        }

        public int getEnglish() {
            return english;
        }

        public void setEnglish(int english) {
            this.english = english;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "math=" + math +
                    ", chinese=" + chinese +
                    ", english=" + english +
                    '}';
        }
    }
}
