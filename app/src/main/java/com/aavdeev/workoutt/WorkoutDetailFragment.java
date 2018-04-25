package com.aavdeev.workoutt;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WorkoutDetailFragment extends Fragment {

    private long workoutID;
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         if (savedInstanceState != null) {
             workoutID = savedInstanceState.getLong("workoutID");
         }
         return inflater.inflate(R.layout.fragment_workout_detail, container, false);

     }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Workout workout = Workout.workout[(int) workoutID];
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putLong("workoutID",workoutID);
    }

    public void setWorkoutID(long workoutID) {
        this.workoutID = workoutID;
    }
}
