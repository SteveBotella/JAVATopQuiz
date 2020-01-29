package com.steve.topquiz.Controller;
//=MainFragment

import android.app.Activity;
import android.os.Bundle;
import android.service.autofill.Dataset;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.steve.topquiz.R;
import com.steve.topquiz.View.TopUserAdapter;

public class TopActivity extends Activity {
    // TODO Faire de cette classe une activité
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        recyclerView = (RecyclerView) findViewById(R.id.activity_top_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        mAdapter = new TopUserAdapter(myDataset);//Vérifier la valeur Dataset ! ! !
        recyclerView.setAdapter(mAdapter);
    }

    // TODO SetContentView
    // TODO Récupérer la list(TopUsers) depuis mPreferences
    // TODO Donner cette list à TopUserAdapter
    // TODO Donner l'Adapter au recycler view
}
