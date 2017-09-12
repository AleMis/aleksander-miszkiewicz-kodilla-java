package com.kodilla.stream.formuser;

import java.time.LocalDate;

public class FormUser {

    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthData;
    private final int postsNumber;

    public FormUser(int userID, String userName, char sex, int year, int month, int day, int postsNumber) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthData = LocalDate.of(year, month, day);
        this.postsNumber = postsNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthData() {
        return birthData;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "FormUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthData=" + birthData +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
