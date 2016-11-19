package com.example.raamkumr.firebaselistadapter;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by RaamKumr on 11/19/2016.
 */
public class FirebaseListAdapter extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
