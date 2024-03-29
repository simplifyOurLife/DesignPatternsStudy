package com.local.simplefactory;

/**
 * 用户
 *
 * @Author: qyf
 * @Date: 2019-7-10 14:39
 * @Description: 用户
 */
public class User {

    private String name;

    private String gender;

    private int age;

    public User() {
    }

    public User(User user) {
        this.name = user.getName();
        this.gender = user.getGender();
        this.age = user.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
