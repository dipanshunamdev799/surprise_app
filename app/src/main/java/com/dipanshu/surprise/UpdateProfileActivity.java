package com.dipanshu.surprise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UpdateProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_update_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button updateButton = findViewById(R.id.updateProfileButton);
        TextView contactTextView = findViewById(R.id.updateProfileContact);
        TextView departmentTextView = findViewById(R.id.updateProfileDepartment);
        TextView errorMessageTextView = findViewById(R.id.updateProfileError);
        TextView enrollmentNumberTextView = findViewById(R.id.updateProfileEnrollmentNumber);
        TextView userNameTextView = findViewById(R.id.updateProfileUserName);
        TextView collegeTextView = findViewById(R.id.updateProfileCollege);

        //Get all these from server side, if no data found set the data as empty string
        //TODO
        String contact = "1234567890";
        String department = "Information Technology";
        String enrollmentNumber = "0801IT221051";
        String userName = "Dipanshu Namdev";
        String college = "Shri G.S. Institiute Of Technology of Science (M.P.)";
        collegeTextView.setText(college);
        contactTextView.setText(contact);
        departmentTextView.setText(department)  ;
        enrollmentNumberTextView.setText(enrollmentNumber);
        userNameTextView.setText(userName);

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contact = contactTextView.getText().toString();
                String department  = departmentTextView.getText().toString();
                String enrollmentNumber = enrollmentNumberTextView.getText().toString();
                String userName = userNameTextView.getText().toString();
                String college = collegeTextView.getText().toString();
                System.out.println(contact);
                if(contact.isEmpty() || department.isEmpty() || enrollmentNumber.isEmpty() || userName.isEmpty() || college.isEmpty() ){
                    errorMessageTextView.setVisibility(View.VISIBLE);
                }else{
                    //Update the details on the server
                    //TODO
                    Intent dashboard = new Intent(UpdateProfileActivity.this,Dashboard.class);
                    startActivity(dashboard);
                    finish();
                }
            }
        });

    }
}