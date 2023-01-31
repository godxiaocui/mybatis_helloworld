package com.czh.mybatis.pojo;

public class User {

    private Integer Id;

    private String Username;

    private String Password;

    private Integer Age;

    private String Gender;

    private String Email;

    public User() {
    }

    public User(Integer id, String username, String password, Integer age, String gender, String email) {
        Id = id;
        Username = username;
        Password = password;
        Age = age;
        Gender = gender;
        Email = email;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        this.Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", age=" + Age +
                ", Gender='" + Gender + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
