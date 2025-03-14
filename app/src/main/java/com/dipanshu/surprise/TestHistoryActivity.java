package com.dipanshu.surprise;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_test_history);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        CardView historyPopUp = findViewById(R.id.historyPopUp);
        Button createTest = findViewById(R.id.historyPopUpCreateTest);
        Button joinTest = findViewById(R.id.historyPopUpJoinTest);

        final int[] selected = {-1};

        createTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                historyPopUp.setVisibility(View.GONE);
                //TODO
                ArrayList<JoinedTest> list  = new ArrayList<>();
                //while creating test object also update the questions and answers of the test in the object
                JoinedTest test = new JoinedTest("1998-12-23",20,23);
                test.questions = new ArrayList<>();
                test.questions.add("abc");
                test.questions.add("bcd");
                test.answers = new ArrayList<>();
                test.answers.add("A");
                test.answers.add("B");
                list.add(test);
                //recycler view of join created tests
                RecyclerView recyclerView = findViewById(R.id.testHistoryRecyclerView);
                recyclerView.setLayoutManager(new LinearLayoutManager(TestHistoryActivity.this));
                RecyclerViewJoinedTests recyclerViewJoinedTests = new RecyclerViewJoinedTests(TestHistoryActivity.this,list);
                recyclerView.setAdapter(recyclerViewJoinedTests);
            }
        });
        joinTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                historyPopUp.setVisibility(View.GONE);
                //TODO
                //recycler view of joined tests
            }
        });


    }
}