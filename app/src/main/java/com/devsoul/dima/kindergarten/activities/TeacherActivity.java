package com.devsoul.dima.kindergarten.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.devsoul.dima.kindergarten.R;

/**
 * Teacher Main Activity screen
 */
public class TeacherActivity extends Activity
{
    private TextView txtGan;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        //txtGan = (TextView) findViewById(R.id.gan);


        //String KinderGan = user.get("KinderGan_name");
        //txtGan.setText(KinderGan);
    }
}
