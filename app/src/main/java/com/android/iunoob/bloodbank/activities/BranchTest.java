package com.android.iunoob.bloodbank.activities;

public class BranchTest {
    String donor,group;

    public BranchTest(String donor, String group) {
        this.donor = donor;
        this.group = group;
    }

    public String getDonor() {
        return donor;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
