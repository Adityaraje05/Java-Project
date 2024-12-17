package com.pojo;

public class Patient {
    public static final String hospitalName = "Ruby hall";
    private int pid;
    private String name;
    private int age;
    private String gender;

    public Patient(int pid) {
        super();
        this.pid = pid;
    }

    public Patient(int pid, String name, int age, String gender) {
        super();
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Patient [pid=" + pid + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static String getHospitalname() {
        return hospitalName;
    }


}
