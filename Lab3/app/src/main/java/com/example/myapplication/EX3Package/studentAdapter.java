package com.example.myapplication.EX3Package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.example.myapplication.EX2Package.Contact;
import com.example.myapplication.R;

import java.util.ArrayList;

public class studentAdapter extends ArrayAdapter<Student> {
    private Context mContext;
    private ArrayList<Student> mStudents;

    public studentAdapter(Context context, ArrayList<Student> mStudents) {
        super(context, 0, mStudents);
        mContext = context;
        mStudents = mStudents;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Student student = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.studentrow, parent, false);
        }

        // Lookup view for data population
        TextView studentInfo = convertView.findViewById(R.id.studentInfo);

        // Populate the data into the template view using the data object
        String result = student.getClassID() + " " + student.getId() + " " + student.getName();
        studentInfo.setText(result);

        // Return the completed view to render on screen
        return convertView;
    }
}
