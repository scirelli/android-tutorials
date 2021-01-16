package org.cirelli.steve.test.expandablerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public TagListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        adapter = new TagListAdapter(Arrays.asList(
                new TagDataGroup("My Names", Arrays.asList(
                        new PString("Steve Cirelli"),
                        new PString("Tinman"),
                        new PString("Jerinaw")
                    )
                )
            ));
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        Button clear = (Button) findViewById(R.id.toggle_button);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.toggleGroup(
                    new TagDataGroup("My Names", Arrays.asList(
                            new PString("Steve Cirelli"),
                            new PString("Tinman"),
                            new PString("Jerinaw")
                        )
                    )
                );
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        adapter.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        adapter.onRestoreInstanceState(savedInstanceState);
    }
}
