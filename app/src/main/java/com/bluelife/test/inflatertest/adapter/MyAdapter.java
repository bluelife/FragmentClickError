package com.bluelife.test.inflatertest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bluelife.test.inflatertest.R;

/**
 * Created by HiWin10 on 2016/4/26.
 */
public class MyAdapter extends ArrayAdapter<String> {
    private Context context;
    private final String[] values;

    public MyAdapter(Context context, String[] values) {
        super(context, -1, values);
        this.context = null;
        this.values = values;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) LayoutInflater.from(context);
        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.text_label);
        textView.setText(values[position]);
        // change the icon for Windows and iPhone

        return rowView;
    }
}
