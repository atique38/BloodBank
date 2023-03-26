package com.android.iunoob.bloodbank.activities;

public class GetterSetter {
    String roll,bloodGroup;
    

    public GetterSetter(String roll, String bloodGroup) {
        this.roll = roll;
        this.bloodGroup = bloodGroup;
    }


    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
