package com.petsbook.gianni.petsbook;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Gianni on 2016/5/16.
 */
public class PetsBookApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
//        Parse.initialize(this,"com.petsbook.gianni.petsbook",);
        Parse.initialize(this,"cAUrbKXQ8qfg59UhwAMS8C4H2L4t5hbNlHdI0Qbu","HrV7aLUT9U7DOPFluSejMSOiyB6tFsjGIkJqeQyZ");


//        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
//                .applicationId("com.petsbook.gianni.petsbook")
//                .server("http://YOUR_PARSE_SERVER:1337/parse")
//                .build()
//        );

    }
}
