package com.local.simple;


/**
 * [description]
 *
 * @Author: qyf
 * @Date: 2019-7-10 14:42
 * @Description: 说明
 */
public class UserBuilder {

    private User user;

    public UserBuilder() {
        user = new User();
    }

    public User build() {
        return user;
    }

    public UserBuilder buildName(String name) {
        user.setName(name);
        return this;
    }

    public UserBuilder buildGender(String gender) {
        user.setGender(gender);
        return this;
    }

    public UserBuilder buildAge(int age) {
        user.setAge(age);
        return this;
    }

}
