package com.dipanshu.surprise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //If first time login OR user details are missing
//        boolean firstTimeLoginORdetailsMissing = true;
        //WRITE LOGIC TO UPDATE THE FIRST TIME LOGIN VARIABLE
        //TODO
//        if(firstTimeLoginORdetailsMissing){
//            Intent updateUserProfile = new Intent(getApplicationContext(),UpdateProfileActivity.class);
//            startActivity(updateUserProfile);
//            finish();
//        }

        //get student name from server
        //TODO
        String studentName = "DEFAULT_NAME".toUpperCase();
        TextView userName = findViewById(R.id.dashboardUserName);
        userName.setText(studentName);

        Button createTest = findViewById(R.id.dashboardCreateTest);
        createTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
                //CHECK if this user has already created a test or not
//                if(testAlreadyCreated){
//                    CardView testAlreadyActivePOPUP = findViewById(R.id.dashboardTestActivePOPUP);
//                    testAlreadyActivePOPUP.setVisibility(View.VISIBLE);
//                    //TODO
//                    //get id and password of the active test session from the server
//                    TextView id = findViewById(R.id.dashboardTestActiveID);
//                    id.setText("1234");
//                    TextView password = findViewById(R.id.dashboardTestActivePassword);
//                    password.setText("1234");
//                    return;
//                }
                Intent createTestActivity = new Intent(getApplicationContext(), CreateTestActivity.class);
                startActivity(createTestActivity);
            }
        });


        findViewById(R.id.dashboardTestActiveButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.dashboardTestActivePOPUP).setVisibility(View.GONE);
            }
        });

        Button joinTest = findViewById(R.id.dashboardJoinTest);
        joinTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent joinTestActivity = new Intent(getApplicationContext(), JoinTestActivity.class);
                startActivity(joinTestActivity);
            }
        });

        //get enrollment number from server
        //TODO
        String enrollmentNumber = "XXXXXXXXXX".toUpperCase();
        TextView enrollmentNumberTextView = findViewById(R.id.dashboardUserEnrollmentNumber);
        enrollmentNumberTextView.setText(enrollmentNumber);

        FrameLayout editProfile = findViewById(R.id.dashboardEditProfile);
        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editProfileActivity = new Intent(getApplicationContext(),UpdateProfileActivity.class);
                startActivity(editProfileActivity);
            }
        });

        Button historyButton = findViewById(R.id.dashboardHistoryButton);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historyActivity = new Intent(getApplicationContext(), TestHistoryActivity.class);
                startActivity(historyActivity);
            }
        });
    }
}