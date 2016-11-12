package edu.tieorange.learndatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by root on 11/12/16.
 */
public class User extends BaseObservable {
    private String mFirstName;
    private String mLastName;

    public User(String firstName, String lastName) {

        mFirstName = firstName;
        mLastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return mFirstName;
    }

    @Bindable
    public String getLastName() {
        return mLastName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
