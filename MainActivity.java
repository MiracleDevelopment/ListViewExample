package com.dev.ipati.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_item_example);
        ArrayList<String> nameExample = new ArrayList<>();
        nameExample.add("adapter1");
        nameExample.add("adapter2");
        nameExample.add("adapter3");
        nameExample.add("adapter4");
        nameExample.add("adapter5");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, nameExample);
        listView.setAdapter(adapter);
    }
}
