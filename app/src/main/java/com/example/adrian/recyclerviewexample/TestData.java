package com.example.adrian.recyclerviewexample;

import android.databinding.ObservableField;

import com.example.adrian.recyclerviewexample.model.SampleDataViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian_Czigany on 3/14/2017.
 */

public class TestData {

    public static List<SampleDataViewModel> getTestData() {
        List<SampleDataViewModel> list = new ArrayList<SampleDataViewModel>();
//        list.add(new SampleDataViewModel(1, "test1", "test1"));
//        list.add(new SampleDataViewModel(2, "test2", "test2"));
//        list.add(new SampleDataViewModel(3, "test3", "test3"));
//        list.add(new SampleDataViewModel(4, "test4", "test4"));
//        list.add(new SampleDataViewModel(5, "test5", "test5"));
//        list.add(new SampleDataViewModel(6, "test6", "test6"));

        list.add(new SampleDataViewModel(1, "test1", new ObservableField<String>("test1")));
        list.add(new SampleDataViewModel(2, "test2", new ObservableField<String>("test2")));
        list.add(new SampleDataViewModel(3, "test3", new ObservableField<String>("test3")));
        list.add(new SampleDataViewModel(4, "test4", new ObservableField<String>("test4")));
        list.add(new SampleDataViewModel(5, "test5", new ObservableField<String>("test5")));
        list.add(new SampleDataViewModel(6, "test6", new ObservableField<String>("test6")));
        return list;
    }

}
