package com.example.habittracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class AddTaskActivity extends AppCompatActivity {

    private HabitAdapter habitAdapter; // Declare HabitAdapter instance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        Log.i("TEST","TESTING2");
        // Obtain the HabitAdapter instance passed from MainActivity
//        habitAdapter = getIntent().getParcelableExtra("habitAdapter");
//
//        if (habitAdapter != null) {
//            // Inside AddTaskActivity after adding a new task
//            List<Habit> updatedHabitList = getUpdatedHabitList(); // Get the updated list of habits
//            habitAdapter.updateHabits(updatedHabitList); // Update the habit list in the adapter
//        }
    }

//    // Implement getUpdatedHabitList() method to retrieve the updated list of habits
//    private List<Habit> getUpdatedHabitList() {
//        // Implement your logic to obtain the updated list of habits
//        return null; // Replace this with your actual implementation
//    }
}
