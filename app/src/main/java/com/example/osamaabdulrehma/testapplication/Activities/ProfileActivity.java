package com.example.osamaabdulrehma.testapplication.Activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.osamaabdulrehma.testapplication.R;

public class ProfileActivity extends AppCompatActivity {

    private TextView usernameTextView;
    private TextView userEmailTextView;
    private TextView userPhoneTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        setTitle("Profile");

        SharedPreferences sharedPref = getSharedPreferences("MY_PREFS", Context.MODE_PRIVATE);

        String username = sharedPref.getString(getString(R.string.user_name), null);
        String useremail = sharedPref.getString(getString(R.string.user_email), null);
        String userphone = sharedPref.getString(getString(R.string.user_phone), null);

        if(username != null && useremail != null && userphone != null){
            usernameTextView = (TextView) findViewById(R.id.usernameTextView);
            userEmailTextView = (TextView) findViewById(R.id.useremailTextView);
            userPhoneTextView = (TextView) findViewById(R.id.userphoneTextView);

            usernameTextView.setText(username);
            userEmailTextView.setText(useremail);
            userPhoneTextView.setText(userphone);
        }
        //else{
//            Toast.makeText(this, "Values: " + username + " " + useremail + " " + userphone, Toast.LENGTH_LONG).show();
//        }
    }
}
