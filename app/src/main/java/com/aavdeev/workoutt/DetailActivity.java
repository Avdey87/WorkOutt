package com.aavdeev.workoutt;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity {

    public static final String EXTRA_WORKOUT_ID = "id";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        WorkoutDetailFragment workoutDetailFragment = (WorkoutDetailFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        workoutDetailFragment.setWorkoutID(workoutId);
    }
}
