package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class YearAdapter extends ArrayAdapter<Year> {
    private ArrayList<Year> year;
    private Context context;
    private TextView tvYear;

    public YearAdapter(Context context, int resources, ArrayList<Year> objects) {
        super(context, resources, objects);
        year = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvYear = (TextView) rowView.findViewById(R.id.tvYear);

        Year currYear = year.get(position);
        tvYear.setText(currYear.getYear());

        return rowView;
    }
}
