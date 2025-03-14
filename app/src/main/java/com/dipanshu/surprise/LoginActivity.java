package com.dipanshu.surprise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText emailEditText = findViewById(R.id.loginActivityEmail);
        EditText passwordEditText = findViewById(R.id.loginActivityPassword);
        Button loginButton = findViewById(R.id.loginActivityButton);
        TextView forgotPassword = findViewById(R.id.loginActivityForgotPassword);
        TextView newUser = findViewById(R.id.loginActivityNewUser);
        TextView errorMessage = findViewById(R.id.loginActivityErrorMessage);

        //Clicked on new user
        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
            }
        });

        //Clicked on forgot password
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
            }
        });

        //Clicked on login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
                if(emailEditText.getText().toString().equals("dipanshunamdev799@gmail.com") && passwordEditText.getText().toString().equals("1234")){
                    Intent dashboard = new Intent(LoginActivity.this,Dashboard.class);
                    startActivity(dashboard);
                    finish();
                }else{
                    errorMessage.setText("Something Went Wrong!");
                }
            }
        });
    }
}