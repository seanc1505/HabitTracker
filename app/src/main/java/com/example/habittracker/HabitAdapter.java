package com.example.habittracker;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class HabitAdapter extends RecyclerView.Adapter<HabitAdapter.HabitViewHolder> {

    private List<Habit> habitList;

    // Constructor to initialize the list of habits
    public HabitAdapter(List<Habit> habitList) {
        this.habitList = habitList;
    }

    // ViewHolder class to hold the views for each habit item
    public static class HabitViewHolder extends RecyclerView.ViewHolder {
        public TextView habitNameTextView;
        public TextView habitDescriptionTextView;
        public Button button1;
        public Button button2;
        public Button button3;

        public HabitViewHolder(View itemView) {
            super(itemView);
            habitNameTextView = itemView.findViewById(R.id.habitNameTextView);
            habitDescriptionTextView = itemView.findViewById(R.id.habitDescriptionTextView);
            button1 = itemView.findViewById(R.id.button1);
            button2 = itemView.findViewById(R.id.button2);
            button3 = itemView.findViewById(R.id.button3);
        }
    }

    @NonNull
    @Override
    public HabitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.habit_item, parent, false);
        return new HabitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HabitViewHolder holder, int position) {
        Habit habit = habitList.get(position);
        holder.habitNameTextView.setText(habit.getName());
        holder.habitDescriptionTextView.setText(habit.getDescription());
        holder.button1.setText(habit.getButton1Label());
        holder.button2.setText(habit.getButton2Label());
        holder.button3.setText(habit.getButton3Label());

        // You can also set click listeners for the buttons here if needed
    }

    public void test(){
        Log.i("TEST","here i am");
    }

    @Override
    public int getItemCount() {
        return habitList.size();
    }
}