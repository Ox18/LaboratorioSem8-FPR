package com.example.fprappseman8;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchText = (EditText)findViewById(R.id.searchText);
    }

    public void Ver(View view){
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("url", searchText.getText().toString());
        startActivity(i);
    }
}
