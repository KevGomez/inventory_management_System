package com.codefour.uee.RepotgenetorFragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.codefour.uee.R;
import com.codefour.uee.ShowReport;

public class RepotGenerateLostFragmnet extends Fragment {
    String TAG= this.getClass().getName();

    ListView listview;
    ArrayAdapter adapter;

    String[] detailsArray =
            {
                    "Profit/Lost report 2020-09-20","Profit/Lost report 2020-10-4",
                    "Profit/Lost report 2020-09-25","Profit/Lost report 2020-10-4",
                    "Profit/Lost report 2020-09-30","Profit/Lost report 2020-10-4",
                    "Profit/Lost report 2020-10-9","Profit/Lost report 2020-10-4",
                    "Profit/Lost report 2020-10-14","Profit/Lost report 2020-10-19",
                    "Profit/Lost report 2020-10-24","Profit/Lost report 2021-10-30",
                    "Profit/Lost report 2020-09-30","Profit/Lost report 2020-10-4",
                    "Profit/Lost report 2020-10-9","Profit/Lost report 2020-10-4",
                    "Profit/Lost report 2020-10-14","Lost report 2020-10-19",
                    "Profit/Lost report 2020-10-24","Profit/Lost report 2022-10-30",
            };
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.repotlostfragment,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adapter = new ArrayAdapter<String>(view.getContext(),
                R.layout.activity_listview, detailsArray);
        listview=view.findViewById(R.id.listview);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i(TAG,"Item click");
                Intent intent =new Intent(getContext(), ShowReport.class);
                startActivity(intent);
            }
        });
    }
}
