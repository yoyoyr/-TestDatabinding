package com.example.testdatabinding;

import android.databinding.BaseObservable;

public class User extends BaseObservable {

    private String userName;
    private String userAge;

    private String doubleChangeData;

    public String getDoubleChangeData() {
        return doubleChangeData;
    }

    public void setDoubleChangeData(String doubleChangeData) {
        this.doubleChangeData = doubleChangeData;
        notifyChange();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyChange();
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge='" + userAge + '\'' +
                '}';
    }
}
