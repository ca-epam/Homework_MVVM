package com.example.adrian.recyclerviewexample.model;

import android.databinding.ObservableField;

/**
 * Created by Adrian_Czigany on 3/14/2017.
 */

public class SampleDataViewModel {

    public int id;
    public String text1;
    public final ObservableField<String> text2;

    public SampleDataViewModel(int id, String text1, ObservableField<String> text2) {
        this.id = id;
        this.text1 = text1;
        this.text2 = text2;
    }

    @Override
    public String toString() {
        return "SampleDataViewModel{" +
                "id=" + id +
                ", text1='" + text1 + '\'' +
                ", text2='" + text2 + '\'' +
                '}';
    }
}
