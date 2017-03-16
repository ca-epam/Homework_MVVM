package com.example.adrian.recyclerviewexample;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.adrian.recyclerviewexample.databinding.ListItemSampledataBinding;
import com.example.adrian.recyclerviewexample.model.SampleDataViewModel;

import java.util.List;

/**
 * Created by Adrian_Czigany on 3/14/2017.
 */

public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.SampleDataHolder> {

    private List<SampleDataViewModel> list;

    public SampleAdapter(List<SampleDataViewModel> list) {
        this.list = list;
    }

    @Override
    public SampleDataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
//        View statusContainer = layoutInflater.inflate(R.layout.list_item_sampledata, parent, false);
        ListItemSampledataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item_sampledata, parent, false);
        return new SampleDataHolder(binding);
    }

    @Override
    public void onBindViewHolder(SampleDataHolder holder, int position) {
        SampleDataViewModel status = list.get(position);
        holder.bind(status);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class SampleDataHolder extends RecyclerView.ViewHolder {

        private final ListItemSampledataBinding binding;

//        public SampleDataHolder(View view) {
//            super(view);
//            binding = DataBindingUtil.bind(view);
//        }

        public SampleDataHolder(ListItemSampledataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(SampleDataViewModel sampleDataViewModel) {
            binding.setSampleViewModel(sampleDataViewModel);
            binding.executePendingBindings();
            Log.i("asd", sampleDataViewModel.toString());
        }
    }
}
