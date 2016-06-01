package com.example.amit.android_charts;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


// *****************************************Horizontal Bar Chart***************
        HorizontalBarChart barChart = (HorizontalBarChart) findViewById(R.id.chart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4f, 0));
        entries.add(new BarEntry(8f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(12f, 3));
        entries.add(new BarEntry(18f, 4));
        entries.add(new BarEntry(9f, 5));

        BarDataSet dataset = new BarDataSet(entries, "# of Calls");


        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");

        BarData data = new BarData(labels, dataset);
        barChart.setData(data);

        //barChart.setDescription("Number of tweets");
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.animateY(5000);

        //*******************************Pie hart***********************************


        PieChart pieChart = (PieChart) findViewById(R.id.chart1);

        ArrayList<Entry> entries1 = new ArrayList<>();
        entries1.add(new Entry(4f, 0));
        entries1.add(new Entry(8f, 1));
        entries1.add(new Entry(6f, 2));
        entries1.add(new Entry(12f, 3));
        entries1.add(new Entry(18f, 4));
        entries1.add(new Entry(9f, 5));
        PieDataSet dataset1 = new PieDataSet(entries1, "# of Calls");

        PieData data1 = new PieData(labels, dataset1); // initialize Piedata
        pieChart.setData(data1); //set data into chart

        //pieChart.setDescription("Description");

        dataset1.setColors(ColorTemplate.COLORFUL_COLORS);
        pieChart.animateY(5000);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
