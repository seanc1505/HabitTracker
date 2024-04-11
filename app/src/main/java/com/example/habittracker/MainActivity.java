package com.example.habittracker;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HabitAdapter habitAdapter;
    private List<Habit> habitList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the list of habits
        habitList = new ArrayList<>();
        // Add your habits dynamically here, you can fetch them from a database or define them in code
        habitList.add(new Habit("Exercise", "Go for a run", "Button 1", "Button 2", "Button 3"));
        habitList.add(new Habit("Read", "Read a book", "Button 1", "Button 2", "Button 3"));
        // Add more habits as needed

        // Create and set the adapter
        habitAdapter = new HabitAdapter(habitList);
        recyclerView.setAdapter(habitAdapter);
    }
}
