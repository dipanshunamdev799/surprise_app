package com.dipanshu.surprise;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewJoinedTests extends RecyclerView.Adapter<RecyclerViewJoinedTests.ViewHolder> {
    Context context;
    ArrayList<JoinedTest> list;
    RecyclerViewJoinedTests(Context context, ArrayList<JoinedTest> list){
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public RecyclerViewJoinedTests.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewJoinedTests.ViewHolder holder, int position) {

    }
    public static  class ViewHolder extends RecyclerView.ViewHolder{
        Button viewDetails;
        TextView yourScore;
        TextView classAverage;
        TextView deadline;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
