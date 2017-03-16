package com.example.adrian.recyclerviewexample.jsonplaceholder.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.adrian.recyclerviewexample.R;
import com.example.adrian.recyclerviewexample.SampleAdapter;
import com.example.adrian.recyclerviewexample.TestData;
import com.example.adrian.recyclerviewexample.model.SampleDataViewModel;

import java.util.List;

public class JsonPlaceholderApiActivity extends AppCompatActivity implements JsonPlaceholderApiView {

    private RecyclerView rvSampleDataList;
    private SampleAdapter sampleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSampleDataList = (RecyclerView) findViewById(R.id.rvSampleDataList);
        rvSampleDataList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        updateUI();
    }

    @Override
    public void onResume() {
        super.onResume();
//        updateUI();
    }

    private void updateUI() {
        List<SampleDataViewModel> list = TestData.getTestData();
        if(sampleAdapter == null) {
            sampleAdapter = new SampleAdapter(list);
        }
        rvSampleDataList.setAdapter(sampleAdapter);

    }
}
