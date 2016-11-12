package edu.tieorange.learndatabinding;

/**
 * Created by root on 11/12/16.
 */
public class User {
    private final String mFirstName;
    private final String mLastName;

    public User(String firstName, String lastName) {

        mFirstName = firstName;
        mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }
}
